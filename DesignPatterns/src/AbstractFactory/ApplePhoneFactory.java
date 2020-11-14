package AbstractFactory;

import Builder.IOSBuilder;
import Builder.PhoneBuilder;

public class ApplePhoneFactory extends AbstractFactory {

    @Override
    public PhoneBuilder getBuilder(String osType) {
        PhoneBuilder builder = null;
        if(osType.equals("ios")){
            builder = new IOSBuilder();
        } else  System.out.println("Unknown osType entered for this manufacture!");
        return builder;
    }
    }
