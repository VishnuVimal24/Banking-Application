package bankapp;

public class LoanAccount extends Account {
    public LoanAccount(String accNum, String holder, double bal) {
        super(accNum, holder, bal);
    }

    public void deposit(double amount) {
        balance -= amount; // Reducing loan amount
    }

    public void withdraw(double amount) {
        System.out.println("Withdrawals not allowed from Loan Account.");
    }

    public void showAccountType() {
        System.out.println("Account Type: Loan Account");
    }
}
