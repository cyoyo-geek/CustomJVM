package instructions.math;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;
import rtda.OperandStack;

public class fadd extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0x62;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        OperandStack operandStack = frame.getOperandStack();
        float v2 = operandStack.popFloat();
        float v1 = operandStack.popFloat();
        operandStack.pushFloat(v1 + v2);
    }
}
