package OOPS.day2_Instance_classvariable_methods;

public class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 1500; 
    
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Deepak", "Scooter");
        Vehicle v2 = new Vehicle("Neha", "Car");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        System.out.println("\n--- Updating Registration Fee ---\n");
        Vehicle.updateRegistrationFee(2000);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
