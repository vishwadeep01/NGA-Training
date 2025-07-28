package Multithreading;

public class Task5_ThreadPriority extends Thread {

    public void run() {
        System.out.println(Thread.currentThread().getName()
                + " is running with priority "
                + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Task5_ThreadPriority t1 = new Task5_ThreadPriority();
        Task5_ThreadPriority t2 = new Task5_ThreadPriority();
        Task5_ThreadPriority t3 = new Task5_ThreadPriority();

        t1.setPriority(NORM_PRIORITY);
        t2.setPriority(MIN_PRIORITY);
        t3.setPriority(MAX_PRIORITY);

        System.out.println("Thread priority of thread 1 is: " + t1.getPriority());
        System.out.println("Thread priority of thread 2 is: " + t2.getPriority());
        System.out.println("Thread priority of thread 3 is: " + t3.getPriority());
    }
}

