package instructions.loads;

import instructions.base.Index8Instruction;
import rtda.Frame;

public class fload_1 extends Index8Instruction {
    @Override
    public int getOpCode() {
        return 0x23;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        float val = frame.getLocalVars().getFloat(1);
        frame.getOperandStack().pushFloat(val);
    }
}
