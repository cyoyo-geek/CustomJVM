package instructions.loads;

import instructions.base.Index8Instruction;
import rtda.Frame;

public class laload extends Index8Instruction {
    @Override
    public int getOpCode() {
        return 0x2f;
    }

    @Override
    public void execute(Frame frame) {

    }
}
