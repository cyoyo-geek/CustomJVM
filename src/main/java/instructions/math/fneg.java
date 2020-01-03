package instructions.math;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;
import rtda.OperandStack;

public class fneg extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0x76;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        OperandStack operandStack = frame.getOperandStack();
        operandStack.pushFloat(operandStack.popFloat() * -1);
    }
}
