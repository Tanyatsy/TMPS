package Decorator;

public class BlackPhone extends PhoneDecorator {

    public BlackPhone(IPhone iPhone) {
        super(iPhone);
    }

    @Override
    public void colorAssemble() {
        super.colorAssemble();
        System.out.println("Adding the black color of the phone");
    }
}
