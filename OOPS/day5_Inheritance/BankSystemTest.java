package OOPS.day5_Inheritance;

class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        displayDetails();
        System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int duration; // in months

    FixedDepositAccount(String accountNumber, double balance, int duration) {
        super(accountNumber, balance);
        this.duration = duration;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        displayDetails();
        System.out.println("Duration: " + duration + " months");
    }
}

public class BankSystemTest {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA1001", 50000, 4.5);
        CheckingAccount checking = new CheckingAccount("CA1002", 30000, 10000);
        FixedDepositAccount fixed = new FixedDepositAccount("FD1003", 100000, 12);

        System.out.println("---- Savings Account ----");
        savings.displayAccountType();

        System.out.println("\n---- Checking Account ----");
        checking.displayAccountType();

        System.out.println("\n---- Fixed Deposit Account ----");
        fixed.displayAccountType();
    }
}
