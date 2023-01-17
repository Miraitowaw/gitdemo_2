package JUC.thread;

/**
 * 两个线程交替打印奇偶数
 */

/**
 * 定义一个共享变量：
 */
public class Synchronized_Shared_Variable {
    private static final Object obj = new Object();
    private static int flag = 0;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (obj) {
                for (int i = 1; i <= 10; i += 2) {
                    while (flag != 0) {
                        try {
                            obj.wait();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    flag = 1;
                    System.out.println(Thread.currentThread().getName() + "***" + i);
                    obj.notify();
                }
            }
        }, "线程1");

        Thread t2 = new Thread(() -> {
           synchronized (obj) {
               for (int i = 2; i <= 10; i += 2) {
                   while (flag != 1) {
                       try {
                           obj.wait();
                       } catch (Exception e) {
                           e.printStackTrace();
                       }
                   }
                   flag = 0;
                   System.out.println(Thread.currentThread().getName() + "***" + i);
                   obj.notify();
               }
           }
        }, "线程2");

        t1.start();
        t2.start();
    }

}
