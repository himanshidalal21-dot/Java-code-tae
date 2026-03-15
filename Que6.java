class Rectangle {
    int length, breadth;

    // Constructor
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    // Method to calculate area
    int Area() {
        return length * breadth;
    }
}

// Main class
public class Que6 {
    public static void main(String[] args) {
        // Rectangle 1
        Rectangle r1 = new Rectangle(4, 5);

        // Rectangle 2
        Rectangle r2 = new Rectangle(5, 8);

        // Print areas
        System.out.println("Area of Rectangle 1: " + r1.Area());
        System.out.println("Area of Rectangle 2: " + r2.Area());
    }
}