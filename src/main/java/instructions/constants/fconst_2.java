package instructions.constants;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;

public class fconst_2 extends NoOperandsInstruction {

    @Override
    public int getOpCode() {
        return 0x0d;
    }

    @Override
    public String getReName() {
        return "fconst_2";
    }

    @Override
    public void execute(Frame frame) throws Exception {
        frame.getOperandStack().pushFloat(2.0f);
    }
}
