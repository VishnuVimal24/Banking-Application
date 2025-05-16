package bankapp;

import java.util.ArrayList;
import java.util.List;

public abstract class Bank {
    protected String bankName;
    protected String branchName;
    protected static int bankCounter = 1;
    protected static final String BANK_CODE_PREFIX = "BANK-";
    protected String bankCode;
    protected List<Account> accounts = new ArrayList<>();

    public Bank(String bankName, String branchName) {
        this.bankName = bankName;
        this.branchName = branchName;
        this.bankCode = generateBankCode();
    }

    private String generateBankCode() {
        return BANK_CODE_PREFIX + (bankCounter++);
    }

    public abstract void openAccount(Account account);

    public abstract void displayBankInfo();

    public void listAccounts() {
        for (Account acc : accounts) {
            System.out.println("--- Account Details ---");
            acc.displayAccountInfo();
            System.out.println();
        }
    }
}
