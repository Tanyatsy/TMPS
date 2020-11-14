package Adapter;

public class PhoneWithButtonsBuilder implements AdvancedPhoneBuilder {
    @Override
    public String buildPhoneWithButtons(String osType) {
        System.out.println("Building a phone with buttons with " + osType + " !");
        return "Building a phone with buttons with " + osType + " !";
    }

    @Override
    public String buildTabletPhone(String osType) {
        return null;
    }
}
