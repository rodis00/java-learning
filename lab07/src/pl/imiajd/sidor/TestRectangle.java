package pl.imiajd.sidor;

public class TestRectangle {
    public static void main(String[] args) {

        BetterRectangle better_rec = new BetterRectangle();

        System.out.println("perimeter = " + better_rec.getPerimeter());
        System.out.println("area = " + better_rec.getArea());
    }
}
