package Decorator;

public abstract class PhoneDecorator implements IPhone {
    IPhone iPhone;

    public PhoneDecorator(IPhone iPhone) {
        this.iPhone = iPhone;
    }

    @Override
    public void colorAssemble() {
        this.iPhone.colorAssemble();
    }
}
