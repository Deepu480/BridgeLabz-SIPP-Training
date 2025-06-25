package OOPS.day2_JavaConstructors_Instance;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    
    public CarRental() {
        customerName = "Unknown";
        carModel = "Standard";
        rentalDays = 1;
    }
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }
    public double calculateTotalCost() {
        double dailyRate;
        switch (carModel.toLowerCase()) {
            case "suv": dailyRate = 2500; break;
            case "sedan": dailyRate = 1800; break;
            case "hatchback": dailyRate = 1200; break;
            default: dailyRate = 1500; 
        }
        return dailyRate * rentalDays;
    }

    public void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental rental1 = new CarRental();  
        CarRental rental2 = new CarRental("Sneha", "SUV", 4); 

        System.out.println("Default Rental:");
        rental1.display();

        System.out.println("\nCustom Rental:");
        rental2.display();
    }
}
