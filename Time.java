class Time {
    int hours, minutes, seconds;

    // Default constructor
    Time() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    // Constructor with one parameter
    Time(int s) {
        hours = s / 3600;
        minutes = (s % 3600) / 60;
        seconds = s % 60;
    }

    // Constructor with three parameters
    Time(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
    }

    // Method to display time
    void display() {
        System.out.println(hours + " Hours : " + minutes +
                           " Minutes : " + seconds + " Seconds");
    }

    public static void main(String[] args) {

        Time t1 = new Time();
        Time t2 = new Time(5000);
        Time t3 = new Time(2, 30, 45);

        System.out.println("Default Time:");
        t1.display();

        System.out.println("\nTime using Seconds:");
        t2.display();

        System.out.println("\nTime using Hours, Minutes and Seconds:");
        t3.display();
    }
}