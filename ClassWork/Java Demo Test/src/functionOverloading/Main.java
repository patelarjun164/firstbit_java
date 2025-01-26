package functionOverloading;

public class Main {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.setRadius(5);
        s.calArea(5.0);
//        s.setLength(5);
//        s.setBreadth(6);
        s.calArea(5,6);
        s.calArea(3);
    }
}
