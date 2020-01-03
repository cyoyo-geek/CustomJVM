package instructions.conversions;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;
import rtda.OperandStack;

public class l2f extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0x89;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        OperandStack operandStack = frame.getOperandStack();
        operandStack.pushFloat((float)operandStack.popLong());
    }
}
