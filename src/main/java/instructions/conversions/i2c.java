package instructions.conversions;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;
import rtda.OperandStack;

public class i2c extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0x92;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        OperandStack operandStack = frame.getOperandStack();
        operandStack.pushInt(operandStack.popInt());
    }
}
