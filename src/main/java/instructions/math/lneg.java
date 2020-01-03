package instructions.math;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;
import rtda.OperandStack;

public class lneg extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0x75;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        OperandStack operandStack = frame.getOperandStack();
        operandStack.pushLong(operandStack.popLong() * -1);
    }
}
