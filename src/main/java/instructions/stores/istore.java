package instructions.stores;

import instructions.base.Index8Instruction;
import rtda.Frame;

public class istore extends Index8Instruction {
    @Override
    public int getOpCode() {
        return 0x36;
    }

    @Override
    public void execute(Frame frame) {
        int val = frame.getOperandStack().popInt();
        frame.getLocalVars().setInt(index, val);
    }
}
