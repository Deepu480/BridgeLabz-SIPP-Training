
package OOPS.day3_Static_Final_InstanceOperator;

public class Employee {
    static String companyName = "TechSoft Pvt Ltd";
    private static int totalEmployees = 0;

    private final int id;
    private String name;
    private String designation;

    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Rahul", "Developer");
        Employee e2 = new Employee(2, "Neha", "Tester");
        e1.displayDetails();
        e2.displayDetails();
        displayTotalEmployees();
    }
}
