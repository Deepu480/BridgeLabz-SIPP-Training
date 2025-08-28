package week05_day05_PracticesStreamAPI;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

class GymMember {
    String name;
    LocalDate expiryDate;

    GymMember(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return name + " (Expiry: " + expiryDate + ")";
    }
}

public class ExpiringMemberships {
    public static void main(String[] args) {
        List<GymMember> members = Arrays.asList(
            new GymMember("Rahul", LocalDate.now().plusDays(10)),
            new GymMember("Sneha", LocalDate.now().plusDays(45)),
            new GymMember("Amit", LocalDate.now().plusDays(25)),
            new GymMember("Priya", LocalDate.now().plusDays(5)),
            new GymMember("Vikram", LocalDate.now().plusDays(60))
        );

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        List<GymMember> expiringSoon = members.stream()
            .filter(m -> !m.expiryDate.isAfter(next30Days)) 
            .collect(Collectors.toList());

        System.out.println("Members with Expiring Memberships in Next 30 Days:");
        expiringSoon.forEach(System.out::println);
    }
}
