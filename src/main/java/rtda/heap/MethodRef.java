package rtda.heap;

import classfile.constantpool.ConstantMethodInfo;
import rtda.heap.Method;

public class MethodRef extends MemberRef {

    private Method method;

    public static MethodRef newMethodRef(RunTimeConstantPool runTimeConstantPool, ConstantMethodInfo refInfo){
       MethodRef ref = new MethodRef();
       ref.runTimeConstantPool = runTimeConstantPool;
       ref.copyMemberRefInfo(refInfo);
       return ref;
    }

    public Method ResolvedMethod(){
        if (null == this.method){
            this.resolveMethodRef();
        }
        return this.method;
    }

    private void resolveMethodRef() {

    }

}
