package instructions.math;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;
import rtda.OperandStack;

public class dneg extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0x77;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        OperandStack operandStack = frame.getOperandStack();
        operandStack.pushDouble(operandStack.popDouble() * -1);
    }
}
