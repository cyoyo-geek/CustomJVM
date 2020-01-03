package instructions.extended;

import instructions.base.BranchInstruction;
import instructions.base.BytecodeReader;
import rtda.Frame;

public class gotow extends BranchInstruction {

    @Override
    public int getOpCode() {
        return 0xc8;
    }

    @Override
    public void fetchOperands(BytecodeReader reader) throws Exception {
        offset = reader.read32();
    }

    @Override
    public void execute(Frame frame) throws Exception {
        branch(frame, offset);
    }
}
