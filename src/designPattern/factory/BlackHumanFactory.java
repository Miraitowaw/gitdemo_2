package designPattern.factory;

public class BlackHumanFactory extends AbstractHumanFactory{
    @Override
    public Human createHuman() {
        return new BlackHuman();
    }

    @Override
    public Man createMan() {
        return new BlackMan();
    }

    @Override
    public Woman createWoman() {
        return new BlackWoman();
    }
}
