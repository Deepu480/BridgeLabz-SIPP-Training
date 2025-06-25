package OOPS.day2_JavaConstructors_Instance;

public class Circle {
    double radius;
    public Circle() {
        this(1.0); 
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();      
        Circle c2 = new Circle(3.5);    

        System.out.println("Default Circle:");
        c1.display();

        System.out.println("\nCustom Circle:");
        c2.display();
    }
}
