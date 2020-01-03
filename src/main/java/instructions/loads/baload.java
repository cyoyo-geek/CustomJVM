package instructions.loads;

import instructions.base.Index8Instruction;
import rtda.Frame;

public class baload extends Index8Instruction {
    @Override
    public int getOpCode() {
        return 0x33;
    }

    @Override
    public void execute(Frame frame) {

    }
}
