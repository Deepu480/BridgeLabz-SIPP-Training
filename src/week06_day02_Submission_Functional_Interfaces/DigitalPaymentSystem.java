package week06_day02_Submission_Functional_Interfaces;

interface Payment {
 void pay(double amount);
}
class UPI implements Payment {
 public void pay(double amount) {
     System.out.println("Paid ₹" + amount + " using UPI.");
 }
}

class CreditCard implements Payment {
 public void pay(double amount) {
     System.out.println("Paid ₹" + amount + " using Credit Card.");
 }
}

class Wallet implements Payment {
 public void pay(double amount) {
     System.out.println("Paid ₹" + amount + " using Wallet.");
 }
}

public class DigitalPaymentSystem {
 public static void main(String[] args) {
     Payment upi = new UPI();
     Payment creditCard = new CreditCard();
     Payment wallet = new Wallet();

     upi.pay(500.0);
     creditCard.pay(1200.0);
     wallet.pay(300.0);
 }
}
