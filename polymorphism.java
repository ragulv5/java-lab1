abstract class Account {
    String accNo;
    String name;
    double balance;

    Account(String accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    void showDetails() {
        System.out.println("Account No: " + accNo);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}

class SavingsAccount extends Account {
    SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (balance >= amount)
            balance = balance - amount;
        else
            System.out.println("Not enough money in Savings Account");
    }
}

class CurrentAccount extends Account {
    CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (balance >= amount)
            balance = balance - amount;
        else
            System.out.println("Not enough money in Current Account");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Account acc1 = new SavingsAccount("S001", "Alice", 5000);
        Account acc2 = new CurrentAccount("C001", "Bob", 10000);

        acc1.deposit(1000);
        acc1.withdraw(2000);

        acc2.deposit(2000);
        acc2.withdraw(12000);

        acc1.showDetails();
        acc2.showDetails();
    }
}