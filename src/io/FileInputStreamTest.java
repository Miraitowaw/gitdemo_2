package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PushbackInputStream;

public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        //创建字节输入流
        var fis = new FileInputStream("./src/io/FileInputStreamTest.java");
        var bbuf = new byte[1024];
        //用于保存实际读取的字节数
        var hasRead = 0;
        while ((hasRead = fis.read(bbuf)) > 0) {
            System.out.println("hasRead: " + hasRead);
            System.out.print(new String(bbuf, 0, hasRead));
        }
        fis.close();
    }
}
