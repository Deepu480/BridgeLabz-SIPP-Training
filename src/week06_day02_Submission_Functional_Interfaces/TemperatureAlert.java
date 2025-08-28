package week06_day02_Submission_Functional_Interfaces;

import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {
        double threshold = 30.0;
        Predicate<Double> isHighTemp = temp -> temp > threshold;

        double currentTemp = 32.5;

        if (isHighTemp.test(currentTemp)) {
            System.out.println("ALERT: Temperature " + currentTemp + "°C is above threshold!");
        } else {
            System.out.println("Temperature " + currentTemp + "°C is normal.");
        }
    }
}
