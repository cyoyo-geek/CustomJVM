package instructions.conversions;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;
import rtda.OperandStack;

public class i2f extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0x86;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        OperandStack operandStack = frame.getOperandStack();
        operandStack.pushFloat(operandStack.popInt());
    }
}
