package instructions.comparisons;

import instructions.base.BranchInstruction;
import rtda.Frame;
import rtda.OperandStack;

import java.lang.ref.Reference;

public class if_acmpeq extends BranchInstruction {
    @Override
    public int getOpCode() {
        return 0xa5;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        OperandStack operandStack = frame.getOperandStack();
        Reference v2 = operandStack.popRef();
        Reference v1 = operandStack.popRef();
        if (v2.equals(v1)) {
            branch(frame,offset);
        }
    }
}
