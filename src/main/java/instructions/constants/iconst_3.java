package instructions.constants;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;

public class iconst_3 extends NoOperandsInstruction {

    @Override
    public int getOpCode() {
        return 0x06;
    }

    @Override
    public String getReName() {
        return "iconst_3";
    }

    @Override
    public void execute(Frame frame) throws Exception {
        frame.getOperandStack().pushInt(3);
    }
}
