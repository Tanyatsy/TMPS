package Builder;

import Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Phone {
    private String frontPanel;
    private String backPanel;
    private String manufacturer;
    private String camera;
    private String osType;
    private List<Observer> observers = new ArrayList<>();
    private String state;


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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
