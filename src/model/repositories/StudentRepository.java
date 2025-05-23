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

    public void delete(String registration) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getRegistration().equalsIgnoreCase(registration)) {
                students.remove(i);
                return;
            }
        }
    }
}
