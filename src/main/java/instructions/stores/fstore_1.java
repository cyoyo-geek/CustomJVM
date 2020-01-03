package instructions.stores;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;

public class fstore_1 extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0x44;
    }

    @Override
    public void execute(Frame frame) {
        float val = frame.getOperandStack().popFloat();
        frame.getLocalVars().setFloat(1, val);
    }
}
