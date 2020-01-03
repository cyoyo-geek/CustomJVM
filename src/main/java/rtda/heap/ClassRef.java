package rtda.heap;

import classfile.constantpool.ConstantClassInfo;

public class ClassRef extends SymRef {

    public static ClassRef newClassRef(RunTimeConstantPool runTimeConstantPool, ConstantClassInfo classInfo) {
        ClassRef ref = new ClassRef();
        ref.runTimeConstantPool = runTimeConstantPool;
        ref.className = classInfo.name();
        return ref;
    }

}
