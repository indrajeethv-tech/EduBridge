class Rectangle {
    double length;
    double breadth;

    // Method to calculate area
    void CalculateArea() {
        double area = length * breadth;
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area of Rectangle: " + area);
    }

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        // Assigning values
        r1.length = 10;
        r1.breadth = 5;

        r2.length = 8;
        r2.breadth = 4;

        // Calculating area
        r1.CalculateArea();
        r2.CalculateArea();
    }
}