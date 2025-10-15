class LowBalanceException extends Exception {
}

class BankAccount {
    double balance;
    
    public BankAccount(double startingMoney) {
        balance = startingMoney;
    }
    
    public void withdraw(double amount) throws LowBalanceException {
        if (amount > balance) {
            throw new LowBalanceException();
        }
        balance = balance - amount;
        System.out.println("Money withdrawn! New balance: $" + balance);
    }
}

public class exceptionError {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.0);
        
        try {
            account.withdraw(50.0);
            account.withdraw(60.0);
        } catch (LowBalanceException e) {
            System.out.println("Sorry, not enough balance! Cannot withdraw.");
        }
        
        System.out.println("Final balance: $" + account.balance);
    }
}