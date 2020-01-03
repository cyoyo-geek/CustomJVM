package instructions.constants;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;

public class iconst_4 extends NoOperandsInstruction {

    @Override
    public int getOpCode() {
        return 0x07;
    }

    @Override
    public String getReName() {
        return "iconst_4";
    }

    @Override
    public void execute(Frame frame) throws Exception {
        frame.getOperandStack().pushInt(4);
    }
}
