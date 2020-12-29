package ChainofResponsibility;

public class BackPanel  extends PhoneBuilderResponsibility {

    public BackPanel(int authorityLevel) {
        this.authorityLevel = authorityLevel;
    }

    @Override
    protected void write(String message) {
        if(message.contains("back panel"))
        System.out.println("Back panel is build: " + message);
        else  System.out.println("Back panel is build! ");
    }
}
