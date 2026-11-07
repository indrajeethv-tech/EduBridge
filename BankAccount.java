class BankAccount {
    String account_holder_name;
    double balance;

    // Method to deposit amount
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited Amount: Rs." + amount);
    }

    // Method to withdraw amount
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn Amount: Rs." + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // Method to check balance
    void checkBalance() {
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Current Balance: Rs." + balance);
    }

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();

        // Assigning account details
        b1.account_holder_name = "Rahul";
        b1.balance = 5000;

        System.out.println("Initial Account Details:");
        b1.checkBalance();

        System.out.println("\nDepositing Money:");
        b1.deposit(2000);

        System.out.println("\nWithdrawing Money:");
        b1.withdraw(1500);

        System.out.println("\nFinal Account Details:");
        b1.checkBalance();
    }
}