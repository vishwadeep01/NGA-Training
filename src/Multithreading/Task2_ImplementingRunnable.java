package Multithreading;

public class Task2_ImplementingRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Count: " + i);
        }
    }

    public static void main(String[] args) {
        Task2_ImplementingRunnable counter = new Task2_ImplementingRunnable();
        Thread thread = new Thread(counter);
        thread.start();
    }
}

