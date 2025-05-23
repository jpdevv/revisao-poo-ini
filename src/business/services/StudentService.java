package business.services;

import model.entities.Student;
import model.repositories.StudentRepository;

public class StudentService {
    private static StudentRepository studentRepository = new StudentRepository();

    public void registerStudent(Student student) {
        studentRepository.save(student);
    }

    public String showAll() {
        return studentRepository.showAll();
    }
}
