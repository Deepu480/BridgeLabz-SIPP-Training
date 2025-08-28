package week06_day01_PracticeLambdaExpressions;

import java.util.*;

public class PatientIDPrinting {
    public static void main(String[] args) {
        List<String> patientIDs = Arrays.asList("P1001", "P1002", "P1003", "P1004");
        patientIDs.forEach(System.out::println);
    }
}

