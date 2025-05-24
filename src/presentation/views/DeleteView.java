package presentation.views;

import business.services.PrinterService;
import business.services.ReaderService;
import presentation.controller.DisciplineController;
import presentation.controller.StudentController;

public class DeleteView {
    private static PrinterService printerService = new PrinterService();
    private static ReaderService readerService = new ReaderService();
    private static DisciplineController disciplineController = new DisciplineController();
    private static StudentController studantController = new StudentController();

    public void showDeleteDiscipline() {
        printerService.println("--------------- EXCLUSÃO DE DISCIPLINA ---------------");
        printerService.print("Digite o código da disciplina a ser excluída: ");
        String code = readerService.nextLine();
        printerService.print("Você tem certeza que deseja excluir a disciplina com o código " + code + "? (s/N) ");
        String confirmation = readerService.nextLine();

        boolean wasDeleted = disciplineController.deleteDiscipline(code, confirmation);

        if(wasDeleted) {
            printerService.println("[Sucesso] - Disciplina excluída com sucesso.");
        } else {
            printerService.println("[Erro] - Erro ao excluir ou a disciplina não existe.");
        }
    }

    public void showDeleteStudent() {
        printerService.println("--------------- EXCLUSÃO DE ESTUDANTE ---------------");
        printerService.print("Digite a matrícula do(a) estudante a ser excluído: ");
        String registration = readerService.nextLine();
        printerService.print("Você tem certeza que deseja excluir o(a) estudante com a matrícula " + registration + "? (s/N) ");
        String confirmation = readerService.nextLine();

        boolean wasDeleted = studantController.deleteStudent(registration, confirmation);

        if(wasDeleted) {
            printerService.println("[Sucesso] - Estudante excluído(a) com sucesso.");
        } else {
            printerService.println("[Erro] - Erro ao excluir ou o(a) estudante não existe.");
        }
    }
    
}
