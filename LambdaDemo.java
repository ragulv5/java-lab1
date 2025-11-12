import java.util.*;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return name + " - $" + price;
    }
}

public class LambdaDemo {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1200.50));
        products.add(new Product("Phone", 800.99));
        products.add(new Product("Headphones", 150.75));
        products.add(new Product("Monitor", 300.40));

        System.out.println("Original Product List:");
        products.forEach(p -> System.out.println(p));

        products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        System.out.println("\nSorted by Price:");
        products.forEach(p -> System.out.println(p));

        products.sort((p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName()));
        System.out.println("\nSorted by Name:");
        products.forEach(p -> System.out.println(p));
    }
}
