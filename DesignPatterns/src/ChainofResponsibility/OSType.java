package ChainofResponsibility;

public class OSType  extends PhoneBuilderResponsibility{
    public OSType(int authorityLevel) {
        this.authorityLevel = authorityLevel;
    }

    @Override
    protected void write(String message) {
        if(message.contains("os"))
        System.out.println("OS is installed: " + message);
        else  System.out.println("OS is installed! ");
    }
}
