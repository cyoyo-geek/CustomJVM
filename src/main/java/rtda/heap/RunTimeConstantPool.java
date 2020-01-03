package rtda.heap;

import classfile.constantpool.ConstantInfo;
import classfile.constantpool.ConstantPool;
import classfile.constantpool.*;
import rtda.heap.Class;

/**
 * 运行时常量池
 */
public class RunTimeConstantPool {

    private Class clazz;
    private java.lang.Object[] constants;

    public RunTimeConstantPool(Class clazz, ConstantPool constantPool) {
        int cpCount = constantPool.getConstantInfos().length;
        this.clazz = clazz;
        this.constants = new java.lang.Object[cpCount];

        ConstantInfo[] constantInfos = constantPool.getConstantInfos();
        for (int i = 1; i < cpCount; i++) {
            ConstantInfo constantInfo = constantInfos[i];

            switch (constantInfo.tag()) {
                case ConstantInfo.CONST_TAG_INTEGER:
                    ConstantIntegerInfo integerInfo = (ConstantIntegerInfo) constantInfo;
                    this.constants[i] = integerInfo.value();
                    break;
                case ConstantInfo.CONST_TAG_FLOAT:
                    ConstantFloatInfo floatInfo = (ConstantFloatInfo) constantInfo;
                    this.constants[i] = floatInfo.value();
                    break;
                case ConstantInfo.CONST_TAG_LONG:
                    ConstantLongInfo longInfo = (ConstantLongInfo) constantInfo;
                    this.constants[i] = longInfo.value();
                    i++;
                    break;
                case ConstantInfo.CONST_TAG_DOUBLE:
                    ConstantDoubleInfo doubleInfo = (ConstantDoubleInfo) constantInfo;
                    this.constants[i] = doubleInfo.value();
                    i++;
                    break;
                case ConstantInfo.CONST_TAG_STRING:
                    ConstantStringInfo stringInfo = (ConstantStringInfo) constantInfo;
                    this.constants[i] = stringInfo.string();
                    break;
                case ConstantInfo.CONST_TAG_CLASS:
                    ConstantClassInfo classInfo = (ConstantClassInfo) constantInfo;
                    this.constants[i] = ClassRef.newClassRef(this, classInfo);
                    break;
                case ConstantInfo.CONST_TAG_FIELD_REF:
                    this.constants[i] = FieldRef.newFieldRef(this, (ConstantFieldRefInfo) constantInfo);
                    break;
                case ConstantInfo.CONST_TAG_INTERFACE_MTTHOD_REF:
                    this.constants[i] = InterfaceMethodRef.newInterfaceMethodRef(this, (ConstantInterfaceMethodRefInfo) constantInfo);
                    break;
                case ConstantInfo.CONST_TAG_METHOD_REF:
                    this.constants[i] = MethodRef.newMethodRef(this, (ConstantMethodInfo) constantInfo);
                    break;
                default:
            }
        }
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    public java.lang.Object getConstants(int idx) {
        return constants[idx];
    }

}
