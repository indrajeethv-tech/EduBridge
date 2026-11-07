
// Base class
class Employee {
    int employeeId;
    String name;
    double basicSalary;

    // Constructor
    Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Method to calculate salary
    double calculateSalary() {
        return basicSalary;
    }

    // Display employee details
    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: Rs." + basicSalary);
    }
}

// Permanent Employee class
class PermanentEmployee extends Employee {
    double allowance;
    double bonus;

    PermanentEmployee(int id, String name, double salary,
                      double allowance, double bonus) {

        super(id, name, salary);
        this.allowance = allowance;
        this.bonus = bonus;
    }

    // Overriding calculateSalary()
    @Override
    double calculateSalary() {
        return basicSalary + allowance + bonus;
    }

    void display() {
        super.display();
        System.out.println("Allowance: Rs." + allowance);
        System.out.println("Bonus: Rs." + bonus);
        System.out.println("Total Salary: Rs." + calculateSalary());
    }
}

// Contract Employee class
class ContractEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    ContractEmployee(int id, String name, double salary,
                     int hoursWorked, double hourlyRate) {

        super(id, name, salary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Overriding calculateSalary()
    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    void display() {
        super.display();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: Rs." + hourlyRate);
        System.out.println("Total Salary: Rs." + calculateSalary());
    }
}

// Main class
public class EmployeeSalary {

    public static void main(String[] args) {

        // Creating employee objects
        Employee e1 = new PermanentEmployee(
                101, "Rahul", 25000, 5000, 3000);

        Employee e2 = new ContractEmployee(
                102, "Priya", 0, 160, 200);

        // Storing objects in Employee array
        Employee[] employees = {e1, e2};

        // Displaying employee details
        for (int i = 0; i < employees.length; i++) {

            System.out.println("\nEMPLOYEE " + (i + 1));
            employees[i].display();

            System.out.println("-------------------------");
        }

        // Calculating salary using array
        System.out.println("\nSALARY SUMMARY");

        for (Employee emp : employees) {
            System.out.println(emp.name + ": Rs."
                    + emp.calculateSalary());
        }
    }
}
