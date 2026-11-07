
// Parent class
class Payment {

    // Original method
    double calculateAmount(double amount) {
        return amount;
    }

    // Overloaded method
    double calculateAmount(double amount, double discount) {
        return amount - (amount * discount / 100);
    }
}

// Card Payment class
class CardPayment extends Payment {

    // Overriding method
    @Override
    double calculateAmount(double amount) {
        double fee = amount * 0.02;
        return amount + fee;
    }
}

// UPI Payment class
class UPIPayment extends Payment {

    // Overriding method
    @Override
    double calculateAmount(double amount) {
        double fee = amount * 0.01;
        return amount + fee;
    }
}

// Main class
public class PaymentDemo {

    public static void main(String[] args) {

        // Parent class reference
        Payment p;

        // Card payment
        p = new CardPayment();

        System.out.println("CARD PAYMENT");
        System.out.println("Final Amount: Rs."
                + p.calculateAmount(1000));

        // UPI payment
        p = new UPIPayment();

        System.out.println("\nUPI PAYMENT");
        System.out.println("Final Amount: Rs."
                + p.calculateAmount(1000));

        // Calling overloaded method
        Payment obj = new Payment();

        System.out.println("\nPAYMENT WITH DISCOUNT");
        System.out.println("Final Amount: Rs."
                + obj.calculateAmount(1000, 10));
    }
}
