package javaseuse;

import java.util.HashSet;
import java.util.Objects;

public class MyClass {

    public static void main(String[] args) {
        //Student对象
        Student s1 = new Student("jojo", 18);
        Student s2 = new Student("jojo", 18);

        //HashSet对象
        HashSet set = new HashSet();
        set.add(s1);
        set.add(s2);

        //输出两个对象
        System.out.println(s1);
        System.out.println(s2);

        //输出equals
        System.out.println("s1.equals(s2)的结果为：" + s1.equals(s2));

        //输出哈希值
        System.out.println("哈希值为：s1->" + s1.hashCode() + "  s2->" + s2.hashCode());

        //输出set
        System.out.println(set);
    }

    private static class Student {
        String name;
        int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || o.getClass() != Student.class) return false;
            Student student = (Student) o;
            return age == student.age &&
                    name.equals(student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }
}