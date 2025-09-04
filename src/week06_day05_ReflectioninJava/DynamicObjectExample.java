package week06_day05_ReflectioninJava;

class Student {
    private String name;
    public Student() {
        this.name = "Default Student";
    }
    public String getName() {
        return name;
    }
}

public class DynamicObjectExample {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("Student");
        Object obj = cls.getDeclaredConstructor().newInstance();

        Student s = (Student) obj;
        System.out.println("Student Name: " + s.getName());
    }
}
