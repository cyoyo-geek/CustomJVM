package instructions.loads;

import instructions.base.Index8Instruction;
import rtda.Frame;

public class lload_0 extends Index8Instruction {
    @Override
    public int getOpCode() {
        return 0x1e;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        long val = frame.getLocalVars().getLong(0);
        frame.getOperandStack().pushLong(val);
    }
}
