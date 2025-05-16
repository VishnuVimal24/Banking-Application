package bankapp;

public class NationalizedBank extends Bank {
    public NationalizedBank(String name, String branch) {
        super(name, branch);
    }

    public void openAccount(Account account) {
        accounts.add(account);
        System.out.println("Account opened in Nationalized Bank.");
    }

    public void displayBankInfo() {
        System.out.println("--- Bank Details ---");
        System.out.println("Bank Name: " + bankName);
        System.out.println("Branch: " + branchName);
        System.out.println("Bank Code: " + bankCode);
    }
}
