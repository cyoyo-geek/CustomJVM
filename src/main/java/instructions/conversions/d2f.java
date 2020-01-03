package instructions.conversions;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;
import rtda.OperandStack;

public class d2f extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0x90;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        OperandStack operandStack = frame.getOperandStack();
        operandStack.pushFloat((float) operandStack.popDouble());
    }
}
