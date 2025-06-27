package OOPS.day3_Static_Final_InstanceOperator;



public class Vehicle {
    static int registrationFee = 5000;
    final String registrationNumber;
    String ownerName, vehicleType;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    
    static void updateRegistrationFee(int newFee) {
        registrationFee = newFee;
    }

    void display() {
        if (this instanceof  Vehicle) {
            System.out.println("Owner: " + ownerName + ", Type: " + vehicleType + ", Reg No: " + registrationNumber + ", Fee: " + registrationFee);
        }
    }

    public static void main(String[] args) {
    	 Vehicle v1 = new  Vehicle("Sana", "Car", "MH1234");
        v1.display();
        updateRegistrationFee(6000);
        v1.display();
    }
}
