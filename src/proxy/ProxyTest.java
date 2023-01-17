package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Person{
    void walk();
    void sayHello(String name);
}

class MyInvokationHandler implements InvocationHandler{

    /**
     * @param proxy 代理对象
     * @param method 正在执行的方法
     * @param args 调用目标方法时传入的实参
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("-----正在执行的方法：" + method);
        if (args != null) {
            System.out.println("下面是执行该方法时传入的实参：");
            for (var val : args) {
                System.out.println(val);
            }
        } else {
            System.out.println("该方法没有实参");
        }
        return null;
    }
}

public class ProxyTest {

    public static void main(String[] args) {
        InvocationHandler handler = new MyInvokationHandler();
        Class[] interfaces = {Person.class};
        //创建动态代理对象
        var p = (Person)Proxy.newProxyInstance(Person.class.getClassLoader(), interfaces, handler);
        p.walk();
        p.sayHello("代理");
    }
}
