package Bridge;

public abstract class Accessories {
    protected Widgets widgets;
    protected Accessories(Widgets widgets){
        this.widgets = widgets;
    }
    public abstract void showWidget();
}
