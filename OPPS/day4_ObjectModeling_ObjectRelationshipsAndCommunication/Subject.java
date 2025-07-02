package OPPS.day4_ObjectModeling_ObjectRelationshipsAndCommunication;
import java.util.*;

class Subject {
    String name;
    int marks;

    public Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class Student {
    String name;
    List<Subject> subjects = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void addSubject(Subject s) {
        subjects.add(s);
    }

    public double getAverage() {
        int total = 0;
        for (Subject s : subjects) {
            total += s.marks;
        }
        return subjects.size() > 0 ? (double) total / subjects.size() : 0;
    }
}

class GradeCalculator {
    public String calculateGrade(Student student) {
        double average = student.getAverage();
        if (average >= 90) return "A";
        else if (average >= 75) return "B";
        else if (average >= 60) return "C";
        else return "D";
    }
}

