package JavaOOPs;

import model.Student;
import service.StudentService;

public class Task9_MainApp {
    public static void main(String[] args) {
        Student student = new Student("Vishwadeep", 101);
        StudentService service = new StudentService();

        service.saveStudent(student);
        service.printStudentDetails();
    }
}

