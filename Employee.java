import java.util.Scanner;

class EmployeeInfo {
    private String name;
    private String department;
    private int age;

    public EmployeeInfo(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }
}

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee name: ");
        String name = sc.nextLine();

        System.out.print("Age Of The Employee: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.print("Department Employee Works on: ");
        String department = sc.nextLine();

        EmployeeInfo employee = new EmployeeInfo(name, age, department);
        employee.display();

        if (args.length > 0) {
            System.out.println("\nBatch Update Information:");
            for (String arg : args) {
                System.out.println("Updating employee with info: " + arg);
            }
        }
        sc.close();
    }
}