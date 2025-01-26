package Shape_Management;

public class Shape {
    public void calArea(Circle c) {
        System.out.println("Area of circle is "+ (c.getRadius() * c.getRadius() * 3.14));
    }

    public void calArea(Rectangle r) {
        System.out.println("Area of Rectangle is "+ (r.getLength() * r.getBreadth()));
    }
    public void calArea(Triangle t) {
        System.out.println("Area of Triangle is "+ (t.getBase() * t.getHeight() * 0.5));
    }
}
