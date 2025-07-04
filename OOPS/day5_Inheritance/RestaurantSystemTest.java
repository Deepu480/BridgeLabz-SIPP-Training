package OOPS.day5_Inheritance;

// Interface
interface Worker {
    void performDuties();
}

// Superclass
class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

// Subclass implementing interface
class Chef extends Person implements Worker {
    String speciality;

    Chef(String name, int id, String speciality) {
        super(name, id);
        this.speciality = speciality;
    }

    @Override
    public void performDuties() {
        System.out.println("Chef " + name + " is cooking " + speciality + " dishes.");
    }
}

// Subclass implementing interface
class Waiter extends Person implements Worker {
    String shift;

    Waiter(String name, int id, String shift) {
        super(name, id);
        this.shift = shift;
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter " + name + " is serving customers during " + shift + " shift.");
    }
}

public class RestaurantSystemTest {
    public static void main(String[] args) {
        Chef chef = new Chef("Ramesh", 101, "Italian");
        Waiter waiter = new Waiter("Suresh", 102, "Evening");

        System.out.println("---- Chef Details ----");
        chef.displayInfo();
        chef.performDuties();

        System.out.println("\n---- Waiter Details ----");
        waiter.displayInfo();
        waiter.performDuties();
    }
}
