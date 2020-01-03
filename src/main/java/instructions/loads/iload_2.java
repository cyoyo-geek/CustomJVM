package instructions.loads;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;

public class iload_2 extends NoOperandsInstruction {

    @Override
    public int getOpCode() {
        return 0x1c;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        int val = frame.getLocalVars().getInt(2);
        frame.getOperandStack().pushInt(val);
    }
}
