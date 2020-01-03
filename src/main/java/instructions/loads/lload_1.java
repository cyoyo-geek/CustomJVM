package instructions.loads;

import instructions.base.Index8Instruction;
import rtda.Frame;

public class lload_1 extends Index8Instruction {
    @Override
    public int getOpCode() {
        return 0x1f;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        long val = frame.getLocalVars().getLong(1);
        frame.getOperandStack().pushLong(val);
    }
}
