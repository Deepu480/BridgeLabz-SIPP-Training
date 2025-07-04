package OOPS.day5_Inheritance;

class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        System.out.println("Manager: " + name + ", ID: " + id + ", Salary: " + salary + ", Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        System.out.println("Developer: " + name + ", ID: " + id + ", Salary: " + salary + ", Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    int duration; // in months

    Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    @Override
    void displayDetails() {
        System.out.println("Intern: " + name + ", ID: " + id + ", Salary: " + salary + ", Duration: " + duration + " months");
    }
}

public class EmployeeSystemTest {
    public static void main(String[] args) {
        Employee[] employees = {
            new Manager("Alice", 101, 80000, 5),
            new Developer("Bob", 102, 60000, "Java"),
            new Intern("Charlie", 103, 20000, 6)
        };

        for (Employee e : employees) {
            e.displayDetails();
        }
    }
}

