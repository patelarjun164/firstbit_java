package functionOverloading;

public class Shape {
    double radius;
    int length;
    int breadth;
    int side;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public void calArea(double radius){
        System.out.println(3.14*radius*radius);
    }
    public void calArea(int length, int breadth){
        System.out.println(breadth*length);
    }
    public void calArea(int side){
        System.out.println(side*side);
    }
}
