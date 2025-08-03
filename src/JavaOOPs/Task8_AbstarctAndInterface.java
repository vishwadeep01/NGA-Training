package javaoops;

abstract class Appliance {
	abstract void turnOn();
}

interface Connectable {
	void connect();
}

class SmartTV extends Appliance implements Connectable {
	 public void turnOn() {
		 System.out.println("SmartTV is ON");
	 }
	 public void connect() {
		 System.out.println("SmartTV connected to WiFi");
	 }
}
public class Task8_AbstarctAndInterface {
	 public static void main(String[] args) {
		 SmartTV tv = new SmartTV();
		 tv.turnOn();
		 tv.connect();
	 }
}
