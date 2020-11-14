package Builder;

public class WindowsBuilder extends PhoneBuilder {
    @Override
    public String getInfoAboutOsType() {
        return "Windows is a series of operating systems developed by Microsoft.";
    }

    @Override
    public String buildPhone(String type, String osType) {
        return null;
    }
}
