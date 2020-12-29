package Observer;

import Builder.Phone;

public class Manager extends Observer {

    public Manager(Phone phone) {
        this.phone = phone;
        this.phone.attach(this);
    }

    @Override
    public void update() {
        if(this.phone.getState().equalsIgnoreCase("ready for sell")) {
            System.out.println("\nManager is happy with worker!\n");
        } else if(this.phone.getState().equalsIgnoreCase("not ready")){
            System.out.println("Manager is unhappy with worker!\n");
        } else if(this.phone.getState().equalsIgnoreCase("ready to test")){
            System.out.println("Manager is ready to realize product for testing with worker!\n");
        }
    }

}
