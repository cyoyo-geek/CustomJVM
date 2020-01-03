package instructions.conversions;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;
import rtda.OperandStack;

public class l2i extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0x88;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        OperandStack operandStack = frame.getOperandStack();
        operandStack.pushInt((int)operandStack.popLong());
    }
}
