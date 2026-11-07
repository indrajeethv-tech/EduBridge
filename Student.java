class Student {
    int rollNo;
    String name;
    int age;

    void display() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("-------------------");
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        // Assigning values to objects
        s1.rollNo = 101;
        s1.name = "Rahul";
        s1.age = 19;

        s2.rollNo = 102;
        s2.name = "Priya";
        s2.age = 20;

        s3.rollNo = 103;
        s3.name = "Arun";
        s3.age = 19;

        // Displaying student details
        s1.display();
        s2.display();
        s3.display();
    }
}