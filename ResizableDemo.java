
 // Interface
interface Resizable {

    void resizeWidth(int width);

    void resizeHeight(int height);
}

// Rectangle class implementing interface
class ResizableRectangle implements Resizable {

    int width;
    int height;

    // Constructor
    ResizableRectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Resize width
    public void resizeWidth(int width) {
        this.width = width;
        System.out.println("Width updated to: " + width);
    }

    // Resize height
    public void resizeHeight(int height) {
        this.height = height;
        System.out.println("Height updated to: " + height);
    }

    // Display rectangle details
    void display() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + (width * height));
    }
}

// Main class
public class ResizableDemo {

    public static void main(String[] args) {

        // Creating rectangle object
        ResizableRectangle r = new ResizableRectangle(10, 5);

        System.out.println("Original Rectangle:");
        r.display();

        // Resizing rectangle
        System.out.println("\nAfter Resizing:");

        r.resizeWidth(20);
        r.resizeHeight(15);

        // Display updated details
        System.out.println("\nUpdated Rectangle:");
        r.display();
    }
}
