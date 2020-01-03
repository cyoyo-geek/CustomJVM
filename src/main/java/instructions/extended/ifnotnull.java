package instructions.extended;

import instructions.base.BranchInstruction;
import rtda.Frame;
import rtda.OperandStack;

import java.lang.ref.Reference;

public class ifnotnull extends BranchInstruction {
    @Override
    public int getOpCode() {
        return 0xc7;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        OperandStack operandStack = frame.getOperandStack();
        Reference reference = operandStack.popRef();
        if (reference.get() != null) {
            branch(frame,offset);
        }
    }
}
