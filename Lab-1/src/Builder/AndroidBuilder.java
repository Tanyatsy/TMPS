package Builder;

public class AndroidBuilder extends PhoneBuilder {
    @Override
    public String getInfoAboutOsType() {
        return "The Android is a mobile operating system based on a modified version of the Linux kernel.";
    }

    @Override
    public String buildPhone(String type, String osType) {
        return null;
    }
}
