package ChainofResponsibility;

public class FrontPanel extends PhoneBuilderResponsibility{
    public FrontPanel(int authorityLevel) {
        this.authorityLevel = authorityLevel;
    }

    @Override
    protected void write(String message) {
        if(message.contains("front panel"))
        System.out.println("Front panel is build: " + message);
        else   System.out.println("Front panel is build! ");

    }
}
