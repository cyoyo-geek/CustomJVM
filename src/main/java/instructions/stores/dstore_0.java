package instructions.stores;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;

public class dstore_0 extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0x47;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        double val = frame.getOperandStack().popDouble();
        frame.getLocalVars().setDouble(0, val);
    }
}
