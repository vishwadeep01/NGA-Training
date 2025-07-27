package JavaOOPs;

public class Task3_BankAccount {

	private String accountNumber;
    private double balance;

    public Task3_BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Task3_BankAccount account = new Task3_BankAccount("ACC12345", 1000.00);
        
        account.deposit(500.00); // 500 deposit
        account.withdraw(200.00); // 200 withdraw
        System.out.println("Current Balance: ₹" + account.getBalance());
    }
}
