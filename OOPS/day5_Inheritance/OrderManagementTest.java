package OOPS.day5_Inheritance;

import java.time.LocalDate;

class Order {
    int orderId;
    LocalDate orderDate;

    Order(int orderId, LocalDate orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, LocalDate orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order shipped, Tracking Number: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    LocalDate deliveryDate;

    DeliveredOrder(int orderId, LocalDate orderDate, String trackingNumber, LocalDate deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }
}

public class OrderManagementTest {
    public static void main(String[] args) {
        Order order = new Order(101, LocalDate.of(2025, 7, 1));
        ShippedOrder shipped = new ShippedOrder(102, LocalDate.of(2025, 7, 2), "TRK12345");
        DeliveredOrder delivered = new DeliveredOrder(103, LocalDate.of(2025, 7, 3), "TRK67890", LocalDate.of(2025, 7, 4));

        System.out.println("Order Status: " + order.getOrderStatus());
        System.out.println("Shipped Order Status: " + shipped.getOrderStatus());
        System.out.println("Delivered Order Status: " + delivered.getOrderStatus());
    }
}
