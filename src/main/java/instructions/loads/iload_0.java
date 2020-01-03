package instructions.loads;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;

public class iload_0 extends NoOperandsInstruction {

    @Override
    public int getOpCode() {
        return 0x1a;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        int val = frame.getLocalVars().getInt(0);
        frame.getOperandStack().pushInt(val);
    }
}
