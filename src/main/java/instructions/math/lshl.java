package instructions.math;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;
import rtda.OperandStack;

/**

 */
public class lshl extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0x79;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        OperandStack operandStack = frame.getOperandStack();
        long v2 = operandStack.popLong();
        long v1 = operandStack.popLong();
        long s = v2 & 0x3f;
        operandStack.pushLong(v1 << s);
    }
}
