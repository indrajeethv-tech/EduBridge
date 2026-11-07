
class University {

    String universityName = "Cambridge Institute of Technology";

    // Static nested class
    static class Department {
        String departmentName;

        Department(String departmentName) {
            this.departmentName = departmentName;
        }

        void displayDepartment() {
            System.out.println("Department: " + departmentName);
        }
    }

    // Non-static inner class
    class Faculty {
        String facultyName;
        String designation;

        Faculty(String facultyName, String designation) {
            this.facultyName = facultyName;
            this.designation = designation;
        }

        void displayFaculty() {
            System.out.println("Faculty Name: " + facultyName);
            System.out.println("Designation: " + designation);
            System.out.println("University: " + universityName);
        }
    }

    // Outer class method
    void displayUniversity() {
        System.out.println("University Name: " + universityName);
    }

    public static void main(String[] args) {

        // Creating University object
        University u = new University();

        // Creating Department object without University object
        University.Department d =
            new University.Department("Cyber Security");

        // Creating Faculty object using University object
        University.Faculty f =
            u.new Faculty("Dr. Ramesh", "Professor");

        // Displaying all details
        System.out.println("UNIVERSITY DETAILS");
        u.displayUniversity();

        System.out.println("\nDEPARTMENT DETAILS");
        d.displayDepartment();

        System.out.println("\nFACULTY DETAILS");
        f.displayFaculty();
    }
}
