package JUC.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadLocalTest1 {

    //创建ThreadLocal变量
    private static ThreadLocal<String> localVariable = new ThreadLocal<>();

    private static void print(String str) {
        //打印当前线程本地内存中localVariable的值
        System.out.println(str + ":" + localVariable.get());
        //清除当前线程本地内存中的localVariable
        localVariable.remove();
    }

    public static void main(String[] args) {
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                localVariable.set("threadOne local variable");
                print("threadOne");
                System.out.println("threadOne remove after:" + localVariable.get());
            }
        });
        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                localVariable.set("threadTwo local variable");
                print("threadTwo");
                System.out.println("threadTwo remove after:" + localVariable.get());
            }
        });
        threadOne.start();
        threadTwo.start();

    }
}
