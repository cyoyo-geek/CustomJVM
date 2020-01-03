package instructions.loads;

import instructions.base.Index8Instruction;
import rtda.Frame;

import java.lang.ref.Reference;

public class aload extends Index8Instruction {
    @Override
    public int getOpCode() {
        return 0x19;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        Reference ref = frame.getLocalVars().getRef(index);
        frame.getOperandStack().pushRef(ref);
    }
}
