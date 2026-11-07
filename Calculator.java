class Calculator {

    // Method to calculate sum of two integers
    int calculate(int a, int b) {
        return a + b;
    }

    // Method to calculate product of two double numbers
    double calculate(double a, double b) {
        return a * b;
    }

    // Method to find the largest of three numbers
    int calculate(int a, int b, int c) {
        if (a >= b && a >= c)
            return a;
        else if (b >= a && b >= c)
            return b;
        else
            return c;
    }

    // Method to calculate difference
    double calculate(int a, double b) {
        return a - b;
    }

    public static void main(String[] args) {

        Calculator obj = new Calculator();

        System.out.println("Sum: " + obj.calculate(10, 20));

        System.out.println("Product: " + obj.calculate(5.5, 2.0));

        System.out.println("Largest Number: " +
                           obj.calculate(15, 25, 10));

        System.out.println("Difference: " +
                           obj.calculate(20, 5.5));
    }
}