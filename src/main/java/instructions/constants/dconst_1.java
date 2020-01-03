package instructions.constants;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;

public class dconst_1 extends NoOperandsInstruction {

    @Override
    public int getOpCode() {
        return 0x0f;
    }

    @Override
    public String getReName() {
        return "dconst_1";
    }

    @Override
    public void execute(Frame frame) throws Exception {
        frame.getOperandStack().pushDouble(1.0d);
    }
}
