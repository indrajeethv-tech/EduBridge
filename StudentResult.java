
class StudentResult {

    // Private fields
    private String usn;
    private String name;
    private int mark1, mark2, mark3;

    // Static variable
    static int studentCount = 0;

    // Final variable
    final int MAX_MARKS = 100;

    // Constructor
    StudentResult(String usn, String name, int m1, int m2, int m3) {
        this.usn = usn;
        this.name = name;

        mark1 = validateMarks(m1);
        mark2 = validateMarks(m2);
        mark3 = validateMarks(m3);

        studentCount++;
    }

    // Validation method
    private int validateMarks(int marks) {
        if (marks >= 0 && marks <= MAX_MARKS) {
            return marks;
        } else {
            System.out.println("Invalid marks! Setting marks to 0.");
            return 0;
        }
    }

    // Getter methods
    String getName() {
        return name;
    }

    String getUsn() {
        return usn;
    }

    int getMark1() {
        return mark1;
    }

    int getMark2() {
        return mark2;
    }

    int getMark3() {
        return mark3;
    }

    // Calculate total
    int calculateTotal() {
        return mark1 + mark2 + mark3;
    }

    // Calculate average
    double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    // Display basic details
    void display() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
    }

    // Overloaded display method
    void display(boolean result) {
        display();

        if (result) {
            System.out.println("Marks: " + mark1 + ", "
                    + mark2 + ", " + mark3);
            System.out.println("Total: " + calculateTotal());
            System.out.println("Average: " + calculateAverage());
        }
    }

    // Return a new result summary object
    ResultSummary getResultSummary() {
        return new ResultSummary(name, calculateTotal(),
                calculateAverage());
    }

    public static void main(String[] args) {

        // Creating student objects
        StudentResult s1 = new StudentResult(
                "CIT001", "Rahul", 85, 90, 80);

        StudentResult s2 = new StudentResult(
                "CIT002", "Priya", 75, 88, 92);

        StudentResult s3 = new StudentResult(
                "CIT003", "Arun", 65, 70, 80);

        System.out.println("STUDENT 1 DETAILS");
        s1.display(true);

        System.out.println("\nSTUDENT 2 DETAILS");
        s2.display(true);

        System.out.println("\nSTUDENT 3 DETAILS");
        s3.display(true);

        // Display student count
        System.out.println("\nTotal Students: " + studentCount);

        // Creating result summary object
        ResultSummary r1 = s1.getResultSummary();

        System.out.println("\nRESULT SUMMARY");
        r1.displaySummary();
    }
}

// Result Summary class
class ResultSummary {
    String name;
    int total;
    double average;

    ResultSummary(String name, int total, double average) {
        this.name = name;
        this.total = total;
        this.average = average;
    }

    void displaySummary() {
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
    }
}
