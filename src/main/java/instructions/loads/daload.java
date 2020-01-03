package instructions.loads;

import instructions.base.Index8Instruction;
import rtda.Frame;

public class daload extends Index8Instruction {
    @Override
    public int getOpCode() {
        return 0x31;
    }

    @Override
    public void execute(Frame frame) {

    }
}
