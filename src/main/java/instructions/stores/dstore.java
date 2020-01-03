package instructions.stores;

import instructions.base.Index8Instruction;
import rtda.Frame;

public class dstore extends Index8Instruction {
    @Override
    public int getOpCode() {
        return 0x39;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        double val = frame.getOperandStack().popDouble();
        frame.getLocalVars().setDouble(index, val);
    }
}
