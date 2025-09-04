package week06_day04_WorkshoponJavaFeatures;

interface GeoUtils {
    static double calculateDistance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy); 
    }
}

class Location {
    private String name;
    private double x;
    private double y;

    public Location(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() { return name; }
    public double getX() { return x; }
    public double getY() { return y; }
}

public class StaticMethodInterfaceExample {
    public static void main(String[] args) {
        Location station = new Location("Central Station", 10, 20);
        Location airport = new Location("Airport", 40, 60);
        double distance = GeoUtils.calculateDistance(
            station.getX(), station.getY(),
            airport.getX(), airport.getY()
        );

        System.out.println("Distance between " + station.getName() +
                           " and " + airport.getName() +
                           " = " + distance + " km");
    }
}
