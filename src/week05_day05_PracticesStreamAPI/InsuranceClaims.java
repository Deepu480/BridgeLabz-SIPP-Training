package week05_day05_PracticesStreamAPI;

import java.util.*;
import java.util.stream.*;

class Claim {
    String claimType;
    double amount;

    Claim(String claimType, double amount) {
        this.claimType = claimType;
        this.amount = amount;
    }
}

public class InsuranceClaims {
    public static void main(String[] args) {
        List<Claim> claims = Arrays.asList(
            new Claim("Health", 5000),
            new Claim("Car", 12000),
            new Claim("Health", 7000),
            new Claim("Home", 20000),
            new Claim("Car", 15000),
            new Claim("Health", 8000),
            new Claim("Home", 25000)
        );

        Map<String, Double> avgClaims = claims.stream()
            .collect(Collectors.groupingBy(
                c -> c.claimType,
                Collectors.averagingDouble(c -> c.amount)
            ));

        System.out.println("Average Claim Amount by Type:");
        avgClaims.forEach((type, avg) -> 
            System.out.println(type + " : " + avg));
    }
}

