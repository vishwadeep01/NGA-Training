package multithreading;

public class Task6_UnsynchronizedCounter {

    private int counter = 0;

    public void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        Task6_UnsynchronizedCounter sharedCounter = new Task6_UnsynchronizedCounter();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sharedCounter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sharedCounter.increment();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.err.println("Main thread was interrupted.");
            Thread.currentThread().interrupt();
        }

        System.out.println("Final counter value (unsynchronized): " + sharedCounter.getCounter());
    }
}

