public class SavingsBond {
    private int termMonths;
    private double interestRate;
    private double balance;

    // Constructor
    public SavingsBond(int termMonths) {
        setTerm(termMonths);
        calculateInterestRate();
        this.balance = 0.0; // Initial balance is zero
    }

    // Getter and Setter methods
    public int getTerm() {
        return termMonths;
    }

    public void setTerm(int termMonths) {
        if (termMonths < 1 || termMonths > 60) {
            throw new IllegalArgumentException("Term must be between 1 and 60 months.");
        }
        this.termMonths = termMonths;
    }

    public double getInterestRate() {
        return interestRate;
    }

    private void calculateInterestRate() {
        if (termMonths >= 0 && termMonths <= 11) {
            interestRate = 0.005; // 0.5%
        } else if (termMonths >= 12 && termMonths <= 23) {
            interestRate = 0.01; // 1.0%
        } else if (termMonths >= 24 && termMonths <= 35) {
            interestRate = 0.015; // 1.5%
        } else if (termMonths >= 36 && termMonths <= 47) {
            interestRate = 0.02; // 2.0%
        } else {
            interestRate = 0.025; // 2.5%
        }
    }

    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the bond
    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit amount cannot be negative.");
        }
        this.balance += amount;
    }

    // Method to calculate and add interest every month
    public void calculateInterest() {
        double monthlyInterest = balance * interestRate;
        balance += monthlyInterest;
    }
}
