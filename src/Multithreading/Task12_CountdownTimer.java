package Multithreading;

public class Task12_CountdownTimer extends Thread {
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println("Countdown: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Timer interrupted.");
            }
        }
        System.out.println("Time's up!");
    }

    public static void main(String[] args) {
        Task12_CountdownTimer timer = new Task12_CountdownTimer();
        timer.start();
    }
}

