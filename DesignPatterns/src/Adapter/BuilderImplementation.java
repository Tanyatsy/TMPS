package Adapter;

import Builder.PhoneBuilder;

public class BuilderImplementation extends PhoneBuilder {
    BuilderAdapter builderAdapter;

    @Override
    public String getInfoAboutOsType() {
        return null;
    }

    @Override
    public String buildPhone(String type, String osType) {
        if (type.equalsIgnoreCase("phone with buttons") || type.equalsIgnoreCase("tablet phone")) {
            builderAdapter = new BuilderAdapter(type);
            return builderAdapter.buildPhone(type, osType);
        } else {
            System.out.println("Invalid phone type.");
        }
        return null;
    }
}
