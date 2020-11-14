package Adapter;

public class TabletPhoneBuilder implements AdvancedPhoneBuilder {
    @Override
    public String buildPhoneWithButtons(String osType) {
       return null;
    }

    @Override
    public String buildTabletPhone(String osType) {
        System.out.println("Building the tablet phone with " + osType + " !");
        return "Building the tablet phone with " + osType + " !";
    }
}
