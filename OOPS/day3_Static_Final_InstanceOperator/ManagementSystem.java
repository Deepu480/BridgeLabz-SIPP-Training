package OOPS.day3_Static_Final_InstanceOperator;

public class ManagementSystem {
    static String hospitalName = "Care Hospital";
    static int totalPatients = 0;
    final int patientID;
    String name, ailment;
    int age;

    public ManagementSystem(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void display() {
        if (this instanceof ManagementSystem) {
            System.out.println("ID: " + patientID + ", Name: " + name + ", Age: " + age + ", Ailment: " + ailment);
        }
    }

    public static void main(String[] args) {
        ManagementSystem p1 = new ManagementSystem(101, "Rakesh", 45, "Fever");
        p1.display();
        getTotalPatients();
    }
}
