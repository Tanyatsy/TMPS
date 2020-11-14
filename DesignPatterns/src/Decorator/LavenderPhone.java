package Decorator;

public class LavenderPhone extends PhoneDecorator {
    public LavenderPhone(IPhone iPhone) {
        super(iPhone);
    }

    @Override
    public void colorAssemble() {
       super.colorAssemble();
        System.out.println("Adding the lavender color of the phone");
    }
}
