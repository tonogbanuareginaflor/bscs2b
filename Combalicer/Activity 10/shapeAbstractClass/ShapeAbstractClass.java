
package shapeAbstractClass;

import java.util.Scanner;

abstract class Shape {
    
    abstract void getArea();
    
    abstract void getName();
    
}

class Circle extends Shape {
    
    Scanner sc = new Scanner(System.in);
    
    public void getArea() {
        System.out.print("Input Radius: ");
        int radius = sc.nextInt();
        System.out.println("Area = " + (radius*radius)*3.14);
    }
    
    public void getName() {
        System.out.println("Shape is Circle");
    }
    
}

class Square extends Shape {
    
    Scanner sc = new Scanner(System.in);
    
    public void getArea() {
        System.out.print("Input Length: ");
        int length = sc.nextInt();
        System.out.println("Area = " + (length* length));
    }
    
    public void getName() {
        System.out.println("Shape is Square");
    }
    
}

public class ShapeAbstractClass {
    public static void main(String[] args) {
        Circle c = new Circle();
        Square s = new Square();
        
        c.getName();
        c.getArea();
        
        s.getName();
        s.getArea();
    }
}