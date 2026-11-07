
class SecureBankAccount {

    // Private variables
    private String accountNumber;
    private double balance;

    // Static variable
    static int accountCount = 0;

    // Final variable
    final String accountIdentifier;

    // Constructor
    SecureBankAccount(String accountNumber, String accountIdentifier,
                      double balance) {

        this.accountNumber = accountNumber;
        this.accountIdentifier = accountIdentifier;
        this.balance = balance;

        accountCount++;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: Rs." + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn: Rs." + amount);
        }
    }

    // Getter method
    public double getBalance() {
        return balance;
    }
}

// Separate testing class
public class BankTest {

    public static void main(String[] args) {

        // Creating bank account objects
        SecureBankAccount b1 =
            new SecureBankAccount("ACC101", "ID001", 5000);

        SecureBankAccount b2 =
            new SecureBankAccount("ACC102", "ID002", 8000);

        System.out.println("BANK ACCOUNT DETAILS");

        System.out.println("\nAccount 1:");
        System.out.println("Initial Balance: Rs." + b1.getBalance());

        b1.deposit(2000);
        b1.withdraw(1500);

        System.out.println("Final Balance: Rs." + b1.getBalance());

        System.out.println("\nAccount 2:");
        System.out.println("Initial Balance: Rs." + b2.getBalance());

        b2.deposit(3000);
        b2.withdraw(12000);

        System.out.println("Final Balance: Rs." + b2.getBalance());

        // Display total accounts
        System.out.println("\nTotal Accounts Created: "
                           + SecureBankAccount.accountCount);
    }
}
