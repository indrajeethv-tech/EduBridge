
class Vehicle {

    String brand;

    // Parent class constructor
    Vehicle(String brand) {
        this.brand = brand;
    }

    // Parent class method
    void display() {
        System.out.println("Vehicle Brand: " + brand);
    }
}

class Car extends Vehicle {

    String brand;

    // Child class constructor
    Car(String parentBrand, String childBrand) {
        super(parentBrand);
        this.brand = childBrand;
    }

    // Overriding display method
    @Override
    void display() {

        // Calling parent class method
        super.display();

        // Displaying child class brand
        System.out.println("Car Brand: " + this.brand);
    }
}

public class VehicleDemo {

    public static void main(String[] args) {

        // Creating Car object
        Car c1 = new Car("Toyota", "BMW");

        // Displaying details
        System.out.println("VEHICLE DETAILS");
        c1.display();
    }
}
