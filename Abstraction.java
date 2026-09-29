import java.util.Scanner;
abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double r = 5;
    double area() { return 3.14 * r * r; }
}

class Rectangle extends Shape {
    double l = 4, w = 6;
    double area() { return l * w; }
}

public class Main {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape r = new Rectangle();
        System.out.println("Circle area: " + c.area());
        System.out.println("Rectangle area: " + r.area());
    }
}
