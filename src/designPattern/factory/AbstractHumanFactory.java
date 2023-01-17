package designPattern.factory;

/**
 * 抽象工厂
 * 具体创造什么类型的产品由其子工厂实现
 */
public abstract class AbstractHumanFactory {
    public abstract Human createHuman();

    public abstract Man createMan();
    public abstract Woman createWoman();
}
