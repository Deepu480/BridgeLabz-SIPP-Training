package week06_day01_PracticeLambdaExpressions;

import java.util.*;
import java.util.stream.*;

class Invoice {
    String transactionId;

    Invoice(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Invoice created for Transaction: " + transactionId;
    }
}

public class InvoiceCreation {
    public static void main(String[] args) {
        List<String> transactionIds = Arrays.asList("TXN001", "TXN002", "TXN003");

       
        List<Invoice> invoices = transactionIds.stream()
        .map(Invoice::new)
        .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}
