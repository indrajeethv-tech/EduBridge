
// Parent class
class Shape {

    double area() {
        return 0;
    }
}

// Circle class
class CircleShape extends Shape {

    double radius;

    CircleShape(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return 3.14 * radius * radius;
    }
}

// Rectangle class
class RectangleShape extends Shape {

    double length, breadth;

    RectangleShape(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area() {
        return length * breadth;
    }
}

// Triangle class
class TriangleShape extends Shape {

    double base, height;

    TriangleShape(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

// Main class
public class ShapeDemo {

    public static void main(String[] args) {

        // Creating Shape array
        Shape[] shapes = {
            new CircleShape(5),
            new RectangleShape(10, 6),
            new TriangleShape(8, 4)
        };

        // Calculating and displaying areas
        for (int i = 0; i < shapes.length; i++) {

            System.out.println("Shape " + (i + 1)
                    + " Area: " + shapes[i].area());
        }
    }
}
