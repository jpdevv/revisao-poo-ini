package presentation.views;

import business.services.PrinterService;
import business.services.ReaderService;

public class MenuView {
    private PrinterService printerService = new PrinterService();
    private ReaderService readerService = new ReaderService();
    private RegistryView registryView = new RegistryView();
    private ListView listView = new ListView();

    public boolean showMenu() {
        printerService.println("--------------- SISTEMA DE CADASTRO ---------------");
        printerService.println("1 - Cadastrar Disciplina");
        printerService.println("2 - Cadastrar Estudante");
        printerService.println("3 - Adicionar estudante à disciplina");
        printerService.println("4 - Remover disciplina");
        printerService.println("5 - Remover estudante");
        printerService.println("6 - Remover estudante da disciplina");
        printerService.println("7 - Editar disciplina");
        printerService.println("8 - Editar estudante");
        printerService.println("9 - Listar tudo");
        printerService.println("0 - Sair");
        printerService.print("Escolha uma opção: ");
        String choice = readerService.nextLine();

        switch (choice) {
            case "0" -> {
                printerService.println("Encerrando sistema...");
                return false;
            }
            case "1" -> registryView.showRegistryDiscipline();
            case "9" -> listView.showListMenu();
            default -> printerService.println("[Erro] - Opção inválida.");
        }

        return true;
    }
}
