class Circle {
    double radius;

    // Method to calculate area
    void CalculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    // Method to calculate circumference
    void CalculateCircumference() {
        double circumference = 2 * 3.14 * radius;
        System.out.println("Circumference of Circle: " + circumference);
    }

    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle();

        // Assigning values
        c1.radius = 5;
        c2.radius = 7;

        System.out.println("Circle 1:");
        System.out.println("Radius: " + c1.radius);
        c1.CalculateArea();
        c1.CalculateCircumference();

        System.out.println("\nCircle 2:");
        System.out.println("Radius: " + c2.radius);
        c2.CalculateArea();
        c2.CalculateCircumference();
    }
}