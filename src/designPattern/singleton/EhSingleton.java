package designPattern.singleton;

/**
 * 饿汉单例
 */

public class EhSingleton {
    private static EhSingleton ehSingleton = new EhSingleton();

    private EhSingleton(){}

    public static EhSingleton getInstance() {
        return ehSingleton;
    }
}
