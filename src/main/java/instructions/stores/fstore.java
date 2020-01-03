package instructions.stores;

import instructions.base.Index8Instruction;
import rtda.Frame;

public class fstore extends Index8Instruction {
    @Override
    public int getOpCode() {
        return 0x38;
    }

    @Override
    public void execute(Frame frame) {
        float val = frame.getOperandStack().popFloat();
        frame.getLocalVars().setFloat(index, val);
    }
}
