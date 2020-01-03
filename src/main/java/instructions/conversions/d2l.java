package instructions.conversions;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;
import rtda.OperandStack;

public class d2l extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0x8f;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        OperandStack operandStack = frame.getOperandStack();
        operandStack.pushLong((long) operandStack.popDouble());
    }
}
