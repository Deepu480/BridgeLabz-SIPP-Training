package week06_day04_WorkshoponJavaFeatures;

interface TransportService {
    String getServiceName();
    String getRoute();
default void printServiceDetails() {
        System.out.println("Service: " + getServiceName() + " | Route: " + getRoute());
    }
}

class BusService implements TransportService {
    private String serviceName;
    private String route;

    public BusService(String serviceName, String route) {
        this.serviceName = serviceName;
        this.route = route;
    }

    public String getServiceName() { return serviceName; }
    public String getRoute() { return route; }
}

class MetroService implements TransportService {
    private String serviceName;
    private String route;

    public MetroService(String serviceName, String route) {
        this.serviceName = serviceName;
        this.route = route;
    }

    public String getServiceName() { return serviceName; }
    public String getRoute() { return route; }
}

class TaxiService implements TransportService {
    private String serviceName;
    private String route;

    public TaxiService(String serviceName, String route) {
        this.serviceName = serviceName;
        this.route = route;
    }

    public String getServiceName() { return serviceName; }
    public String getRoute() { return route; }

    // Override default method (optional)
    @Override
    public void printServiceDetails() {
        System.out.println("🚖 Taxi Service: " + serviceName + " | Route: " + route);
    }
}

public class DefaultMethodExample {
    public static void main(String[] args) {
        TransportService bus = new BusService("City Bus A", "Downtown - Airport");
        TransportService metro = new MetroService("Metro Red Line", "Central - Tech Park");
        TransportService taxi = new TaxiService("Taxi T1", "Mall - University");

        // Default method in action
        bus.printServiceDetails();
        metro.printServiceDetails();
        taxi.printServiceDetails(); // overridden method
    }
}
