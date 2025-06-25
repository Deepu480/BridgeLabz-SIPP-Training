package OOPS.day2_JavaConstructors_Instance;

public class HotelBooking {
    String guestName;
    String roomType;
    int nights;
    public HotelBooking() {
        guestName = "Unknown";
        roomType = "Standard";
        nights = 1;
    }
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking();  
        HotelBooking booking2 = new HotelBooking("Amit", "Deluxe", 3);
        HotelBooking booking3 = new HotelBooking(booking2); 

        System.out.println("Default Booking:");
        booking1.display();

        System.out.println("\nParameterized Booking:");
        booking2.display();

        System.out.println("\nCopied Booking:");
        booking3.display();
    }
}

