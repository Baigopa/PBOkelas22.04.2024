public class CheckingAccount {
    private String name;
    private double balance;

    // Constructor
    public CheckingAccount() {
        // Default constructor
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Error: Withdrawal amount cannot be negative.");
        } else if (amount > balance) {
            System.out.println("Warning: Insufficient funds. Cannot withdraw $" + amount);
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
        }
    }
}
