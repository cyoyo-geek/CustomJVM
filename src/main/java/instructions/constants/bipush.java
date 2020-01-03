package instructions.constants;

import instructions.base.BytecodeReader;
import instructions.base.NoOperandsInstruction;
import rtda.Frame;

public class bipush extends NoOperandsInstruction {

    private int val;

    @Override
    public int getOpCode() {
        return 0x10;
    }

    @Override
    public String getReName() {
        return "bipush";
    }

    @Override
    public void fetchOperands(BytecodeReader reader) {
        val = reader.read8();
    }

    @Override
    public void execute(Frame frame) throws Exception {
        frame.getOperandStack().pushInt(val);
    }
}
