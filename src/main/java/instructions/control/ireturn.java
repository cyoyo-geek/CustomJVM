package instructions.control;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;

public class ireturn extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0xac;
    }

    @Override
    public void execute(Frame frame) throws Exception {

    }
}
