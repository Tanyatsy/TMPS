package Observer;

import Builder.Phone;

public abstract class Observer {
    protected Phone phone;
    public abstract void update();
}
