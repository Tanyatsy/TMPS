package Builder;

public abstract class PhoneBuilder {
    private Phone phone;

    public Phone getPhone() {
        return phone;
    }

    public PhoneBuilder() {
        phone = new Phone();
    }

    public void addFrontPanel(String frontPanel) {
        phone.setFrontPanel(frontPanel);
    }

    public void addBackPanel(String backPanel) {
        phone.setBackPanel(backPanel);
    }

    public void addManufacturer(String manufacturer) {
        phone.setManufacturer(manufacturer);
    }

    public void addCamera(String camera) {
        phone.setCamera(camera);
    }

    public void addOsType(String osType) {
        phone.setOsType(osType);
    }

    public abstract String getInfoAboutOsType();
}
