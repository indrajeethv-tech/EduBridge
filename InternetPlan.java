class InternetPlan {
    String planName;
    int validity;
    double price;

    // Default constructor
    InternetPlan() {
        this("Basic", 28, 199);
    }

    // Constructor with two parameters
    InternetPlan(String planName, int validity) {
        this(planName, validity, 299);
    }

    // Constructor with three parameters
    InternetPlan(String planName, int validity, double price) {
        this.planName = planName;
        this.validity = validity;
        this.price = price;
    }

    // Method to display plan details
    void display() {
        System.out.println("Plan Name: " + planName);
        System.out.println("Validity: " + validity + " Days");
        System.out.println("Price: Rs." + price);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {

        InternetPlan p1 = new InternetPlan();
        InternetPlan p2 = new InternetPlan("Standard", 56);
        InternetPlan p3 = new InternetPlan("Premium", 84, 599);

        System.out.println("Internet Plan Details:\n");

        p1.display();
        p2.display();
        p3.display();
    }
}