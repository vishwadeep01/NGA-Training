package Multithreading;

public class Task1_ExtendsThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from Thread!");
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }

    public static void main(String[] args) {
        Task1_ExtendsThread thread = new Task1_ExtendsThread();
        thread.start();
    }
}

