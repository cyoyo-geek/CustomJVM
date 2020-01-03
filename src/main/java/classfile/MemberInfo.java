package classfile;


import classfile.attributes.AttributeInfo;
import classfile.attributes.CodeAttribute;
import classfile.constantpool.ConstantPool;
import lombok.Getter;

/**
field_info {
        u2 access_flags;//访问标志
        u2 name_index;//常量池索引 名字
        u2 descriptor_index;//常量池索引  描述符

//属性表
        u2 attributes_count;
        attribute_info attributes[attributes_count];
        }
        */
@Getter
public class MemberInfo {

    private ConstantPool cp;

    private int accessFlags;
    private int nameIndex;
    private int descriptorIndex;
    private int attributesCount;
    private AttributeInfo[] attributes;

    public MemberInfo(ConstantPool constantPool, ClassReader reader) {
        cp = constantPool;
        accessFlags = reader.nextU2ToInt();
        nameIndex = reader.nextU2ToInt();
        descriptorIndex = reader.nextU2ToInt();
        attributes = AttributeInfo.readAttributes(reader, cp);
    }

    public static MemberInfo[] readMembers(ConstantPool constantPool, ClassReader reader) {
        int fieldCount = reader.nextU2ToInt();
        MemberInfo[] fields = new MemberInfo[fieldCount];

        for (int i = 0; i < fieldCount; i++) {
            fields[i] = new MemberInfo(constantPool, reader);
        }

        return fields;
    }

    public String accessFlagsToString(String s) {
        StringBuilder builder = new StringBuilder();
        switch (s.charAt(3)) {
            case '0':
                break;
            case '1':
                builder.append("ACC_PUBLIC").append("    ");
                break;
            case '2':
                builder.append("ACC_PRIVATE").append("    ");
                break;
            case '4':
                builder.append("ACC_PROTECTED").append("    ");
                break;
            case '8':
                builder.append("ACC_STATIC").append("    ");
                break;
            case '9':
                break;
            default:
                throw new RuntimeException("can not parse access flag");
        }
        switch (s.charAt(2)) {
            case '0':
                break;
            case '1':
                builder.append("ACC_FINAL").append("    ");
                break;
            case '2':
                builder.append("ACC_SYNCHRONIZED").append("    ");
                break;
            case '4':
                builder.append("ACC_BRIDGE").append("    ");
                break;
            case '8':
                builder.append("ACC_VARARGS").append("    ");
                break;
            default:
                throw new RuntimeException("can not parse access flag");
        }
        switch (s.charAt(1)) {
            case '0':
                break;
            case '1':
                builder.append("ACC_NATIVE");
                break;
            case '4':
                builder.append("ACC_ABSTRACT");
                break;
            case '8':
                builder.append("ACC_STRICT");
                break;
            default:
                throw new RuntimeException("can not parse access flag");
        }
        switch (s.charAt(0)) {
            case '0':
                break;
            case '1':
                builder.append("ACC_SYNTHETIC");
                break;
            default:
                throw new RuntimeException("can not parse access flag");
        }
        return builder.toString();
    }

    public CodeAttribute getCodeAttribute() {
        for (AttributeInfo attributeInfo : attributes) {
            if (attributeInfo instanceof CodeAttribute) {
                return (CodeAttribute) attributeInfo;
            }
        }
        return null;
    }

}
