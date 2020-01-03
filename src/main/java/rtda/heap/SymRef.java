package rtda.heap;

import org.itstack.demo.jvm.rtda.heap.methodarea.Class;

public class SymRef {

    public RunTimeConstantPool runTimeConstantPool;
    public String className;
    public java.lang.Class clazz;

    public java.lang.Class resolvedClass() {
        if (null != this.clazz) return this.clazz;
        java.lang.Class d = this.runTimeConstantPool.getClazz();
        java.lang.Class c = d.loader.loadClass(this.className);;
        this.clazz = c;
        return this.clazz;
    }

}
