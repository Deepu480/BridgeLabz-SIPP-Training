package week06_day04_WorkshoponJavaFeatures;

import java.util.*;

class TransportServiceUtil {
     public static double applyDiscount(double fare) {
        return fare * 0.9; 
    }
}

class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> services = Arrays.asList("Bus Service", "Metro Service", "Taxi Service");

        System.out.println("🔹 Available Services:");
        services.forEach(System.out::println);
        List<Double> fares = Arrays.asList(50.0, 30.0, 100.0);

        System.out.println("\n🔹 Original Fares: " + fares);

        System.out.println("🔹 Discounted Fares:");
        fares.stream()
             .map(TransportServiceUtil::applyDiscount) 
             .forEach(System.out::println);
    }
}
