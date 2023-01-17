package designPattern.factory;

public class BlackWoman extends Woman{
    @Override
    public void printColor() {
        System.out.println("黑种人");
    }

    @Override
    public void talk() {
        System.out.println("黑种人说话了");
    }
}
