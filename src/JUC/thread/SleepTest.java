package JUC.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SleepTest {
    //创建一个独占锁
    private static final Lock lock = new ReentrantLock();

//    public static void main(String[] args) {
//        Thread threadA = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                //获取独占锁
//                lock.lock();
//                try {
//                    System.out.println("child threadA is in sleep");
//                    Thread.sleep(10000);
//                    System.out.println("child threadA is in awaked");
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                } finally {
//                    //释放锁
//                    lock.unlock();
//                }
//            }
//        });
//        Thread threadB = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                lock.lock();
//                try {
//                    System.out.println("child threadB is in sleep");
//                    Thread.sleep(10000);
//                    System.out.println("child threadB is in awaked");
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                } finally {
//                    lock.unlock();
//                }
//            }
//        });
//
//        threadA.start();
//        threadB.start();
//    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("child thread is in sleep");
                    Thread.sleep(10000);
                    System.out.println("child thread is in awaked");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        //主线程休眠2s
        Thread.sleep(2000);
        //主线程中断子线程
        thread.interrupt();
    }
}
