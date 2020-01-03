package classfile.constantpool;

import classfile.ClassReader;

public class ConstantStringInfo implements ConstantInfo {

    private ConstantPool constPool;
    private int nameIndex;

    public ConstantStringInfo(ConstantPool aConstPool, ClassReader reader) {
        this.nameIndex = reader.nextU2ToInt();
        this.constPool = aConstPool;
    }

    @Override
    public String getValue() {
        return this.constPool.getUTF8(this.nameIndex);
    }

    @Override
    public String toString() {
        return "ConstStringInfo{" +
                "name=" + constPool.getUTF8(nameIndex) +
                '}';
    }

    public String string(){
        return constPool.getUTF8(nameIndex);
    }


    @Override
    public int tag() {
        return ConstantInfo.CONST_TAG_INTEGER;
    }

}
