package designPattern.factory;

/**
 * 具体的产品
 */
public class BlackHuman implements Human{
    @Override
    public void printColor() {
        System.out.println("黑种人");
    }

    @Override
    public void talk() {
        System.out.println("黑种人说话了");
    }
}
