package day6_Workshop;

abstract class Checkpoint {
    String checkpointId;
    String locationName;
    double distanceFromLast;
    int expectedDuration;
    int actualDuration;

    public Checkpoint(String checkpointId, String locationName, double distanceFromLast, int expectedDuration, int actualDuration) {
        this.checkpointId = checkpointId;
        this.locationName = locationName;
        this.distanceFromLast = distanceFromLast;
        this.expectedDuration = expectedDuration;
        this.actualDuration = actualDuration;
    }

    public boolean isDelayed() {
        return actualDuration > expectedDuration;
    }

    public abstract boolean isCritical();
    public abstract String getType();
    public abstract double calculatePenalty();
}

// DELIVERY
class DeliveryCheckpoint extends Checkpoint {
    public DeliveryCheckpoint(String id, String loc, double dist, int exp, int act) {
        super(id, loc, dist, exp, act);
    }

    public boolean isCritical() { return true; }
    public String getType() { return "DeliveryCheckpoint"; }

    public double calculatePenalty() {
        return isDelayed() ? (actualDuration - expectedDuration) * 2.0 : 0.0;
    }
}

// FUEL
class FuelCheckpoint extends Checkpoint {
    public FuelCheckpoint(String id, String loc, double dist, int exp, int act) {
        super(id, loc, dist, exp, act);
    }

    public boolean isCritical() { return true; }
    public String getType() { return " FuelCheckpoint"; }

    public double calculatePenalty() {
        return isDelayed() ? 10.0 : 0.0;
    }
}

// REST
class RestCheckpoint extends Checkpoint {
    public RestCheckpoint(String id, String loc, double dist, int exp, int act) {
        super(id, loc, dist, exp, act);
    }

    public boolean isCritical() { return false; }
    public String getType() { return "RestCheckpoint"; }

    public double calculatePenalty() {
        return (actualDuration - expectedDuration > 30) ? (actualDuration - expectedDuration) * 0.5 : 0.0;
    }
}

// NODE + LINKED LIST
class Node<T> {
    T data;
    Node<T> next;
    Node(T data) { this.data = data; this.next = null; }
}

class RouteLinkedList<T extends Checkpoint> {
    private Node<T> head;

    public void addCheckpoint(T checkpoint) {
        Node<T> newNode = new Node<>(checkpoint);
        if (head == null) head = newNode;
        else {
            Node<T> temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }

    public boolean removeCheckpoint(String checkpointId) {
        if (head == null) return false;
        if (head.data.checkpointId.equals(checkpointId)) {
            head = head.next;
            return true;
        }

        Node<T> prev = head;
        Node<T> curr = head.next;

        while (curr != null) {
            if (curr.data.checkpointId.equals(checkpointId)) {
                prev.next = curr.next;
                return true;
            }
            prev = curr;
            curr = curr.next;
        }
        return false;
    }

    public T findCheckpoint(String checkpointId) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.checkpointId.equals(checkpointId)) return temp.data;
            temp = temp.next;
        }
        return null;
    }

    public double computeTotalDistance() {
        double total = 0;
        Node<T> temp = head;
        while (temp != null) {
            total += temp.data.distanceFromLast;
            temp = temp.next;
        }
        return total;
    }

    public double computeTotalPenalty() {
        double penalty = 0;
        Node<T> temp = head;
        while (temp != null) {
            penalty += temp.data.calculatePenalty();
            temp = temp.next;
        }
        return penalty;
    }

    public boolean checkCriticalPoints() {
        boolean hasDelivery = false, hasFuel = false;
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data instanceof DeliveryCheckpoint) hasDelivery = true;
            if (temp.data instanceof FuelCheckpoint) hasFuel = true;
            temp = temp.next;
        }
        return hasDelivery && hasFuel;
    }

    public void printRoute() {
        Node<T> temp = head;
        int count = 1;
        while (temp != null) {
            Checkpoint cp = temp.data;
            String status = cp.isDelayed() ? "Delayed" : "On Time";
            System.out.printf("%d. %s – %s – %s – Penalty: %.1f\n",
                    count++, cp.getType(), cp.locationName, status, cp.calculatePenalty());
            temp = temp.next;
        }
    }
}

// DRIVER CLASS
class Driver {
    String driverId;
    String name;
    RouteLinkedList<Checkpoint> routeHistory = new RouteLinkedList<>();

    public Driver(String driverId, String name) {
        this.driverId = driverId;
        this.name = name;
    }

    public void addCheckpoint(Checkpoint cp) {
        routeHistory.addCheckpoint(cp);
    }

    public void showSummary() {
        System.out.println("Driver: " + driverId + " – " + name);
        System.out.println("Route Summary:");
        routeHistory.printRoute();

        double totalDistance = routeHistory.computeTotalDistance();
        double totalPenalty = routeHistory.computeTotalPenalty();
        double score = totalDistance - totalPenalty;
        boolean isConsistent = routeHistory.checkCriticalPoints();

        System.out.println("Total Distance: " + totalDistance + " km");
        System.out.println("Total Penalty: " + totalPenalty);
        System.out.println("Route Score: " + score);
        System.out.println("Critical Route Check: " +
                (isConsistent ? "All required checkpoints present" : "Missing critical checkpoints"));
    }
}

// MAIN
public class RouteTrackerSystem {
    public static void main(String[] args) {
        Driver d1 = new Driver("D1204", "Kavita Nair");

        d1.addCheckpoint(new DeliveryCheckpoint("C1", "Warehouse A", 30, 60, 70));
        d1.addCheckpoint(new FuelCheckpoint("C2", "Pump 12", 40, 20, 20));
        d1.addCheckpoint(new RestCheckpoint("C3", "Motel X", 20, 30, 65));
        d1.addCheckpoint(new DeliveryCheckpoint("C4", "Client Hub", 30, 45, 60));

        d1.showSummary();
    }
}

