package business.services;

import model.entities.Discipline;
import model.repositories.DisciplineRepository;

// Define a classe DisciplineService que gerencia operações relacionadas a disciplinas
public class DisciplineService {
    // Cria uma instância do repositório de disciplinas para manipular os dados
    private DisciplineRepository disciplineRepository = new DisciplineRepository();
    // Cria uma instância do serviço de validação de disciplinas
    private ValidationDisciplineService validationDisciplineService = new ValidationDisciplineService();
    
    // Método para criar uma nova disciplina recebendo nome, carga horária e nome do professor
    public void createDiscipline(String disciplineName, int workload, String teacherName) {
        // Valida os dados da disciplina antes de criá-la
        validationDisciplineService.validateDiscipline(disciplineName, workload, teacherName);
        // Cria um novo objeto Discipline e registra no repositório
        disciplineRepository.registerDiscipline(new Discipline(disciplineName, workload, teacherName));
    }

    // Método que retorna uma String contendo a lista de todas as disciplinas
    public String showAllDisciplines() {
        // Verifica se a lista de disciplinas está vazia (null)
        if(disciplineRepository.listDisciplines() == null) {
            // Se estiver vazia, retorna null
            return null;
        }
        // Se não estiver vazia, retorna a lista de disciplinas convertida em String
        return disciplineRepository.listDisciplines();
    }
}
