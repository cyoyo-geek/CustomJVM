package instructions.stores;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;

public class istore_3 extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0x3e;
    }

    @Override
    public void execute(Frame frame) {
        int val = frame.getOperandStack().popInt();
        frame.getLocalVars().setInt(3, val);
    }
}
