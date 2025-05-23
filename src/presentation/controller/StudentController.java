package presentation.controller;

import business.services.StudentService;
import model.entities.Student;

public class StudentController {
    private static StudentService studentService = new StudentService();

    public void registerStudent(String studentName, String registration, String studentAddress, String studentEmail) {
        Student student = new Student(studentName, registration, studentAddress, studentEmail);
        studentService.registerStudent(student);
    }

    public boolean deleteStudent(String registration, String confirmation) {
        if(confirmation.equalsIgnoreCase("S")) {
            studentService.deleteStudent(registration);
            return true;
        } else {
            return false;
        }
    }
}
