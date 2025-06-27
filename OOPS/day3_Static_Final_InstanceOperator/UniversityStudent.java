package OOPS.day3_Static_Final_InstanceOperator;

public class UniversityStudent {
    static String universityName = "ABC University";
    static int totalStudents = 0;
    private String name;
    private final int rollNumber;
    private String grade;
    public UniversityStudent(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }
    public void displayDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
    public void updateGrade(String newGrade) {
        this.grade = newGrade;
        System.out.println("Grade updated to: " + grade);
    }
    public static void displayTotalStudents() {
        System.out.println("Total students enrolled: " + totalStudents);
    }
    public static void checkAndDisplay(Object obj) {
        if (obj instanceof UniversityStudent) {
            System.out.println("Valid Student object detected.");
            UniversityStudent s = (UniversityStudent) obj;
            s.displayDetails();
        } else {
            System.out.println("The given object is not a Student.");
        }
    }
    public static void main(String[] args) {
        UniversityStudent s1 = new UniversityStudent("Alice", 101, "A");
        UniversityStudent s2 = new UniversityStudent("Bob", 102, "B");

        s1.displayDetails();
        System.out.println();
        s2.updateGrade("A+");

        System.out.println();
        displayTotalStudents();

        System.out.println();
        checkAndDisplay(s1);
        System.out.println();
        checkAndDisplay("Not a student");
    }
}

