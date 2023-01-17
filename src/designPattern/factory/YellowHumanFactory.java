package designPattern.factory;

public class YellowHumanFactory extends AbstractHumanFactory{
    @Override
    public Human createHuman() {
        return new YellowHuman();
    }

    @Override
    public Man createMan() {
        return new YellowMan();
    }

    @Override
    public Woman createWoman() {
        return new YellowWoman();
    }
}
