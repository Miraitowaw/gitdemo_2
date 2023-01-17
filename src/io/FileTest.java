package io;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        var file = new File("."); //以当前路径来创建一个File对象,即file对象表示当前路径
        System.out.println("文件名或路径名：" + file.getName());
        System.out.println("路径名：" + file.getPath());
        System.out.println("绝对路径：" + file.getAbsolutePath());
        System.out.println("父目录：" + file.getParent());
        System.out.println("绝对路径：" + file.getAbsoluteFile());
        System.out.println("上一级路径：" + file.getAbsoluteFile().getParent());
        System.out.println("file对象是否存在：" + file.exists());

        //在当前路径下创建一个临时文件
        File tmpFile = File.createTempFile("aaa", ".txt", file);
        //指定当JVM退出时删除该文件
        tmpFile.deleteOnExit();

        //以系统当前时间作为新文件名来创建新文件
        var newFile = new File(System.currentTimeMillis() + "");
        System.out.println("newFile对象是否存在：" + newFile.exists());
        //以指定newFile对象来创建一个文件
//        newFile.createNewFile();
        //以newFile对象来创建一个目录，因为newFile已经存在，下面方法返回false，无法创建目录
//        boolean b = newFile.mkdir();
//        System.out.println("创建目录是否成功：" + b);

        //使用list方法列出当前路径下的所有文件和目录
        System.out.println("======当前路径下所有文件和目录如下=======");
        String[] fileList = file.list();
        for (String fileName : fileList) {
            System.out.println(fileName);
        }

        //listRoots()静态方法列出所有的磁盘根路径
        File[] roots = File.listRoots();
        System.out.println("======系统所有根路径如下======");
        for (File root : roots) {
            System.out.println(root);
        }
    }
}
