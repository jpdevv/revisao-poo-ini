package business.services;

public class ValidationDisciplineService {

    public void validateDiscipline(String disciplineName, int workload, String teacherName) {
        if(disciplineName == null || disciplineName.isEmpty()) {
            throw new IllegalArgumentException("Nome da disciplina não pode ser nulo ou vazio.");
        }
        if (teacherName == null || teacherName.isEmpty()) {
            throw new IllegalArgumentException("Nome do professor não pode ser nulo ou vazio.");
        }
        if (workload <= 0) {
            throw new IllegalArgumentException("Carga horária deve ser maior que zero.");
        }
    }
}
