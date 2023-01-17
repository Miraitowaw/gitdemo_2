package designPattern.singleton;

/**
 * 双重检验懒汉单例
 */

public class LazySingletonDoubleCheck {
    private static LazySingletonDoubleCheck lazySingletonDoubleCheck;

    private LazySingletonDoubleCheck() {}

    public static LazySingletonDoubleCheck getInstance() {
        if (lazySingletonDoubleCheck == null) {
            synchronized (LazySingletonDoubleCheck.class) {
                if (lazySingletonDoubleCheck == null) {
                    lazySingletonDoubleCheck = new LazySingletonDoubleCheck();
                }
            }
        }
        return lazySingletonDoubleCheck;
    }
}
