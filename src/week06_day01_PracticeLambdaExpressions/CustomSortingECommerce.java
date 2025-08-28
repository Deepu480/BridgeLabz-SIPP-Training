package week06_day01_PracticeLambdaExpressions;

import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return name + " | Price: " + price + " | Rating: " + rating + " | Discount: " + discount + "%";
    }
}

public class CustomSortingECommerce {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Phone", 600, 4.5, 10),
            new Product("Laptop", 1200, 4.8, 15),
            new Product("Tablet", 300, 4.2, 5)
        );

        System.out.println("Sorting by Price:");
        products.stream().sorted((p1, p2) -> Double.compare(p1.price, p2.price))
                .forEach(System.out::println);

        System.out.println("\nSorting by Rating:");
        products.stream().sorted((p1, p2) -> Double.compare(p2.rating, p1.rating))
                .forEach(System.out::println);

        System.out.println("\nSorting by Discount:");
        products.stream().sorted((p1, p2) -> Double.compare(p2.discount, p1.discount))
                .forEach(System.out::println);
    }
}
