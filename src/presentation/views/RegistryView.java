package presentation.views;

import business.services.PrinterService;
import business.services.ReaderService;
import presentation.controller.DisciplineController;

public class RegistryView {
    private DisciplineController disciplineController = new DisciplineController();
    private PrinterService printerService = new PrinterService();
    private ReaderService readerService = new ReaderService();

    public void showRegistryDiscipline() {
        printerService.println("--------------- CADASTRAR DISCIPLINA ---------------");
        printerService.print("Digite o nome da disciplina: ");
        String disciplineName = readerService.nextLine();
        printerService.print("Digite a carga horária da disciplina: ");
        String workload = readerService.nextLine();
        printerService.print("Digite nome do professor da disciplina: ");
        String teacherName = readerService.nextLine();
        disciplineController.createDiscipline(disciplineName, workload, teacherName);
    }

    public void showRegistryStudent() {
    }

    public void showAddStudentToDiscipline() {
    }
}
