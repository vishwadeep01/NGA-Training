package oopsandexceptions.task12;

abstract class Shape {
    abstract double area();

    void displayShapeType() {
        System.out.println("This is a " + getClass().getSimpleName());
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

public class Task12_AbstractAndNonAbstract {
    public static void main(String[] args) {
        Circle c = new Circle(3);
        System.out.println("Area: " + c.area());
        c.displayShapeType();
    }
}

