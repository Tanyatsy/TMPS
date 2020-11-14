package Adapter;

import Builder.PhoneBuilder;

public class BuilderAdapter extends PhoneBuilder {
    AdvancedPhoneBuilder advancedPhoneBuilder;


    public BuilderAdapter(String type) {
        if (type.equalsIgnoreCase("phone with buttons")) {
            advancedPhoneBuilder = new PhoneWithButtonsBuilder();
        } else if (type.equalsIgnoreCase("tablet phone")) {
            advancedPhoneBuilder = new TabletPhoneBuilder();
        }
    }

    @Override
    public String getInfoAboutOsType() {
        return null;
    }

    @Override
    public String buildPhone(String type, String osType) {
        if (type.equalsIgnoreCase("phone with buttons")) {
            return   advancedPhoneBuilder.buildPhoneWithButtons(osType);
        } else if (type.equalsIgnoreCase("tablet phone")) {
            return  advancedPhoneBuilder.buildTabletPhone(osType);
        }
        return null;
    }
}
