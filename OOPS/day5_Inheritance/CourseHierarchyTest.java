package OOPS.day5_Inheritance;

class Course {
    String courseName;
    int duration; // in hours

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayCourseInfo() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " hours");
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Fee: ₹" + fee + ", Discount: " + discount + "%");
    }
}

public class CourseHierarchyTest {
    public static void main(String[] args) {
        Course course = new Course("Java Basics", 20);
        OnlineCourse online = new OnlineCourse("Data Structures", 30, "Coursera", true);
        PaidOnlineCourse paid = new PaidOnlineCourse("Advanced Java", 40, "Udemy", true, 4999, 20);

        System.out.println("\n--- Course Info ---");
        course.displayCourseInfo();

        System.out.println("\n--- Online Course Info ---");
        online.displayCourseInfo();

        System.out.println("\n--- Paid Online Course Info ---");
        paid.displayCourseInfo();
    }
}
