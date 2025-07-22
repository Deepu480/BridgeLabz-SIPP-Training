package week04_day1_PracticesforJavaGenerics;

abstract class ProductCategory {
    String name;

    public ProductCategory(String name) {
        this.name = name;
    }
}

class BookCategory extends ProductCategory {
    public BookCategory(String name) {
        super(name);
    }
}

class ClothingCategory extends ProductCategory {
    public ClothingCategory(String name) {
        super(name);
    }
}

class GadgetCategory extends ProductCategory {
    public GadgetCategory(String name) {
        super(name);
    }
}

class Product<T extends ProductCategory> {
    String productName;
    double price;
    T category;

    public Product(String productName, double price, T category) {
        this.productName = productName;
        this.price = price;
        this.category = category;
    }

    public void showDetails() {
        System.out.println(productName + " | " + price + " | Category: " + category.name);
    }
}

class MarketplaceUtil {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        product.price = product.price - (product.price * percentage / 100);
    }
}
