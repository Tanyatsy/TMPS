package ChainofResponsibility;

public abstract class PhoneBuilderResponsibility {
    public static int MANUFACTURER = 1;
    public static int BACK_PANEL = 2;
    public static int FRONT_PANEL = 3;
    public static int OS_TYPE = 4;
    public static int CAMERA = 5;
    public static int DRIVERS = 6;

    protected int authorityLevel;

    protected PhoneBuilderResponsibility nextPhoneBuilderResponsibility;

    public void setNextPhoneBuilderResponsibility(PhoneBuilderResponsibility phoneBuilderResponsibility) {
        this.nextPhoneBuilderResponsibility = phoneBuilderResponsibility;
    }

    public void buildPhone(int authorityLevel, String message) {
        if(this.authorityLevel <= authorityLevel) {
            write(message);
        }
        if(nextPhoneBuilderResponsibility != null) {
            nextPhoneBuilderResponsibility.buildPhone(authorityLevel, message);
        }
    }

    abstract protected void write(String message);
}

