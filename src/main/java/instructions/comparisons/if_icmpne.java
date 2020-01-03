package instructions.comparisons;

import instructions.base.BranchInstruction;
import rtda.Frame;
import rtda.OperandStack;

public class if_icmpne extends BranchInstruction {
    @Override
    public int getOpCode() {
        return 0xa0;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        OperandStack operandStack = frame.getOperandStack();
        int v2 = operandStack.popInt();
        int v1 = operandStack.popInt();
        if (v2 != v1) {
            branch(frame,offset);
        }
    }
}
