package Week1_day1;

import java.util.LinkedList;
import java.util.Queue;

class Customer {
    String name;
    boolean isEmergency;

    public Customer(String name, boolean isEmergency) {
        this.name = name;
        this.isEmergency = isEmergency;
    }
}

class CallCenterQueue {
    private Queue<Customer> normalQueue = new LinkedList<>();
    private Queue<Customer> emergencyQueue = new LinkedList<>();

    // Add customer
    public void addCustomer(Customer customer) {
        if (customer.isEmergency) {
            emergencyQueue.add(customer);
        } else {
            normalQueue.add(customer);
        }
    }

    // Serve next customer
    public Customer serveCustomer() {
        if (!emergencyQueue.isEmpty()) {
            return emergencyQueue.poll();
        } else if (!normalQueue.isEmpty()) {
            return normalQueue.poll();
        } else {
            return null;
        }
    }
}

public class CallCenterDemo {
    public static void main(String[] args) {
        CallCenterQueue callCenter = new CallCenterQueue();

        callCenter.addCustomer(new Customer("Alice", false));
        callCenter.addCustomer(new Customer("Bob", true));
        callCenter.addCustomer(new Customer("Charlie", false));
        callCenter.addCustomer(new Customer("David", true));

        Customer next;
        while ((next = callCenter.serveCustomer()) != null) {
            System.out.println("Serving: " + next.name + 
                               (next.isEmergency ? " (Emergency)" : " (Normal)"));
        }
    }
}

