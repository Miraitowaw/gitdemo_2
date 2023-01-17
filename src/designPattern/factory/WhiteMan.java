package designPattern.factory;

public class WhiteMan extends Man{
    @Override
    public void printColor() {
        System.out.println("白种人");
    }

    @Override
    public void talk() {
        System.out.println("白种人说话了");
    }
}
