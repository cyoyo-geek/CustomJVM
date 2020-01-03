package instructions.stores;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;

public class fstore_0 extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0x43;
    }

    @Override
    public void execute(Frame frame) {
        float val = frame.getOperandStack().popFloat();
        frame.getLocalVars().setFloat(0, val);
    }
}
