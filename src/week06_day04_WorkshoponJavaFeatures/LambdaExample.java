package week06_day04_WorkshoponJavaFeatures;

import java.util.*;

class TransportSchedule {
    private String serviceName;
    private String departureTime;
    private double fare;

    public TransportSchedule(String serviceName, String departureTime, double fare) {
        this.serviceName = serviceName;
        this.departureTime = departureTime;
        this.fare = fare;
    }

    public String getServiceName() { return serviceName; }
    public String getDepartureTime() { return departureTime; }
    public double getFare() { return fare; }

    @Override
    public String toString() {
        return serviceName + " | Departure: " + departureTime + " | Fare: " + fare;
    }
}

public class LambdaExample {
    public static void main(String[] args) {
        List<TransportSchedule> schedules = Arrays.asList(
            new TransportSchedule("Bus A", "08:30", 20.0),
            new TransportSchedule("Metro X", "08:00", 15.0),
            new TransportSchedule("Taxi T1", "08:15", 50.0),
            new TransportSchedule("Bus B", "08:45", 18.0)
        );

        System.out.println("🔹 All Schedules:");
        schedules.forEach(System.out::println);
        System.out.println("\n🔹 Services with fare < 30:");
        schedules.stream()
                 .filter(s -> s.getFare() < 30)
                 .forEach(System.out::println);
        System.out.println("\n🔹 Sorted by earliest departure:");
        schedules.stream()
                 .sorted((s1, s2) -> s1.getDepartureTime().compareTo(s2.getDepartureTime()))
                 .forEach(System.out::println);
    }
}
