package javaoops;

class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows");
    }
}

class Cow extends Animal {
    void makeSound() {
        System.out.println("Cow moos");
    }
}

public class Task7_MethodOverriding {
    public static void main(String[] args) {
        Animal animal;

        animal = new Dog();
        animal.makeSound();

        animal = new Cat();
        animal.makeSound();

        animal = new Cow();
        animal.makeSound();
    }
}