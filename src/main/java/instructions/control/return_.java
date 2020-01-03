package instructions.control;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;

public class return_ extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0xb1;
    }

    @Override
    public void execute(Frame frame) throws Exception {

    }
}
