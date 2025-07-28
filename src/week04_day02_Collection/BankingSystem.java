package week04_day02_Collection;

import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {
        HashMap<String, Double> accounts = new HashMap<>();
        accounts.put("ACC123", 50000.0);
        accounts.put("ACC456", 25000.0);
        accounts.put("ACC789", 75000.0);
        TreeMap<Double, String> sortedAccounts = new TreeMap<>();
        for (Map.Entry<String, Double> entry : accounts.entrySet()) {
            sortedAccounts.put(entry.getValue(), entry.getKey());
        }
        Queue<String> withdrawalQueue = new LinkedList<>();
        withdrawalQueue.add("ACC123");
        withdrawalQueue.add("ACC789");

        System.out.println("Customer Balances:");
        for (Map.Entry<String, Double> entry : accounts.entrySet()) {
            System.out.println(entry.getKey() + " => ₹" + entry.getValue());
        }

        System.out.println("\nCustomers Sorted by Balance:");
        for (Map.Entry<Double, String> entry : sortedAccounts.entrySet()) {
            System.out.println(entry.getValue() + " => ₹" + entry.getKey());
        }

        System.out.println("\nProcessing Withdrawal Requests:");
        while (!withdrawalQueue.isEmpty()) {
            String accNum = withdrawalQueue.poll();
            System.out.println("Processing withdrawal for: " + accNum);
        }
    }
}
