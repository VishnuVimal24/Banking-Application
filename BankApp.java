package bankapp;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = null;

        System.out.println("Choose Bank Type:");
        System.out.println("1. Nationalized Bank");
        System.out.println("2. Cooperative Bank");
        int bankChoice = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Bank Name: ");
        String bankName = sc.nextLine();
        System.out.print("Enter Branch Name: ");
        String branchName = sc.nextLine();

        if (bankChoice == 1) {
            bank = new NationalizedBank(bankName, branchName);
        } else if (bankChoice == 2) {
            bank = new CooperativeBank(bankName, branchName);
        } else {
            System.out.println("Invalid Bank Type.");
            return;
        }

        System.out.println("\nChoose Account Type:");
        System.out.println("1. Savings");
        System.out.println("2. Current");
        System.out.println("3. Loan");
        int accType = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Number: ");
        String accNum = sc.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String holder = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        Account account = null;
        switch (accType) {
            case 1:
                account = new SavingsAccount(accNum, holder, balance);
                break;
            case 2:
                account = new CurrentAccount(accNum, holder, balance);
                break;
            case 3:
                account = new LoanAccount(accNum, holder, balance);
                break;
            default:
                System.out.println("Invalid Account Type.");
                return;
        }

        bank.openAccount(account);

        
        System.out.print("\nEnter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        
        System.out.println("\n--- Final Bank & Account Details ---");
        bank.displayBankInfo();
        bank.listAccounts();

        sc.close();
    }
}

