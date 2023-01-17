package designPattern.singleton;

/**
 * 非线程安全的懒汉单例
 */

public class LazySingleton {
    private static LazySingleton lazySingleton;

    private LazySingleton(){}

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
