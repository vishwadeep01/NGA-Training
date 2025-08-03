package wrapperclasses;

public class Task8_BankAccountWrapper {
	
	private String accountNumber;
    private Double balance;

    public Task8_BankAccountWrapper(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = (balance == null) ? 0.0 : balance; // Handle null
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void showBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task8_BankAccountWrapper account = new Task8_BankAccountWrapper("AC12345", null); // null balance
        account.showBalance();

        account.deposit(5000);
        account.withdraw(1500);
        account.showBalance();

	}

}
