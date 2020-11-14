package Bridge;

public class Watches implements Widgets {
    @Override
    public void showWidget(String nameOfWidget, String brand) {
        if (brand.equalsIgnoreCase("apple")) {
            System.out.println("Widget for apple-watch is successfully installed");
        } else if (brand.equalsIgnoreCase("google")) {
            System.out.println("Widget for google-watch is successfully installed");
        }
    }
}
