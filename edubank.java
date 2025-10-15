interface Loan {
    void calculateInterest();
}

class HomeLoan implements Loan {
    private double amount;
    private double rate;

    public HomeLoan(double amount, double rate) {
        this.amount = amount;
        this.rate = rate;
    }

    public void calculateInterest() {
        double interest = (amount * rate * 1) / 100;
        System.out.println("Home Loan Interest: " + interest);
    }
}

class CarLoan implements Loan {
    private double amount;
    private double rate;

    public CarLoan(double amount, double rate) {
        this.amount = amount;
        this.rate = rate;
    }

    public void calculateInterest() {
        double interest = (amount * rate * 1) / 100;
        System.out.println("Car Loan Interest: " + interest);
    }
}

public class edubank {
    public static void main(String[] args) {
        Loan l1 = new HomeLoan(500000, 8);
        Loan l2 = new CarLoan(300000, 10);

        l1.calculateInterest();
        l2.calculateInterest();
    }
}