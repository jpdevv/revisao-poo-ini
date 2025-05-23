package presentation.views;

import business.services.DisciplineService;
import business.services.PrinterService;
import business.services.ReaderService;
import business.services.StudentService;

public class ListView {
    private static PrinterService printerService = new PrinterService();
    private static ReaderService readerService = new ReaderService();
    private static DisciplineService disciplineService = new DisciplineService();
    private static StudentService studentService = new StudentService();

    public void showList() {
        printerService.println("--------------- LISTAGEM ---------------");
        printerService.println("1 - Listar disciplinas");
        printerService.println("2 - Listar estudantes");
        printerService.println("3 - Listar tudo");
        printerService.println("0 - Voltar");
        printerService.print("Escolha uma opção: ");
        String choice = readerService.nextLine();
        
        switch (choice) {
            case "0" -> printerService.println("Voltando ao menu principal...");
            case "1" -> printerService.println(disciplineService.showAll());
            case "2" -> printerService.println(studentService.showAll());
            default -> printerService.println("[Erro] - Opção inválida.");
        }
    }
}
