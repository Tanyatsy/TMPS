package Decorator;

public class WhitePhone extends PhoneDecorator {
    public WhitePhone(IPhone iPhone) {
        super(iPhone);
    }
    @Override
    public void colorAssemble() {
        super.colorAssemble();
        System.out.println("Adding the white color of the phone");
    }
}
