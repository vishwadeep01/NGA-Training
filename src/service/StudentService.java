package service;

import model.Student;

public class StudentService {
    private Student student;

    public void saveStudent(Student student) {
        this.student = student;
        System.out.println("Student saved successfully.");
    }

    public void printStudentDetails() {
        if (student != null) {
            System.out.println("Student Name: " + student.getName());
            System.out.println("Roll Number: " + student.getRollNumber());
        } else {
            System.out.println("No student data available.");
        }
    }
}

