package oopsandexceptions.task22;

interface RemoteControl {
    void turnOn();

    default void batteryStatus() {
        System.out.println("Battery status: 50% charged.");
    }

    static void info() {
        System.out.println("RemoteControl interface supports static, default, and abstract methods.");
    }
}

class Television implements RemoteControl {
    public void turnOn() {
        System.out.println("Television is turned ON.");
    }
}

public class Task22_RemoteControlStatic {
    public static void main(String[] args) {
        RemoteControl.info();

        RemoteControl remote = new Television();
        remote.turnOn();
        remote.batteryStatus();
    }
}

