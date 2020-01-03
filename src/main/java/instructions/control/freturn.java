package instructions.control;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;

public class freturn extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0xae;
    }

    @Override
    public void execute(Frame frame) throws Exception {

    }
}
