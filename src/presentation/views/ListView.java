package presentation.views;

import business.services.DisciplineService;
import business.services.PrinterService;
import business.services.ReaderService;

public class ListView {
    private PrinterService printerService = new PrinterService();
    private ReaderService readerService = new ReaderService();
    private DisciplineService disciplineService = new DisciplineService();

    public void showListMenu() {
        printerService.println("1 - Listar Disciplinas");
        printerService.println("2 - Listar Alunos");
        printerService.print("O que deseja listar? ");
        String option = readerService.nextLine();

        switch (option) {
            case "1":
                printerService.println("------------------ LISTA DE DISCIPLINAS ------------------");
                printerService.print(disciplineService.showAllDisciplines());
                break;
            case "2":

                break;
            default:
                printerService.println("[Erro] - Opção inválida.");
        }
    }
}
