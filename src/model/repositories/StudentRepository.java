package model.repositories;

import java.util.ArrayList;
import java.util.List;
import model.entities.Student;

public class StudentRepository {
    private List<Student> students = new ArrayList<>();

    public void registerStudent(Student student) {
        students.add(student);
    }

    public String listStudents() {
        for (Student student : students) {
            return student.toString();
        }
        return null;
    }
}
