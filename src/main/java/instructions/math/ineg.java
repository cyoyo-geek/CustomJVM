package instructions.math;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;
import rtda.OperandStack;

public class ineg extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0x74;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        OperandStack operandStack = frame.getOperandStack();
        operandStack.pushInt(operandStack.popInt() * -1);
    }
}
