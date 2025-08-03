package multithreading;

import java.util.Random;

public class Task11_ThreadRaceSimulation extends Thread {

    public Task11_ThreadRaceSimulation(String name) {
        super(name); 
    }

    public void run() {
        Random random = new Random();
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " running...  " + i);
            try {
                Thread.sleep(random.nextInt(1000)); 
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted.");
            }
        }
    }

    public static void main(String[] args) {
        Task11_ThreadRaceSimulation tortoise = new Task11_ThreadRaceSimulation("Tortoise");
        Task11_ThreadRaceSimulation rabbit = new Task11_ThreadRaceSimulation("Rabbit");
        Task11_ThreadRaceSimulation dog = new Task11_ThreadRaceSimulation("Dog");

        tortoise.start();
        rabbit.start();
        dog.start();
    }
}
