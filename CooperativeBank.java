package bankapp;

public class CooperativeBank extends Bank {
    public CooperativeBank(String name, String branch) {
        super(name, branch);
    }

    public void openAccount(Account account) {
        accounts.add(account);
        System.out.println("Account opened in Cooperative Bank.");
    }

    public void displayBankInfo() {
        System.out.println("--- Bank Details ---");
        System.out.println("Bank Name: " + bankName);
        System.out.println("Branch: " + branchName);
        System.out.println("Bank Code: " + bankCode);
    }
}
