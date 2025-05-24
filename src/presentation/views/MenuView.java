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
        printerService.println("3 - Cadastrar estudante em uma disciplina");
        printerService.println("4 - Excluir disciplina");
        printerService.println("5 - Excluir estudante");
        printerService.println("9 - Listar");
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
            case "3" -> registryView.showRegistryStudentDiscipline();
            case "4" -> deleteView.showDeleteDiscipline();
            case "5" -> deleteView.showDeleteStudent();
            case "9" -> listView.showList();
            default -> printerService.println("[Erro] - Opção inválida.");
        }
        return true;
    }
}
