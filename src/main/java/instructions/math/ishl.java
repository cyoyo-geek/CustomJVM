package instructions.math;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;
import rtda.OperandStack;

/**

 */
public class ishl extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0x78;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        OperandStack operandStack = frame.getOperandStack();
        int v2 = operandStack.popInt();
        int v1 = operandStack.popInt();
        int s = v2 & 0x1f;
        operandStack.pushInt(v1 << s);
    }
}
