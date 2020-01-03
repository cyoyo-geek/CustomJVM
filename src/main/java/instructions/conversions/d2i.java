package instructions.conversions;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;
import rtda.OperandStack;

public class d2i extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0x8e;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        OperandStack operandStack = frame.getOperandStack();
        operandStack.pushFloat((int) operandStack.popDouble());
    }
}
