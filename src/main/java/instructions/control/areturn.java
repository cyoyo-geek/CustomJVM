package instructions.control;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;

public class areturn extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0xb0;
    }

    @Override
    public void execute(Frame frame) throws Exception {

    }
}
