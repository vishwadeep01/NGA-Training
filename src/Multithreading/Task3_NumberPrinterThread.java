package Multithreading;

public class Task3_NumberPrinterThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread1: " + i);
            try {
            	// 1 second delay
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }

    public static void main(String[] args) {
        Task3_NumberPrinterThread thread1 = new Task3_NumberPrinterThread();
        thread1.start();

        try {
        	// Wait for thread1 to finish
            thread1.join(); 
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main thread done.");
    }
}

