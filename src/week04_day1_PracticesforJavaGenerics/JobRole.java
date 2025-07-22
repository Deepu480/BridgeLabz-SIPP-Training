package week04_day1_PracticesforJavaGenerics;

import java.util.*;

abstract class JobRole {
    String title;

    public JobRole(String title) {
        this.title = title;
    }

    public abstract String getResponsibilities();
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() {
        super("Software Engineer");
    }

    public String getResponsibilities() {
        return "Develop and maintain software systems.";
    }
}

class DataScientist extends JobRole {
    public DataScientist() {
        super("Data Scientist");
    }

    public String getResponsibilities() {
        return "Analyze data and build predictive models.";
    }
}

class ProductManager extends JobRole {
    public ProductManager() {
        super("Product Manager");
    }

    public String getResponsibilities() {
        return "Lead product strategy and execution.";
    }
}

class Resume<T extends JobRole> {
    private T role;
    private String candidateName;

    public Resume(String candidateName, T role) {
        this.candidateName = candidateName;
        this.role = role;
    }

    public void processResume() {
        System.out.println("Processing resume for " + candidateName + " - Role: " + role.title);
        System.out.println("Responsibilities: " + role.getResponsibilities());
    }

    public static void displayAllResumes(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println(role.title + ": " + role.getResponsibilities());
        }
    }
}
