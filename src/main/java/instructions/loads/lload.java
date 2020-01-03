package instructions.loads;

import instructions.base.Index8Instruction;
import rtda.Frame;

public class lload extends Index8Instruction {
    @Override
    public int getOpCode() {
        return 0x16;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        long val = frame.getLocalVars().getLong(index);
        frame.getOperandStack().pushLong(val);
    }
}
