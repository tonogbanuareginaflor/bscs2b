abstract class Shape {
    public abstract String getName();
    public abstract double getArea();
}
public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Triangle t = new Triangle(2, 2);
        System.out.println(c.getName() + " Area: " + c.getArea());
        System.out.println(t.getName() + " Area: " + t.getArea());
    }
}