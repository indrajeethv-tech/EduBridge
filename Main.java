class Student1 {
    int marks;

    // Constructor
    Student1(int marks) {
        this.marks = marks;
    }
}

public class Main {

    static void change(int x, Student1 s) {
        x = 100;
        s.marks = 95;
        s = new Student1(50);
    }

    public static void main(String[] args) {

        int n = 20;
        Student1 st = new Student1(60);

        change(n, st);

        System.out.println(n);
        System.out.println(st.marks);
    }
}