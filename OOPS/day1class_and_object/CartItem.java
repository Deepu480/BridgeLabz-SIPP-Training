package OOPS.day1class_and_object;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotal() {
        return price * quantity;
    }

    void displayItem() {
        System.out.println(itemName + " - ₹" + price + " x " + quantity + " = ₹" + getTotal());
    }

    public static void main(String[] args) {
        CartItem item1 = new CartItem("Book", 150, 2);
        CartItem item2 = new CartItem("Pen", 20, 5);

        double total = item1.getTotal() + item2.getTotal();

        item1.displayItem();
        item2.displayItem();
        System.out.println("Total Cart Cost: ₹" + total);
    }
}
