package instructions.stores;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;

public class lstore_2 extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0x41;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        long val = frame.getOperandStack().popLong();
        frame.getLocalVars().setLong(2, val);
    }
}
