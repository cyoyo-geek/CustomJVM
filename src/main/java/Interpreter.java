import classfile.attributes.CodeAttribute;
import instructions.base.BytecodeReader;
import instructions.base.Instruction;
import instructions.base.InstructionFactory;
import rtda.Frame;
import rtda.Thread;

/**

 */
public class Interpreter {


    public static void execute(CodeAttribute code) throws Exception {
        int maxStack = code.getMaxStack();
        int maxLocals = code.getMaxLocals();
        byte[] byteCode = code.getCode();
        Thread thread = new Thread(maxStack);
        Frame frame = new Frame(thread, maxLocals, maxStack);
        thread.pushFrame(frame);
        loop(thread, byteCode);
    }

    public static void loop(Thread thread, byte[] byteCode) throws Exception {
        Frame frame = thread.popFrame();
        BytecodeReader reader = new BytecodeReader(byteCode, frame.getNextPc());
        int opcode;
        do {
            int pc = frame.getNextPc();
            thread.setPc(pc);
            System.out.print("pc:" + reader.getPc());
            reader.reset(byteCode, pc);
            opcode = reader.read8();
            if(opcode == 178) { break; }
            System.out.print("    opcode:" + opcode);
            Instruction instruction = InstructionFactory.getByOpcode(opcode);
            instruction.fetchOperands(reader);
            frame.setNextPc(reader.getPc());
            instruction.execute(frame);
            System.out.print("   op:" + instruction.getReName());
            System.out.println("   localVars:" + frame.getLocalVars());
        } while (opcode != 0xb1);

    }
}
