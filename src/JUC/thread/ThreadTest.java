package JUC.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 创建线程
 */

public class ThreadTest {
    //继承Thread类，重写run方法
    public static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("I am a child thread");
        }
    }

    //实现 Runnable 接口的 run 方法
    public static class RunnableTask implements Runnable {

        @Override
        public void run() {
            System.out.println("I am a child thread");
        }
    }

    public static class CallerTask implements Callable<String> {

        @Override
        public String call() throws Exception {
            return "hello";
        }
    }

    public static void main(String[] args) {
        //创建线程
        MyThread thread = new MyThread();
        //启动线程
        thread.start(); //执行run方法

        RunnableTask task = new RunnableTask();
        new Thread(task).run();
        new Thread(task).run();

        //创建异步任务
        FutureTask<String> futureTask = new FutureTask<>(new CallerTask());
        //启动线程
        new Thread(futureTask).start();
        try {
            //等待任务执行完毕，并返回结果
            String result = futureTask.get();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
