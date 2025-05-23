package presentation.views;

import business.services.PrinterService;
import business.services.ReaderService;

public class MenuView {
    private PrinterService printerService = new PrinterService();
    private ReaderService readerService = new ReaderService();

    public boolean showMenu() {
        printerService.println("--------------- SISTEMA DE CADASTRO ---------------");
        printerService.println("1 - Cadastrar Disciplina");
        printerService.println("0 - Sair");
        printerService.print("Escolha uma opção: ");
        String choice = readerService.nextLine();

        switch (choice) {
            case "0" -> {
                printerService.println("Encerrando sistema...");
                return false;
            }
            default -> printerService.println("[Erro] - Opção inválida.");
        }

        return true;
    }
}
