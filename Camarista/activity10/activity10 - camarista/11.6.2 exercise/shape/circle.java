package shape;

class circle extends Shape {
    double radius;

    public circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public String getName() {
        return "Circle";
    }
}