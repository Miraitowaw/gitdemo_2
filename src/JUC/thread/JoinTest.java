package JUC.thread;

public class JoinTest {

//    public static void main(String[] args) throws InterruptedException {
//        Thread threadOne = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("child threadOne over!");
//            }
//        });
//        Thread threadTwo = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//
//        threadOne.start();
//        threadTwo.start();
//
//        System.out.println("wait all child thread over!");
//
//        threadOne.join();
//        threadTwo.join();
//
//        System.out.println("all child thread over!");
//    }

    public static void main(String[] args) {
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("threadOne begin run!");
                for (;;) {
                }
            }
        });
        //获取主线程
        final Thread mainThread = Thread.currentThread();

        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //中断主线程
                mainThread.interrupt();
            }
        });

        threadOne.start();

        threadTwo.start();

        try {
            threadOne.join();
        } catch (InterruptedException e) {
            System.out.println("main thread: " + e);
        }
    }
}
