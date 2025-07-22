package week04_day1_PracticesforJavaGenerics;

import java.util.*;

abstract class CourseType {
    String title;

    public CourseType(String title) {
        this.title = title;
    }

    public abstract String getEvaluationMethod();
}

class ExamCourse extends CourseType {
    public ExamCourse(String title) {
        super(title);
    }

    public String getEvaluationMethod() {
        return "Exam-Based";
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String title) {
        super(title);
    }

    public String getEvaluationMethod() {
        return "Assignment-Based";
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String title) {
        super(title);
    }

    public String getEvaluationMethod() {
        return "Research-Based";
    }
}

class Course<T extends CourseType> {
    T type;

    public Course(T type) {
        this.type = type;
    }

    public void printCourseInfo() {
        System.out.println("Course: " + type.title + ", Evaluation: " + type.getEvaluationMethod());
    }

    public static void printAllCourses(List<? extends CourseType> courseList) {
        for (CourseType ct : courseList) {
            System.out.println(ct.title + " - " + ct.getEvaluationMethod());
        }
    }
}
