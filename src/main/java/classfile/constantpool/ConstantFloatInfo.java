package classfile.constantpool;

import classfile.ClassReader;

/**
 * @Author: panda
 * @Date: 2018/10/3 0003 12:41
 */
public class ConstantFloatInfo implements ConstantInfo {

    private float value;

    public ConstantFloatInfo(ClassReader reader) {
        //u4
        value = reader.nextU4ToFloat();
    }


    public Float value(){
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
        return "Float: " + value;
    }

}
