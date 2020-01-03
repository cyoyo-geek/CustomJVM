package instructions.constants;

import instructions.base.BytecodeReader;
import instructions.base.NoOperandsInstruction;
import rtda.Frame;

public class sipush extends NoOperandsInstruction {

    private int val;

    @Override
    public int getOpCode() {
        return 0x11;
    }

    @Override
    public String getReName() {
        return "sipush";
    }

    @Override
    public void fetchOperands(BytecodeReader reader) {
        val = reader.read16();
    }

    @Override
    public void execute(Frame frame) throws Exception {
        frame.getOperandStack().pushInt(val);
    }
}
