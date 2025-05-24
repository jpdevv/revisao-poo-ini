package presentation.controller;

import business.services.DisciplineService;
import model.entities.Discipline;

public class DisciplineController {
    private static DisciplineService disciplineService = new DisciplineService();

    public void registerDiscipline(String disciplineName, String disciplineTeacher, String workload, String code) {
        Discipline discipline = new Discipline(disciplineName, workload, disciplineTeacher, code);
        disciplineService.registerDiscipline(discipline);
    }

    public boolean deleteDiscipline(String code, String confirmation) {
        if (confirmation.equalsIgnoreCase("S")) {
            boolean sucess = disciplineService.deleteDiscipline(code);
            if(sucess) return true;
            else return false;
        } else {
            return false;
        }
    }
}
