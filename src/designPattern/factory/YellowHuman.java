package designPattern.factory;

/**
 * 具体的产品
 */
public class YellowHuman implements Human{
    @Override
    public void printColor() {
        System.out.println("黄种人");
    }

    @Override
    public void talk() {
        System.out.println("黄种人说话了");
    }
}
