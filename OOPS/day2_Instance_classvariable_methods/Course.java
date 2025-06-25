package OOPS.day2_Instance_classvariable_methods;

public class Course {
    String courseName;
    int duration; 
    double fee;
    static String instituteName = "Open Learning Academy"; 

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: ₹" + fee);
        System.out.println("Institute: " + instituteName);
    }
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 6, 3000);
        Course c2 = new Course("Web Development", 8, 4500);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        System.out.println("\n--- Updating Institute Name ---\n");
        Course.updateInstituteName("Tech Skill Academy");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
