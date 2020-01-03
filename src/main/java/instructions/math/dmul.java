package instructions.math;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;
import rtda.OperandStack;

public class dmul extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0x6b;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        OperandStack operandStack = frame.getOperandStack();
        double v2 = operandStack.popDouble();
        double v1 = operandStack.popDouble();
        operandStack.pushDouble(v1 * v2);
    }
}
