package week05_day05_PracticesStreamAPI;

import java.util.*;
import java.util.stream.*;

class Doctor {
    String name;
    String specialty;
    boolean availableOnWeekend;

    Doctor(String name, String specialty, boolean availableOnWeekend) {
        this.name = name;
        this.specialty = specialty;
        this.availableOnWeekend = availableOnWeekend;
    }

    @Override
    public String toString() {
        return name + " - " + specialty + " (Weekend: " + availableOnWeekend + ")";
    }
}

public class HospitalDoctors {
    public static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. Sharma", "Cardiologist", true),
            new Doctor("Dr. Verma", "Neurologist", false),
            new Doctor("Dr. Singh", "Dermatologist", true),
            new Doctor("Dr. Mehta", "Orthopedic", true),
            new Doctor("Dr. Rao", "Pediatrician", false)
        );

        List<Doctor> weekendDoctors = doctors.stream()
            .filter(d -> d.availableOnWeekend) 
            .sorted(Comparator.comparing(d -> d.specialty)) 
            .collect(Collectors.toList());

        System.out.println("Doctors Available on Weekends:");
        weekendDoctors.forEach(System.out::println);
    }
}

