package AbstractFactory;

import Builder.AndroidBuilder;
import Builder.PhoneBuilder;

public class GooglePhoneFactory extends AbstractFactory {

    @Override
    public PhoneBuilder getBuilder(String osType) {
        PhoneBuilder builder = null;
        if(osType.equals("android")){
            builder = new AndroidBuilder();
        } else  System.out.println("Unknown osType entered for this manufacture!");
        return builder;
    }
}
