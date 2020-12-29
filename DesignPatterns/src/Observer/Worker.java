package Observer;

import Builder.Phone;

public class Worker extends Observer {

    public Worker(Phone phone) {
        this.phone = phone;
        this.phone.attach(this);
    }

    @Override
    public void update() {
        if(this.phone.getState().equalsIgnoreCase("ready for sell")) {
            System.out.println("\nWorker is happy with finished work!\n");
        } else if(this.phone.getState().equalsIgnoreCase("not ready")){
            System.out.println("Worker is unhappy with finished work!\n");
        } else if(this.phone.getState().equalsIgnoreCase("ready to test")){
            System.out.println("Worker is ready to test his finished work!\n");
        }
    }
}
