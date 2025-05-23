package presentation.views;

import business.services.PrinterService;
import business.services.ReaderService;

public class MenuView {
    private static PrinterService printerService = new PrinterService();
    private static ReaderService readerService = new ReaderService();
    private static RegistryView registryView = new RegistryView();
    private static ListView listView = new ListView();
    private static DeleteView deleteView = new DeleteView();

    public boolean showMenu() {
        printerService.println("--------------- SISTEMA DE CADASTRO ---------------");
        printerService.println("1 - Cadastrar disciplina");
        printerService.println("2 - Cadastrar estudante");
        printerService.println("3 - Excluir disciplina");
        printerService.println("4 - Excluir estudante");
        printerService.println("5 - Listar");
        printerService.println("0 - Sair");
        printerService.print("Escolha uma opção: ");
        String choice = readerService.nextLine();

        switch (choice) {
            case "0" -> {
                printerService.println("Encerrando sistema...");
                return false;
            }
            case "1" -> registryView.showRegistryDiscipline();
            case "2" -> registryView.showRegistryStudent();
            case "3" -> deleteView.showDeleteDiscipline();
            case "4" -> deleteView.showDeleteStudent();
            case "5" -> listView.showList();
            default -> printerService.println("[Erro] - Opção inválida.");
        }
        return true;
    }
}
