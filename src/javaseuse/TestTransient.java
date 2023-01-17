package javaseuse;

import java.io.*;
import java.util.ArrayList;

public class TestTransient {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student st = new Student("lili", "女");

        System.out.println(st);

        //构造一个输出到文件 "test.out" 的文件输出流
        FileOutputStream fos = new FileOutputStream("test.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(st);  //把对象 st 输出到文件
        oos.flush();
        oos.close();
        fos.close();

        //构造一个文件输入流，读取 "test.out" 的内容
        FileInputStream fis = new FileInputStream("test.out");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student st1 = (Student) ois.readObject();  //读取输入流中的对象
        ois.close();
        fis.close();

        System.out.println(st1);

    }
}
