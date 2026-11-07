
// Parent class
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        System.out.println("Person Constructor Called");
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child class of Person
class CompanyEmployee extends Person {
    int employeeId;
    double basicSalary;

    // Constructor
    CompanyEmployee(String name, int age, int employeeId,
                double basicSalary) {

        super(name, age);

        System.out.println("Employee Constructor Called");
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
    }

    void display() {
        super.display();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Basic Salary: Rs." + basicSalary);
    }
}

// Child class of Employee
class Manager extends CompanyEmployee {
    String department;
    double bonus;

    // Constructor
    Manager(String name, int age, int employeeId,
            double basicSalary, String department, double bonus) {

        super(name, age, employeeId, basicSalary);

        System.out.println("Manager Constructor Called");
        this.department = department;
        this.bonus = bonus;
    }

    // Calculate total salary
    double calculateSalary() {
        return basicSalary + bonus;
    }

    void display() {
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Bonus: Rs." + bonus);
        System.out.println("Total Salary: Rs." + calculateSalary());
    }
}

// Main class
public class ManagerDemo {

    public static void main(String[] args) {

        // Creating Manager object
        Manager m1 = new Manager(
                "Rahul", 30, 101, 50000,
                "Cyber Security", 10000);

        System.out.println("\nMANAGER DETAILS");

        m1.display();
    }
}
