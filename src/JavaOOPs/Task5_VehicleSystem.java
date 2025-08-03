package javaoops;

class Vehicle {
    String brand;
    int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    public Car(String brand, int speed) {
        super(brand, speed);
    }

    void showDetails() {
        System.out.println("Car Details:");
        super.showDetails();
        System.out.println();
    }
}

class Bike extends Vehicle {
    public Bike(String brand, int speed) {
        super(brand, speed);
    }

    void showDetails() {
        System.out.println("Bike Details:");
        super.showDetails();
        System.out.println();
    }
}

public class Task5_VehicleSystem {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 180);
        Bike bike = new Bike("Yamaha", 120);

        car.showDetails();
        bike.showDetails();
    }
}

