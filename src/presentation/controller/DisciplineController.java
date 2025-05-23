package presentation.controller;

import business.services.ConvertionService;
import business.services.DisciplineService;
import business.services.PrinterService;

public class DisciplineController {
    private DisciplineService disciplineService = new DisciplineService();
    private PrinterService printerService = new PrinterService();
    private ConvertionService convertionService = new ConvertionService();

    public void createDiscipline(String disciplineName, String workload, String teacherName) {
        try {
            int workloadInt = convertionService.convertStringToInt(workload);
            disciplineService.createDiscipline(disciplineName, workloadInt, teacherName);
            printerService.printf("Disciplina %s criada com sucesso!\n", disciplineName);
        } catch (Exception e) {
            printerService.println("[Erro] - Erro ao criar uma disciplina: " + e.getMessage());
        }
    }
}
