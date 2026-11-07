class Point {
    int x, y;

    // Constructor using this keyword
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to display point
    void display() {
        System.out.println("X Coordinate: " + x);
        System.out.println("Y Coordinate: " + y);
        System.out.println("Point: (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {

        // Creating objects
        Point p1 = new Point(10, 20);
        Point p2 = new Point(30, 40);
        Point p3 = new Point(5, 15);

        System.out.println("Point 1:");
        p1.display();

        System.out.println("\nPoint 2:");
        p2.display();

        System.out.println("\nPoint 3:");
        p3.display();
    }
}