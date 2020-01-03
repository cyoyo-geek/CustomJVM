package instructions.stack;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;
import rtda.OperandStack;

public class pop2 extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0x58;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        OperandStack operandStack = frame.getOperandStack();
        operandStack.popSlot();
        operandStack.popSlot();
    }
}
