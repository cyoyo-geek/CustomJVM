package instructions.control;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;

public class dreturn extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0xaf;
    }

    @Override
    public void execute(Frame frame) throws Exception {

    }
}
