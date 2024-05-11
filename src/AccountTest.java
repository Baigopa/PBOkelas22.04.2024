public class AccountTest {
    public static void main(String[] args) {
        // Testing CheckingAccount
        CheckingAccount account = new CheckingAccount();
        account.setName("EPOS");
        account.setBalance(1000.0); // Initial balance

        System.out.println("Account Name: " + account.getName());
        System.out.println("Account Balance: $" + account.getBalance());
        account.withdraw(500.0);
        System.out.println("Final Balance: $" + account.getBalance());

        // Testing SavingsBond
        SavingsBond bond = new SavingsBond(24); // Create a bond with a term of 24 months
        bond.deposit(5000.0); // Deposit $5000 into the bond

        System.out.println("\nBond Term: " + bond.getTerm() + " months");
        System.out.println("Interest Rate: " + (bond.getInterestRate() * 100) + "%");
        System.out.println("Initial Bond Balance: $" + bond.getBalance());

        bond.calculateInterest(); // Calculate and add interest for the first month
        System.out.println("Balance after 1 month: $" + bond.getBalance());

        // Simulating 12 months passing and calculating interest monthly
        for (int i = 1; i <= 12; i++) {
            bond.calculateInterest();
            System.out.println("Balance after " + i + " months: $" + bond.getBalance());
        }
    }
}
