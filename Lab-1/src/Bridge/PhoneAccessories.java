package Bridge;

public class PhoneAccessories extends Accessories{
    String nameOfWidget;
    String brand;
    public PhoneAccessories(String nameOfWidget, String brand, Widgets widgets) {
        super(widgets);
        this.nameOfWidget = nameOfWidget;
        this.brand = brand;
    }

    @Override
    public void showWidget() {
widgets.showWidget(nameOfWidget, brand);
    }
}
