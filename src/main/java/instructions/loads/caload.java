package instructions.loads;

import instructions.base.Index8Instruction;
import rtda.Frame;

public class caload extends Index8Instruction {
    @Override
    public int getOpCode() {
        return 0x34;
    }

    @Override
    public void execute(Frame frame) {

    }
}
