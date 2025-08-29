package week06_day03_JavaCollectors;

import java.util.*;
import java.util.stream.*;

class Order {
    private String customer;
    private double total;

    public Order(String customer, double total) {
        this.customer = customer;
        this.total = total;
    }
    public String getCustomer() { return customer; }
    public double getTotal() { return total; }
}

public class OrderRevenue {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
            new Order("Alice", 250.0),
            new Order("Bob", 300.0),
            new Order("Alice", 150.0),
            new Order("Charlie", 400.0),
            new Order("Bob", 200.0)
        );

        Map<String, Double> revenueByCustomer =
            orders.stream().collect(
                Collectors.groupingBy(Order::getCustomer,
                    Collectors.summingDouble(Order::getTotal))
            );

        System.out.println(revenueByCustomer);
    }
}
