package business.services;

import model.repositories.DisciplineRepository;

// Define a classe ValidationDisciplineService que gerencia validações relacionadas a disciplinas
public class ValidationDisciplineService {
    // Cria uma instância do repositório de disciplinas para consultar dados existentes
    private DisciplineRepository disciplineRepository = new DisciplineRepository();

    // Método que valida os dados de uma disciplina antes de sua criação
    public void validateDiscipline(String disciplineName, int workload, String teacherName) {
        // Verifica se o nome da disciplina é nulo ou vazio
        if(disciplineName == null || disciplineName.isEmpty()) {
            // Lança exceção se o nome da disciplina for inválido
            throw new IllegalArgumentException("Nome da disciplina não pode ser nulo ou vazio.");
        }
        // Verifica se o nome do professor é nulo ou vazio
        if (teacherName == null || teacherName.isEmpty()) {
            // Lança exceção se o nome do professor for inválido
            throw new IllegalArgumentException("Nome do professor não pode ser nulo ou vazio.");
        }
        // Verifica se a carga horária é menor ou igual a zero
        if (workload <= 0) {
            // Lança exceção se a carga horária for inválida
            throw new IllegalArgumentException("Carga horária deve ser maior que zero.");
        }
        // Verifica se já existe uma disciplina com o mesmo nome
        if (disciplineRepository.findByName(disciplineName) != null) {
            // Lança exceção se a disciplina já existir
            throw new IllegalArgumentException("Disciplina já existe.");
        }
    }
}
