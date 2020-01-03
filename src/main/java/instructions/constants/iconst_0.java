package instructions.constants;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;

public class iconst_0 extends NoOperandsInstruction {

    @Override
    public int getOpCode() {
        return 0x03;
    }

    @Override
    public String getReName() {
        return "iconst_0";
    }

    @Override
    public void execute(Frame frame) throws Exception {
        frame.getOperandStack().pushInt(0);
    }
}
