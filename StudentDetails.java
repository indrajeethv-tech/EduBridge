
class StudentDetails {

    // Student variables
    String usn;
    String name;
    String branch;
    long phone;

    // Constructor
    StudentDetails(String usn, String name, String branch, long phone) {
        this.usn = usn;
        this.name = name;
        this.branch = branch;
        this.phone = phone;
    }

    // Method to display student details
    void display() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Phone: " + phone);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {

        // Creating student objects
        StudentDetails s1 = new StudentDetails(
                "1CAM24CS001", "Rahul", "Cyber Security", 9876543210L);

        StudentDetails s2 = new StudentDetails(
                "1CAM24CS002", "Priya", "Cyber Security", 9876543211L);

        StudentDetails s3 = new StudentDetails(
                "1CAM24CS003", "Arun", "Computer Science", 9876543212L);

        // Displaying student details
        System.out.println("STUDENT DETAILS");

        System.out.println("\nStudent 1:");
        s1.display();

        System.out.println("Student 2:");
        s2.display();

        System.out.println("Student 3:");
        s3.display();
    }
}
