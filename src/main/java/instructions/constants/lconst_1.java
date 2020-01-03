package instructions.constants;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;

public class lconst_1 extends NoOperandsInstruction {

    @Override
    public int getOpCode() {
        return 0x0a;
    }

    @Override
    public String getReName() {
        return "lconst_1";
    }

    @Override
    public void execute(Frame frame) throws Exception {
        frame.getOperandStack().pushLong(1);
    }
}
