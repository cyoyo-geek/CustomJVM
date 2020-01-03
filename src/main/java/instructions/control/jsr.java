package instructions.control;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;

public class jsr extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0xa8;
    }

    @Override
    public void execute(Frame frame) throws Exception {

    }
}
