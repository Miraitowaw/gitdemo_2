package designPattern.adapter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;

/**
 * 类适配器
 */

//一个已经存在的接口，这个接口需要适配
//已经存在的、具有特殊功能、但不符合我们既有的标准接口的类
class Adaptee {
    public void specificRequest() {
        System.out.println("被适配类具有特殊功能……");
    }
}

//定义Client使用的 与特定领域相关的接口
//目标接口，或称为标准接口
interface Target {
    public void request();
}

//具体目标类，只提供普通功能
class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("普通类 具有 普通功能……");
    }
}

//类适配器，继承
class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.specificRequest();
    }
}

public class AdapterTest {

    /**
     * Client面对的是Target接口，只能使用复合这一目标标准的子类
     * Adaptee类是被适配的对象，它包含特殊的操作、功能
     * 我们想要在自己的系统中使用Adaptee类，需要将其转换成复合我们标准的类，
     * 使得Client可以在透明的情况下任意选择使用 ConcreteTarget类或是具有特殊功能的Adaptee类
     *
     */
    public static void main(String[] args) {
        //使用普通功能类
        Target concreteTarget = new ConcreteTarget();
        concreteTarget.request();

        //使用特殊功能类，即适配类
        Target adapter = new Adapter();
        adapter.request();

    }
}
