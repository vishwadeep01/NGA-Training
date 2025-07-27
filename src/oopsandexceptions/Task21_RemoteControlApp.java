package oopsandexceptions;

interface RemoteControl {
    void turnOn();

    default void batteryStatus() {
        System.out.println("Battery status: 50% charged.");
    }
}

class Television implements RemoteControl {
    public void turnOn() {
        System.out.println("Television is turned ON.");
    }
}

public class Task21_RemoteControlApp {
    public static void main(String[] args) {
        RemoteControl remote = new Television();
        remote.turnOn();
        remote.batteryStatus();
    }
}

