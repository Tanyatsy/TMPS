package Builder;

public class IOSBuilder extends PhoneBuilder {
    @Override
    public String getInfoAboutOsType() {
        return "iOS is the operating system developed by apple.inc company.";
    }

    @Override
    public String buildPhone(String type, String osType) {
        return null;
    }
}
