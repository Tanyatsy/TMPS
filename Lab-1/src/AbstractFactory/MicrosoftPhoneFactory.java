package AbstractFactory;

import AbstractFactory.AbstractFactory;
import Builder.AndroidBuilder;
import Builder.PhoneBuilder;
import Builder.WindowsBuilder;

public class MicrosoftPhoneFactory extends AbstractFactory {
    @Override
    public PhoneBuilder getBuilder(String osType) {
        PhoneBuilder builder = null;
        if(osType.equals("windows")){
            builder = new WindowsBuilder();
        } else  System.out.println("Unknown osType entered for this manufacture!");
        return builder;
    }
    }

