package instructions.control;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;

public class ret extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0xa9;
    }

    @Override
    public void execute(Frame frame) throws Exception {

    }
}
