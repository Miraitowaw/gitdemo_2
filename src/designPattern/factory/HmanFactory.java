package designPattern.factory;

/**
 * 生产产品的工厂
 */
public class HmanFactory {
    public Human createHuman(String type) {
        if (type == null) return null;
        if (type.equals("BlackHuman")) {
            return new BlackHuman();
        } else if (type.equals("WhiteHuman")) {
            return new WhiteHuman();
        } else if (type.equals("YellowHuman")) {
            return new YellowHuman();
        }
        return null;
    }
}
