package designPattern.factory;

/**
 * 具体的产品
 */
public class WhiteHuman implements Human{
    @Override
    public void printColor() {
        System.out.println("白种人");
    }

    @Override
    public void talk() {
        System.out.println("白种人说话了");
    }
}
