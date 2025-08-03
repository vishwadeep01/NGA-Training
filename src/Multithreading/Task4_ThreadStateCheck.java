package multithreading;

public class Task4_ThreadStateCheck extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Running: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }

    public static void main(String[] args) {
        Task4_ThreadStateCheck thread = new Task4_ThreadStateCheck();

        System.out.println("Before start: " + thread.isAlive());

        thread.start();
        System.out.println("After start: " + thread.isAlive());

        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("After join: " + thread.isAlive());
    }
}
