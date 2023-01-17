package designPattern.factory;

public abstract class Man implements Human{
    public void printGender() {
        System.out.println("性别为男");
    }

    @Override
    public abstract void printColor();
}
