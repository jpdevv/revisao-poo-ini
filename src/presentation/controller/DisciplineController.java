package presentation.controller;

import business.services.DisciplineService;
import model.entities.Discipline;

public class DisciplineController {
    private static DisciplineService disciplineService = new DisciplineService();

    public void registerDiscipline(String disciplineName, String disciplineTeacher, String workload) {
        Discipline discipline = new Discipline(disciplineName, workload, disciplineTeacher);
        disciplineService.registerDiscipline(discipline);
    }
}
