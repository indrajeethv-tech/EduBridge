class Complex {
    double real;
    double imaginary;

    // Constructor
    Complex(double r, double i) {
        real = r;
        imaginary = i;
    }

    // Method to add two complex numbers
    Complex add(Complex c) {
        return new Complex(real + c.real,
                           imaginary + c.imaginary);
    }

    // Method to multiply two complex numbers
    Complex multiply(Complex c) {
        double r = (real * c.real) -
                   (imaginary * c.imaginary);

        double i = (real * c.imaginary) +
                   (imaginary * c.real);

        return new Complex(r, i);
    }

    // Method to compare magnitudes
    void compareMagnitude(Complex c) {
        double m1 = Math.sqrt(real * real +
                              imaginary * imaginary);

        double m2 = Math.sqrt(c.real * c.real +
                              c.imaginary * c.imaginary);

        if (m1 > m2)
            System.out.println("First number has greater magnitude.");
        else if (m2 > m1)
            System.out.println("Second number has greater magnitude.");
        else
            System.out.println("Both have equal magnitude.");
    }

    // Method to copy an object
    Complex copy() {
        return new Complex(real, imaginary);
    }

    // Method to display complex number
    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }

    public static void main(String[] args) {

        // Creating two objects
        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(1, 4);

        System.out.print("First Complex Number: ");
        c1.display();

        System.out.print("Second Complex Number: ");
        c2.display();

        // Addition
        Complex sum = c1.add(c2);
        System.out.print("\nAddition: ");
        sum.display();

        // Multiplication
        Complex product = c1.multiply(c2);
        System.out.print("Multiplication: ");
        product.display();

        // Comparing magnitudes
        System.out.println("\nMagnitude Comparison:");
        c1.compareMagnitude(c2);

        // Copying object
        Complex c3 = c1.copy();

        System.out.print("\nCopied Object: ");
        c3.display();

        // Modifying original object
        c1.real = 10;
        c1.imaginary = 5;

        System.out.print("\nModified Original Object: ");
        c1.display();

        System.out.print("Copied Object After Modification: ");
        c3.display();
    }
}