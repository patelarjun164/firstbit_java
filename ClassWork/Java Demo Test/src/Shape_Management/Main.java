package Shape_Management;

public class Main {
    public static void main(String[] args) {
        Shape s = new Shape();
        Circle c = new Circle();
        c.setRadius(5);
        Rectangle r = new Rectangle();
        r.setBreadth(5);
        r.setLength(5);
        Triangle t = new Triangle();
        t.setBase(5);
        t.setHeight(10);

        s.calArea(c);
        s.calArea(r);
        s.calArea(t);
    }

}
