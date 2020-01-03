package classfile.constantpool;

import classfile.ClassReader;

/**
 * @Author: panda
 * @Date: 2018/10/3 0003 12:41
 */
public class ConstantLongInfo implements ConstantInfo {

    private long value;

    public ConstantLongInfo(ClassReader reader) {
        //u4
        value = reader.next2U4ToLong();
    }

    public long value(){
        return value;
    }

    @Override
    public int tag() {
        return ConstantInfo.CONST_TAG_INTEGER;
    }

    @Override
    public String getValue() {
        return value + "";
    }

    @Override
    public String toString() {
        return "Long: " + value;
    }

}
