package week04_day1_PracticesforJavaGenerics;

import java.util.*;

abstract class WarehouseItem {
    String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public abstract String getDetails();
}

class Electronics extends WarehouseItem {
    public Electronics(String name) {
        super(name);
    }

    public String getDetails() {
        return "Electronics: " + name;
    }
}

class Groceries extends WarehouseItem {
    public Groceries(String name) {
        super(name);
    }

    public String getDetails() {
        return "Groceries: " + name;
    }
}

class Furniture extends WarehouseItem {
    public Furniture(String name) {
        super(name);
    }

    public String getDetails() {
        return "Furniture: " + name;
    }
}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }

    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item.getDetails());
        }
    }
}
