// Base class
class Shape {

    void display() {
        System.out.println("This is a Shape.");
    }
}

// Circle class (inherits Shape)
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Rectangle class (inherits Shape)
class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    void area() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Main class
public class Que11 {
    public static void main(String[] args) {

        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);

        // Using Circle
        c.display();
        c.area();

        System.out.println();

        // Using Rectangle
        r.display();
        r.area();
    }
}