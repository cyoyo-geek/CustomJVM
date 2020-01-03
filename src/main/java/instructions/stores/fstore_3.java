package instructions.stores;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;

public class fstore_3 extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0x46;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        float val = frame.getOperandStack().popFloat();
        frame.getLocalVars().setFloat(3, val);
    }
}
