package designPattern.factory;

public class WhiteHumanFactory extends AbstractHumanFactory{
    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }

    @Override
    public Man createMan() {
        return new WhiteMan();
    }

    @Override
    public Woman createWoman() {
        return new WhiteWoman();
    }
}
