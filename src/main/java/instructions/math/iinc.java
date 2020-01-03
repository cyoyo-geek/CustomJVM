package instructions.math;

import instructions.base.BytecodeReader;
import instructions.base.Index8Instruction;
import lombok.Setter;
import rtda.Frame;
import rtda.LocalVars;

public class iinc extends Index8Instruction {

    @Setter
    private int constVal;

    @Override
    public int getOpCode() {
        return 0x84;
    }

    @Override
    public void fetchOperands(BytecodeReader reader) {
        this.index = reader.read8();
        this.constVal = reader.read8();
    }

    @Override
    public void execute(Frame frame) throws Exception {
        LocalVars localVars = frame.getLocalVars();
        int val = localVars.getInt(index);
        val += constVal;
        localVars.setInt(index, val);
    }
}
