package OOPS.day2_access_modifiers;
class EmployeeRecords {
    public int employeeID;
    protected String department;
    private double salary;

    public void updateSalary(double newSalary) {
        if (newSalary > 0) {
            salary = newSalary;
        }
    }

    public double getSalary() {
        return salary;
    }
}
class Manager extends EmployeeRecords {
    public void displayManagerInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary (via getter): " + getSalary());
    }
}
