package com.school.student;

public class Task41_Student {
    private String name;
    private int rollNumber;
    private int age;

    public Task41_Student(String name, int rollNumber,int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("age: " + age);
    }
}

