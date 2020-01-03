package instructions.constants;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;

public class ldc extends NoOperandsInstruction {

    @Override
    public int getOpCode() {
        return 0x12;
    }

    @Override
    public String getReName() {
        return "ldc";
    }

    @Override
    public void execute(Frame frame) {
    }
}
