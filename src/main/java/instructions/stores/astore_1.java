package instructions.stores;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;

import java.lang.ref.Reference;

public class astore_1 extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0x4c;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        Reference val = frame.getOperandStack().popRef();
        frame.getLocalVars().setRef(1, val);
    }
}
