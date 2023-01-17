package designPattern.factory;

/**
 * 调用方
 */
public class NvWa {
    public static void main(String[] args) {
        /**
         * 简单工厂模式
         */
//        HmanFactory factory = new HmanFactory();
//
//        System.out.println("得到黑种人……");
//        Human blackHuman = factory.createHuman("BlackHuman");
//        blackHuman.printColor();
//        blackHuman.talk();
//
//        System.out.println("得到白种人……");
//        Human whiteHuman = factory.createHuman("WhiteHuman");
//        whiteHuman.printColor();
//        whiteHuman.talk();
//
//        System.out.println("得到黄种人……");
//        Human yellowHuman = factory.createHuman("YellowHuman");
//        yellowHuman.printColor();
//        yellowHuman.talk();

        /**
         * 工厂方法模式
         */
//        AbstractHumanFactory factory = null;
//
//        System.out.println("得到黑种人……");
//        factory = new BlackHumanFactory();
//        Human blackHuman = factory.createHuman();
//        blackHuman.printColor();
//        blackHuman.talk();

        /**
         * 抽象工厂模式
         */
        AbstractHumanFactory factory = null;

        factory = new BlackHumanFactory();
        Man blackMan = factory.createMan();
        blackMan.printGender();
        blackMan.printColor();
        Woman blackWoman = factory.createWoman();
        blackWoman.printGender();
        blackWoman.printColor();

    }
}
