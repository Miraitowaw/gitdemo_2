package designPattern.adapter;

/**
 * 对象适配器
 */

class Adapter1 implements Target{
    //直接管理被适配类
    private Adaptee adaptee;

    public Adapter1(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        this.adaptee.specificRequest();
    }
}

public class ObjectAdapterTest {

    public static void main(String[] args) {
        Target adapter1 = new Adapter1(new Adaptee());
        adapter1.request();
    }

}
