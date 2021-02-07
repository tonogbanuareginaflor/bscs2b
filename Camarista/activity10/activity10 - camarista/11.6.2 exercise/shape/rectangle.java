package shape;

class rectangle extends Shape {
    double base;
    double height;

    public rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height) ;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }
}