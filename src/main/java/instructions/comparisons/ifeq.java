package instructions.comparisons;

import instructions.base.BranchInstruction;
import rtda.Frame;
import rtda.OperandStack;

public class ifeq extends BranchInstruction {
    @Override
    public int getOpCode() {
        return 0x99;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        OperandStack operandStack = frame.getOperandStack();
        int i = operandStack.popInt();
        if (i == 0) {
            branch(frame,offset);
        }
    }
}
