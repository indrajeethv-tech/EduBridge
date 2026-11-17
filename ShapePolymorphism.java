
// Parent class
class Shape {

    void draw() {
        System.out.println("Drawing a Shape");
    }

    void erase() {
        System.out.println("Erasing a Shape");
    }
}

// Circle class
class CircleShape extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    void erase() {
        System.out.println("Erasing a Circle");
    }
}

// Triangle class
class TriangleShape extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing a Triangle");
    }

    @Override
    void erase() {
        System.out.println("Erasing a Triangle");
    }
}

// Square class
class SquareShape extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing a Square");
    }

    @Override
    void erase() {
        System.out.println("Erasing a Square");
    }
}

// Main class
public class ShapePolymorphism {

    public static void main(String[] args) {

        // Creating parent class array
        Shape[] shapes = {
            new CircleShape(),
            new TriangleShape(),
            new SquareShape()
        };

        // Demonstrating polymorphism
        for (int i = 0; i < shapes.length; i++) {

            System.out.println("\nShape " + (i + 1));

            shapes[i].draw();
            shapes[i].erase();
        }
    }
}
