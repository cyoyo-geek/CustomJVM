package instructions.math;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;
import rtda.OperandStack;

public class dadd extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0x63;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        OperandStack operandStack = frame.getOperandStack();
        double v2 = operandStack.popDouble();
        double v1 = operandStack.popDouble();
        operandStack.pushDouble(v1 + v2);
    }
}
