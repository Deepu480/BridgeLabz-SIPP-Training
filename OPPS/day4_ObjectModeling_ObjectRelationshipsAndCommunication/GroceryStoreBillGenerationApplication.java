package OPPS.day4_ObjectModeling_ObjectRelationshipsAndCommunication;

import java.util.*;


class Product {
    String name;
    double pricePerUnit;
    double quantity; // in kg or liters

    Product(String name, double pricePerUnit, double quantity) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    double getTotalPrice() {
        return pricePerUnit * quantity;
    }
}

// Represents a customer who buys multiple products
class Customer {
    String name;
    List<Product> products;

    Customer(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    void addProduct(Product product) {
        products.add(product);
    }

    List<Product> getProducts() {
        return products;
    }
}

// Responsible for generating the bill
class BillGenerator {
    static void generateBill(Customer customer) {
        System.out.println("Customer: " + customer.name);
        System.out.println("----- Grocery Bill -----");
        double total = 0.0;

        for (Product p : customer.getProducts()) {
            double cost = p.getTotalPrice();
            System.out.printf("%s - %.2f × $%.2f = $%.2f%n", p.name, p.quantity, p.pricePerUnit, cost);
            total += cost;
        }

        System.out.println("------------------------");
        System.out.printf("Total Bill: $%.2f%n", total);
    }
}

// Main class to simulate the application
public class GroceryStoreBillGenerationApplication {
    public static void main(String[] args) {
        // Create a customer
        Customer customer = new Customer("Alice");

        // Add products
        customer.addProduct(new Product("Apples", 3.0, 2.0));  // 2kg @ $3/kg
        customer.addProduct(new Product("Milk", 2.0, 1.0));    // 1L @ $2/L

        // Generate the bill
        BillGenerator.generateBill(customer);
    }
}
