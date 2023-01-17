package designPattern.factory;

public class YellowMan extends Man{
    @Override
    public void printColor() {
        System.out.println("黄种人");
    }

    @Override
    public void talk() {
        System.out.println("黄种人说话了");
    }
}
