package designPattern.factory;

public class WhiteWoman extends Woman{
    @Override
    public void printColor() {
        System.out.println("白种人");
    }

    @Override
    public void talk() {
        System.out.println("白种人说话了");
    }
}
