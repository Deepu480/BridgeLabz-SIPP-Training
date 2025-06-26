package OOPS.day2_access_modifiers;
class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
class SavingsAccount extends BankAccount {
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance (via getter): " + getBalance());
    }
}

