package day3_Workshop;

import java.util.*;

//Interface: Graded
interface Graded {
 void assignGrade(String studentId, String courseCode, double grade);
}

//Base class: Student
class Student {
 protected String studentId;
 protected String name;
 protected List<Enrollment> enrollments;
 private double gpa; // Encapsulated GPA

 // Constructor
 public Student(String studentId, String name) {
     this.studentId = studentId;
     this.name = name;
     this.enrollments = new ArrayList<>();
 }

 // Optional: Constructor with elective preference
 public Student(String studentId, String name, String electivePreference) {
     this(studentId, name);
     System.out.println("Elective Preference: " + electivePreference);
 }

 // Enroll in a course
 public void enrollInCourse(Course course) {
     Enrollment enrollment = new Enrollment(this, course);
     enrollments.add(enrollment);
     course.addEnrollment(enrollment);
     System.out.println(name + " enrolled in " + course.courseName);
 }

 // GPA calculation
 public void calculateGPA() {
     double total = 0;
     int count = 0;
     for (Enrollment e : enrollments) {
         if (e.getGrade() >= 0) {
             total += e.getGrade();
             count++;
         }
     }
     this.gpa = count > 0 ? total / count : 0;
 }

 // Access transcript
 public void printTranscript() {
     System.out.println("\n--- Transcript for " + name + " ---");
     for (Enrollment e : enrollments) {
         System.out.println(e.getCourse().courseName + " - Grade: " + (e.getGrade() >= 0 ? e.getGrade() : "Not graded"));
     }
     calculateGPA();
     System.out.println("GPA: " + gpa);
 }

 public double getGPA() {
     return gpa;
 }
}

//Inheritance
class Undergraduate extends Student {
 public Undergraduate(String id, String name) {
     super(id, name);
 }
}

class Postgraduate extends Student {
 public Postgraduate(String id, String name) {
     super(id, name);
 }
}

//Class: Course
class Course {
 String courseCode;
 String courseName;
 List<Enrollment> enrollments;

 public Course(String courseCode, String courseName) {
     this.courseCode = courseCode;
     this.courseName = courseName;
     this.enrollments = new ArrayList<>();
 }

 public void addEnrollment(Enrollment e) {
     enrollments.add(e);
 }
}

//Class: Enrollment (Associates Student and Course)
class Enrollment {
 private Student student;
 private Course course;
 private double grade = -1; // -1 indicates not graded yet

 public Enrollment(Student student, Course course) {
     this.student = student;
     this.course = course;
 }

 public void setGrade(double grade) {
     if (grade >= 0 && grade <= 10) {
         this.grade = grade;
     }
 }

 public double getGrade() {
     return grade;
 }

 public Course getCourse() {
     return course;
 }

 public Student getStudent() {
     return student;
 }
}

//Faculty class implementing Graded
class Faculty implements Graded {
 String facultyId;
 String name;

 public Faculty(String id, String name) {
     this.facultyId = id;
     this.name = name;
 }

 // Assign grade to a student for a course
 public void assignGrade(String studentId, String courseCode, double grade) {
     for (Course c : University.courses) {
         if (c.courseCode.equals(courseCode)) {
             for (Enrollment e : c.enrollments) {
                 if (e.getStudent().studentId.equals(studentId)) {
                     e.setGrade(grade);
                     System.out.println("Grade " + grade + " assigned by " + name + " to " + e.getStudent().name + " for " + c.courseName);
                     return;
                 }
             }
         }
     }
     System.out.println("Enrollment not found for student " + studentId + " in course " + courseCode);
 }
}

//Utility class to hold university-wide lists
class University {
 static List<Course> courses = new ArrayList<>();
 static List<Student> students = new ArrayList<>();
}

//Main class
public class UniversitySystem {
 public static void main(String[] args) {
     // Courses
     Course java = new Course("CS101", "Java Programming");
     Course db = new Course("CS102", "Database Systems");
     University.courses.add(java);
     University.courses.add(db);

     // Students
     Student s1 = new Undergraduate("UG001", "Alice");
     Student s2 = new Postgraduate("PG001", "Bob");
     University.students.add(s1);
     University.students.add(s2);

     // Faculty
     Faculty profJohn = new Faculty("F001", "Prof. John");

     // Enrollment
     s1.enrollInCourse(java);
     s2.enrollInCourse(java);
     s2.enrollInCourse(db);

     // Assign Grades
     profJohn.assignGrade("UG001", "CS101", 8.5);
     profJohn.assignGrade("PG001", "CS101", 9.2);
     profJohn.assignGrade("PG001", "CS102", 8.0);

     // Transcripts
     s1.printTranscript();
     s2.printTranscript();

     // Compare GPA (operator usage simulation)
     System.out.println("\n--- GPA Comparison ---");
     if (s1.getGPA() > s2.getGPA()) {
         System.out.println(s1.name + " has higher GPA.");
     } else if (s1.getGPA() < s2.getGPA()) {
         System.out.println(s2.name + " has higher GPA.");
     } else {
         System.out.println("Both have equal GPA.");
     }
 }
}
