package Factory;

import AbstractFactory.AbstractFactory;
import AbstractFactory.*;

public class FactoryCreator {
    private static volatile FactoryCreator instance;

    private FactoryCreator() {};

    public static FactoryCreator getInstance() {
        if (instance == null) {
            synchronized (FactoryCreator.class) {
                if (instance == null) {
                    instance = new FactoryCreator();
                }
            }
        }
        return instance;
    }

    public AbstractFactory getFactory(String manufacturer) {
        AbstractFactory factory = null;
        switch (manufacturer) {
            case "apple":
            case "apple phone":
                factory = new ApplePhoneFactory();
                break;
            case "google":
            case "google phone":
                factory = new GooglePhoneFactory();
                break;
            case "lenovo":
            case "lenovo phone":
                factory = new LenovoPhoneFactory();
                break;
            case "microsoft":
            case "microsoft phone":
                factory = new MicrosoftPhoneFactory();
                break;
            default:
                System.out.println("Unknown manufacturer entered!");
                break;
        }
        return factory;
    }
}
