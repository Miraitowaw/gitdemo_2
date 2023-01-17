package designPattern.factory;

public abstract class Woman implements Human{
    public void printGender() {
        System.out.println("性别为女");
    }

    @Override
    public abstract void printColor();
}
