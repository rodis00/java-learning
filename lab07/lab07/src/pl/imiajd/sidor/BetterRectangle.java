package pl.imiajd.sidor;

public class BetterRectangle extends Rectangle {

    public BetterRectangle() {
        super();
        this.setLocation();
        this.setSize();
    }

    public int getPerimeter(){
        return 2 * a + 2 * b;
    }

    public int getArea(){
        return a * h;
    }
}
