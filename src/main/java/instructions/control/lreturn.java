package instructions.control;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;

public class lreturn extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0xad;
    }

    @Override
    public void execute(Frame frame) throws Exception {

    }
}
