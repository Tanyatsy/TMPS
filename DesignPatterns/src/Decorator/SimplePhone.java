package Decorator;

import Builder.Phone;

public class SimplePhone implements IPhone {
    @Override
    public void colorAssemble() {
        System.out.println("It is basic phone!");
    }
}
