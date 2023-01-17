package javaseuse;

import java.io.Serializable;

public class Student implements Serializable {
    /**
     * 进行序列化时最好指定这个UID
     */
    private static final long serialVersionUID = -766571861519198043L;
    private String name;
    private transient String sex;

    public Student(String name, String sex) {
        super();
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student [name=" + name +", sex=" + sex +"]";
    }
}
