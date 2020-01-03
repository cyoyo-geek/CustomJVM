package rtda.heap;

import classfile.MemberInfo;
import classfile.attributes.CodeAttribute;
import rtda.heap.AccessFlags;

public class Method extends ClassMember {

    public int maxStack;
    public int maxLocals;
    public byte[] code;

    public Method[] newMethods(Class clazz, MemberInfo[] cfMethods) {
        Method[] methods = new Method[cfMethods.length];
        for (int i = 0; i < cfMethods.length; i++) {
            methods[i] = new Method();
            methods[i].clazz = clazz;
            methods[i].copyMemberInfo(cfMethods[i]);
            methods[i].copyAttributes(cfMethods[i]);
        }
        return methods;
    }

    public void copyAttributes(MemberInfo cfMethod) {
        CodeAttribute codeAttr = cfMethod.getCodeAttribute();
        if (null != codeAttr) {
            this.maxStack = codeAttr.getMaxStack();
            this.maxLocals = codeAttr.getMaxLocals();
            this.code = codeAttr.getCode();
        }
    }

    public boolean isSynchronized() {
        return 0 != (this.accessFlags & AccessFlags.ACC_SYNCHRONIZED);
    }

    public boolean isBridge() {
        return 0 != (this.accessFlags & AccessFlags.ACC_BRIDGE);
    }

    public boolean isVarargs() {
        return 0 != (this.accessFlags & AccessFlags.ACC_VARARGS);
    }

    public boolean isNative() {
        return 0 != (this.accessFlags & AccessFlags.ACC_NATIVE);
    }

    public boolean isAbstract() {
        return 0 != (this.accessFlags & AccessFlags.ACC_ABSTRACT);
    }

    public boolean isStrict() {
        return 0 != (this.accessFlags & AccessFlags.ACC_STRICT);
    }

    public int maxStack() {
        return this.maxStack;
    }

    public int maxLocals() {
        return this.maxLocals;
    }

    public byte[] code() {
        return this.code;
    }

}
