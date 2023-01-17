package designPattern.singleton;

/**
 * 加同步锁的懒汉单例
 */

public class LazySingletonSync {
    private static LazySingletonSync lazySingletonSync;

    private LazySingletonSync(){}

    public static synchronized LazySingletonSync getInstance() {
        if (lazySingletonSync == null) {
            lazySingletonSync = new LazySingletonSync();
        }
        return lazySingletonSync;
    }
}
