import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Framework {
    public static void main(String[] args) {
        ArrayList<Integer> marksList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n1. Add Marks");
            System.out.println("2. Update Marks");
            System.out.println("3. Delete Marks");
            System.out.println("4. View All Marks");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                sc.next();
                continue;
            }

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter marks to add: ");
                    if (sc.hasNextInt()) {
                        int mark = sc.nextInt();
                        marksList.add(mark);
                        System.out.println("Marks added.");
                    } else {
                        System.out.println("Invalid input. Marks must be an integer.");
                        sc.next();
                    }
                    break;
                case 2:
                    System.out.print("Enter index to update: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < marksList.size()) {
                        System.out.print("Enter new marks: ");
                        int newMark = sc.nextInt();
                        marksList.set(index, newMark);
                        System.out.println("Marks updated.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 3:
                    System.out.print("Enter index to delete: ");
                    int delIndex = sc.nextInt();
                    if (delIndex >= 0 && delIndex < marksList.size()) {
                        marksList.remove(delIndex);
                        System.out.println("Marks deleted.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 4:
                    if (marksList.isEmpty()) {
                        System.out.println("No marks available.");
                    } else {
                        System.out.println("Student Marks List:");
                        Iterator<Integer> iterator = marksList.iterator();
                        while (iterator.hasNext()) {
                            System.out.println(iterator.next());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        sc.close();
    }
}
