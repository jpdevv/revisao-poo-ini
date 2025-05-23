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
        if (students.isEmpty()) {
            return null;
        }
        
        StringBuilder result = new StringBuilder();
        for (Student student : students) {
            result.append(student.toString()).append("\n");
        }
        return result.toString();
    }
}
