package multithreading;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        System.out.println("Account created with initial balance: " + this.balance);
    }

    public double getBalance() {
        return this.balance;
    }

    public synchronized void withdraw(double amount) {
        System.out.println(Thread.currentThread().getName() + " is attempting to withdraw " + amount);

        if (this.balance >= amount) {
            // Simulate network latency or processing time
            try {
                System.out.println(Thread.currentThread().getName() + " is processing...");
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            this.balance -= amount;
            System.out.println(Thread.currentThread().getName() + " successfully withdrew " + amount + ". New balance: " + this.balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " failed to withdraw " + amount + ". Insufficient funds. Current balance: " + this.balance);
        }
    }
}

class WithdrawalTask implements Runnable {
    private final BankAccount account;
    private final double amount;

    public WithdrawalTask(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}


public class Task8_BankAccountException {
    public static void main(String[] args) {
       BankAccount account = new BankAccount(1000.00);

       Runnable withdrawalAction = new WithdrawalTask(account, 700.00);

        Thread userA = new Thread(withdrawalAction, "User-A");

        Thread userB = new Thread(withdrawalAction, "User-B");

        userA.start();
        userB.start();

        try {
            userA.join();
            userB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n-------------------------------------");
        System.out.println("Final account balance: " + account.getBalance());
        System.out.println("-------------------------------------");
    }
}
