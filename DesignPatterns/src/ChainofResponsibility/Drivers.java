package ChainofResponsibility;

public class Drivers  extends PhoneBuilderResponsibility{
    public Drivers(int authorityLevel) {
        this.authorityLevel = authorityLevel;
    }

    @Override
    protected void write(String message) {
        System.out.println("Drivers are installed " + message);
    }
}
