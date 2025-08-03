package com.collections.comparable;

public class Task51_Student implements Comparable<Task51_Student> {
    private String name;
    public int marks;

    public Task51_Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public int compareTo(Task51_Student other) {
        return Integer.compare(this.marks, other.marks); // ascending order
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }

}
