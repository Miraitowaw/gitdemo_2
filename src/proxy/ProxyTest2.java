package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class MyInvocationHandler implements InvocationHandler {
    //需要被代理的对象
    private Object target;
    public void setTarget(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        var du = new DogUtil();
        du.method1();
        //通过反射以target作为主调来执行method方法
        Object result = method.invoke(target, args);
        du.method2();
        return result;
    }
}

public class ProxyTest2 {
    public static void main(String[] args) {
        //创建一个GunDog对象，作为被代理对象
        Dog target = new GunDog();
        var dog = (Dog)MyProxyFactory.getProxy(target);
        dog.info();
        dog.run();
    }
}
