package week04_day02_Collection;

import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        HashMap<String, Double> productPrices = new HashMap<>();
        productPrices.put("Laptop", 85000.0);
        productPrices.put("Mouse", 800.0);
        productPrices.put("Keyboard", 1200.0);
        LinkedHashMap<String, Double> addedItems = new LinkedHashMap<>();
        addedItems.put("Laptop", 85000.0);
        addedItems.put("Mouse", 800.0);
        addedItems.put("Keyboard", 1200.0);
        TreeMap<Double, String> sortedByPrice = new TreeMap<>();
        for (Map.Entry<String, Double> entry : productPrices.entrySet()) {
            sortedByPrice.put(entry.getValue(), entry.getKey());
        }

        System.out.println("Items Added to Cart (Order Added):");
        for (Map.Entry<String, Double> entry : addedItems.entrySet()) {
            System.out.println(entry.getKey() + " => ₹" + entry.getValue());
        }

        System.out.println("\nItems Sorted by Price:");
        for (Map.Entry<Double, String> entry : sortedByPrice.entrySet()) {
            System.out.println(entry.getValue() + " => ₹" + entry.getKey());
        }
    }
}
