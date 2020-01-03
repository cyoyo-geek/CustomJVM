package instructions.stack;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;
import rtda.OperandStack;
import rtda.Slot;

public class dup2 extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0x5c;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        OperandStack operandStack = frame.getOperandStack();
        Slot slot1 = operandStack.popSlot();
        Slot slot2 = operandStack.popSlot();
        operandStack.pushSlot(slot2);
        operandStack.pushSlot(slot1);
        operandStack.pushSlot(slot2);
        operandStack.pushSlot(slot1);
    }
}
