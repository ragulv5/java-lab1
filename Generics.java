import java.util.ArrayList;
import java.util.List;

class Box<T> {
    private List<T> items;

    public Box() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public void displayItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}

public class Generics {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.addItem(10);
        intBox.addItem(20);
        intBox.addItem(30);
        System.out.println("📦 Integer Box contents:");
        intBox.displayItems();

        Box<Double> doubleBox = new Box<>();
        doubleBox.addItem(3.14);
        doubleBox.addItem(2.71);
        System.out.println("\n📦 Double Box contents:");
        doubleBox.displayItems();

        Box<String> stringBox = new Box<>();
        stringBox.addItem("Apples");
        stringBox.addItem("Bananas");
        stringBox.addItem("Cherries");
        System.out.println("\n📦 String Box contents:");
        stringBox.displayItems();
    }
}
