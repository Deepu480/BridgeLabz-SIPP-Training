package OOPS.day2_access_modifiers;

class UniversityManagementSystem {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }
}
class PostgraduateStudent extends UniversityManagementSystem {
    public void displayStudentInfo() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA (via getter): " + getCGPA());
    }
}

