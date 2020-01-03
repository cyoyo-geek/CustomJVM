package instructions.constants;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;

public class fconst_1 extends NoOperandsInstruction {

    @Override
    public int getOpCode() {
        return 0x0c;
    }

    @Override
    public String getReName() {
        return "fconst_1";
    }

    @Override
    public void execute(Frame frame) throws Exception {
        frame.getOperandStack().pushFloat(1.0f);
    }
}
