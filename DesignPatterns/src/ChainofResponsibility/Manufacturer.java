package ChainofResponsibility;

public class Manufacturer extends PhoneBuilderResponsibility{

    public Manufacturer(int authorityLevel) {
        this.authorityLevel = authorityLevel;
    }

    @Override
    protected void write(String message) {
        if(message.contains("manufacturer"))
        System.out.println("Manufacturer is defined: " + message);
        else
            System.out.println("Manufacturer is defined!");
    }
}
