package shape;

abstract class Shape {
    public abstract String getName();
    public abstract double getArea();
}
public class main {
    public static void main(String[] args) {
        circle c = new circle(2);
        rectangle r = new rectangle (4, 6);
        System.out.println(c.getName() + " Area: " + c.getArea());
        System.out.println(r.getName() + " Area: " + r.getArea());
    }
}