package instructions.stack;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;
import rtda.OperandStack;
import rtda.Slot;

public class dup extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0x59;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        OperandStack operandStack = frame.getOperandStack();
        Slot slot = operandStack.popSlot();
        operandStack.pushSlot(slot);
        operandStack.pushSlot(slot);
    }
}
