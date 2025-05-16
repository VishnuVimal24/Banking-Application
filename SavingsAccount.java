package bankapp;

public class SavingsAccount extends Account {
    public SavingsAccount(String accNum, String holder, double bal) {
        super(accNum, holder, bal);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) balance -= amount;
        else System.out.println("Insufficient funds.");
    }

    public void showAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}
