package Builder;

public class Phone {
    private String frontPanel;
    private String backPanel;
    private String manufacturer;
    private String camera;
    private String osType;



    public Phone clone() {
        Phone newProcessor = new Phone();
        newProcessor.manufacturer = this.manufacturer;
        return newProcessor;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    public String getFrontPanel() {
        return frontPanel;
    }

    public void setFrontPanel(String frontPanel) {
        this.frontPanel = frontPanel;
    }

    public String getBackPanel() {
        return backPanel;
    }

    public void setBackPanel(String backPanel) {
        this.backPanel = backPanel;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Phone{");
        sb.append("frontPanel='").append(frontPanel).append('\'');
        sb.append(", backPanel='").append(backPanel).append('\'');
        sb.append(", manufacturer='").append(manufacturer).append('\'');
        sb.append(", camera='").append(camera).append('\'');
        sb.append(", osType='").append(osType).append('\'');
        sb.append('}');
        return sb.toString();
    }


}
