package instructions.loads;

import instructions.base.Index8Instruction;
import rtda.Frame;

public class saload extends Index8Instruction {
    @Override
    public int getOpCode() {
        return 0x35;
    }

    @Override
    public void execute(Frame frame) {

    }
}
