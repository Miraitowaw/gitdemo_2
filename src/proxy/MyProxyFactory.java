package proxy;

import java.lang.reflect.Proxy;

/**
 * 为指定的target生成动态代理对象实例
 */
public class MyProxyFactory {
    public static Object getProxy(Object target) {
        MyInvocationHandler handler = new MyInvocationHandler();
        handler.setTarget(target);
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), handler);
    }
}
