package week06_day04_WorkshoponJavaFeatures;

import java.util.*;
import java.util.stream.*;

class Passenger {
    private String name;
    private String route;
    private double fare;

    public Passenger(String name, String route, double fare) {
        this.name = name;
        this.route = route;
        this.fare = fare;
    }

    public String getName() { return name; }
    public String getRoute() { return route; }
    public double getFare() { return fare; }
}

public class StreamAPIExample {
    public static void main(String[] args) {
        List<Passenger> passengers = Arrays.asList(
            new Passenger("Alice", "Route A", 20.0),
            new Passenger("Bob", "Route B", 15.0),
            new Passenger("Charlie", "Route A", 20.0),
            new Passenger("David", "Route B", 15.0),
            new Passenger("Eva", "Route C", 25.0),
            new Passenger("Frank", "Route A", 20.0)
        );
        System.out.println("🔹 Passengers Grouped by Route:");
        Map<String, List<Passenger>> groupedByRoute = passengers.stream()
                .collect(Collectors.groupingBy(Passenger::getRoute));
        groupedByRoute.forEach((route, list) -> {
            System.out.println(route + " -> " + list.stream()
                                                   .map(Passenger::getName)
                                                   .collect(Collectors.toList()));
        });
        System.out.println("\n🔹 Total Revenue by Route:");
        Map<String, Double> revenueByRoute = passengers.stream()
                .collect(Collectors.groupingBy(Passenger::getRoute,
                        Collectors.summingDouble(Passenger::getFare)));
        revenueByRoute.forEach((route, revenue) ->
            System.out.println(route + " -> $" + revenue));
           System.out.println("\n🔹 Top Used Route:");
        String topRoute = passengers.stream()
                .collect(Collectors.groupingBy(Passenger::getRoute, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        System.out.println("Most used route is: " + topRoute);
    }
}

