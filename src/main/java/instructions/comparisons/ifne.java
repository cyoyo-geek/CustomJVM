package instructions.comparisons;

import instructions.base.BranchInstruction;
import rtda.Frame;
import rtda.OperandStack;

public class ifne extends BranchInstruction {
    @Override
    public int getOpCode() {
        return 0x9a;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        OperandStack operandStack = frame.getOperandStack();
        int i = operandStack.popInt();
        if (i != 0) {
            branch(frame,offset);
        }
    }
}
