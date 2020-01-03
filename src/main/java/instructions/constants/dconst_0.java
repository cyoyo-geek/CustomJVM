package instructions.constants;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;

public class dconst_0 extends NoOperandsInstruction {

    @Override
    public int getOpCode() {
        return 0x0e;
    }

    @Override
    public String getReName() {
        return "dconst_0";
    }

    @Override
    public void execute(Frame frame) throws Exception {
        frame.getOperandStack().pushDouble(0.0d);
    }
}
