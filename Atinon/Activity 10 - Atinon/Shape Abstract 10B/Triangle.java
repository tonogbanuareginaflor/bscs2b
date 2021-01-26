class Triangle extends Shape {
    double base;
    double height;
    
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    @Override
    public double getArea() {
        return (base * height) / 2;
    }
    
    @Override
    public String getName() {
        return "Triangle";
    }
}