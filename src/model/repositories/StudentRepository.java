package model.repositories;

import java.util.ArrayList;
import java.util.List;

import model.entities.Student;

public class StudentRepository {
    List<Student> students;

    public StudentRepository() {
        this.students = new ArrayList<>();
    }

    public void save(Student student) {
        students.add(student);
    }

    public String showAll() {
        if(students.isEmpty()) {
            return "Nenhum estudante cadastrado.";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("--------------- LISTA DE ESTUDANTES ---------------\n");
        for (Student student : students) {
            sb.append(student.toString()).append("\n");
        }
        return sb.toString();
    }
}
