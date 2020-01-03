package instructions.constants;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;

public class nop extends NoOperandsInstruction {


    @Override
    public int getOpCode() {
        return 0x00;
    }

    @Override
    public String getReName() {
        return "nop";
    }

    @Override
    public void execute(Frame frame) {

    }
}
