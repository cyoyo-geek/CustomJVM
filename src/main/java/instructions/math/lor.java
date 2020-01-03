package instructions.math;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;
import rtda.OperandStack;

public class lor extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0x81;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        OperandStack operandStack = frame.getOperandStack();
        long v2 = operandStack.popLong();
        long v1 = operandStack.popLong();
        operandStack.pushLong(v1 | v2);
    }
}
