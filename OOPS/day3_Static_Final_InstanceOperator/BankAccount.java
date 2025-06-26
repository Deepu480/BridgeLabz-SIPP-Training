package OOPS.day3_Static_Final_InstanceOperator;

public class BankAccount {
    static String bankName = "State Bank of India";
    private static int totalAccounts = 0;

    private final int accountNumber;
    private String accountHolderName;

    public BankAccount(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1001, "Alice");
        BankAccount acc2 = new BankAccount(1002, "Bob");
        acc1.displayDetails();
        acc2.displayDetails();
        BankAccount.getTotalAccounts();
    }
}
