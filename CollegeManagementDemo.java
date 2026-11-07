
// Parent class
class CollegePerson {

    private String name;
    private int age;

    // Static variable
    static int peopleCount = 0;

    // Final constant
    static final String COLLEGE_NAME = "Cambridge Institute of Technology";

    // Constructor
    CollegePerson(String name, int age) {
        this.name = name;
        this.age = age;
        peopleCount++;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Overloaded method
    public void displayDetails(String heading) {
        System.out.println("\n" + heading);
        displayDetails();
    }
}

// Student class
class CollegeStudent extends CollegePerson {

    private int studentId;
    private String course;

    CollegeStudent(String name, int age, int studentId, String course) {
        super(name, age);
        this.studentId = studentId;
        this.course = course;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }
}

// Faculty class
class CollegeFaculty extends CollegePerson {

    private String subject;
    private double salary;

    CollegeFaculty(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
        System.out.println("Salary: Rs." + salary);
    }
}

// Administrator class
class CollegeAdministrator extends CollegePerson {

    private String department;
    private String designation;

    CollegeAdministrator(String name, int age,
                         String department, String designation) {
        super(name, age);
        this.department = department;
        this.designation = designation;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
        System.out.println("Designation: " + designation);
    }
}

// Main class
public class CollegeManagementDemo {

    // Static nested class
    static class Department {
        String departmentName;

        Department(String departmentName) {
            this.departmentName = departmentName;
        }

        void displayDepartment() {
            System.out.println("College Department: " + departmentName);
        }
    }

    public static void main(String[] args) {

        // Creating objects
        CollegePerson p1 = new CollegeStudent(
                "Rahul", 20, 101, "Cyber Security");

        CollegePerson p2 = new CollegeFaculty(
                "Dr. Ramesh", 40, "Java Programming", 50000);

        CollegePerson p3 = new CollegeAdministrator(
                "Suresh", 45, "Administration", "Manager");

        // Creating Person array
        CollegePerson[] people = {p1, p2, p3};

        System.out.println("COLLEGE MANAGEMENT SYSTEM");
        System.out.println("College: " + CollegePerson.COLLEGE_NAME);

        // Displaying all details
        for (CollegePerson p : people) {
            p.displayDetails("PERSON DETAILS");
            System.out.println("-------------------------");
        }

        // Creating nested class object
        Department d = new Department("Cyber Security");

        System.out.println("\nDEPARTMENT DETAILS");
        d.displayDepartment();

        // Display total people
        System.out.println("\nTotal People Created: "
                + CollegePerson.peopleCount);
    }
}
