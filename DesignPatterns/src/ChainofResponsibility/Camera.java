package ChainofResponsibility;

public class Camera   extends PhoneBuilderResponsibility{
    public Camera(int authorityLevel) {
        this.authorityLevel = authorityLevel;
    }

    @Override
    protected void write(String message) {
        if(message.contains("camera"))
        System.out.println("Camera resolution is set: " + message);
        else   System.out.println("Camera resolution is set! ");
    }
}
