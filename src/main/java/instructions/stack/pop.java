package instructions.stack;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;

public class pop extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0x57;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        frame.getOperandStack().popSlot();
    }
}
