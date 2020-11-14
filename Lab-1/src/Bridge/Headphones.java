package Bridge;

public class Headphones implements Widgets {
    @Override
    public void showWidget(String nameOfWidget, String brand) {
        if(brand.equalsIgnoreCase("apple")){
            System.out.println("Widget for air-pods is successfully installed");
        }else if(brand.equalsIgnoreCase("google")){
            System.out.println("Widget for Pixel Buds is successfully installed");
        }
    }
}
