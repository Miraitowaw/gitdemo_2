package aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {

    public static void main(String[] args) throws Exception{
        //创建接口实现类的代理对象
        Class[] interfaces = {UserDao.class};
        UserDao userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(),
                interfaces, //增强方法所在的类，这个类实现的接口
                new UserDaoProxy(userDao)); //InvocationHandler接口的实现类
        int result = dao.add(1, 2);
        System.out.println("result: " + result);
    }
}

class UserDaoProxy implements InvocationHandler{
    //被代理对象，接口实现类的实例
    private Object obj;
    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    //增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法之前
        System.out.println("方法之前执行：" + method.getName() + "传递的参数" + Arrays.toString(args));

        //执行被增强的方法
        Object res = method.invoke(obj, args);

        //方法之后
        System.out.println("方法之后执行：" + obj);

        return res;
    }

}
