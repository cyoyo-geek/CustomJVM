package rtda;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Frame {

    private Frame lower;

    //局部变量表
    private LocalVars localVars;
    //操作数栈指针
    private OperandStack operandStack;

    private Thread thread;

    private int nextPc;

    public Frame(Thread thread, int maxLocals, int maxStack) {
        this.thread = thread;
        this.localVars = new LocalVars(maxLocals);
        this.operandStack = new OperandStack(maxStack);
    }

}
