package oopsandexceptions;

class InvalidAccountException extends Exception { 
    public InvalidAccountException(String message) {
        super(message); // Pass the message to the parent Exception class.
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) throws InvalidAccountException {
        if (amount > balance) {
            // Throw our custom exception if the business rule is violated.
            throw new InvalidAccountException("Withdrawal failed: Insufficient funds.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }
}

public class Task55_AccountException {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.00);
        System.out.println("Initial balance: " + account.getBalance());

        // --- Scenario 1: Successful Withdrawal ---
        try {
            System.out.println("\nAttempting to withdraw 200.00...");
            account.withdraw(200.00);
        } catch (InvalidAccountException e) {
            System.err.println("Error: " + e.getMessage());
        }

        // --- Scenario 2: Withdrawal that throws the custom exception ---
        try {
            System.out.println("\nAttempting to withdraw 400.00...");
            account.withdraw(400.00); 
        } catch (InvalidAccountException e) {
            System.err.println("Error: " + e.getMessage());
        }
        
        System.out.println("\nFinal balance: " + account.getBalance());
    }
}
