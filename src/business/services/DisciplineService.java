package business.services;

import model.entities.Discipline;
import model.repositories.DisciplineRepository;

public class DisciplineService {
    private DisciplineRepository disciplineRepository = new DisciplineRepository();
    private ValidationDisciplineService validationDisciplineService = new ValidationDisciplineService();
    
    public void createDiscipline(String disciplineName, int workload, String teacherName) {
        validationDisciplineService.validateDiscipline(disciplineName, workload, teacherName);
        disciplineRepository.registerDiscipline(new Discipline(disciplineName, workload, teacherName));
    }

    public String showAllDisciplines() {
        if(disciplineRepository.listDisciplines() == null) {
            return null;
        }
        return disciplineRepository.listDisciplines();
    }
}
