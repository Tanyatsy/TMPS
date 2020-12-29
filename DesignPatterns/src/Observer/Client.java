package Observer;

import Builder.Phone;

public class Client extends Observer {

    public Client(Phone phone) {
        this.phone = phone;
        this.phone.attach(this);
    }

    @Override
    public void update() {
        System.out.println("\n~~~~~~Observer status~~~~~~");
        if(this.phone.getState().equalsIgnoreCase("ready for sell")) {
            System.out.println("\nClient is happy with finished phone!\n");
        } else if(this.phone.getState().equalsIgnoreCase("not ready")){
            System.out.println("Client is unhappy with finished phone!\n");
        } else if(this.phone.getState().equalsIgnoreCase("ready to test")){
            System.out.println("Client is ready for testing his phone!\n");
        }
    }
}
