package presentation.views;

import business.services.DisciplineService;
import business.services.PrinterService;
import business.services.ReaderService;
import business.services.StudentService;
import presentation.controller.DisciplineController;
import presentation.controller.StudentController;

public class RegistryView {
    private static PrinterService printerService = new PrinterService();
    private static ReaderService readerService = new ReaderService();
    private static DisciplineController disciplineController = new DisciplineController();
    private static StudentController studentController = new StudentController();
    private static StudentService studentService = new StudentService();
    private static DisciplineService disciplineService = new DisciplineService();

    public void showRegistryDiscipline() {
        printerService.println("--------------- CADASTRO DE DISCIPLINA ---------------");
        printerService.print("Nome da disciplina: ");
        String disciplineName = readerService.nextLine();
        printerService.print("Código da disciplina: ");
        String disciplineCode = readerService.nextLine();
        printerService.print("Nome do professor da disciplina: ");
        String disciplineTeacher = readerService.nextLine();
        printerService.print("Carga horária: ");
        String workload = readerService.nextLine();
        
        disciplineController.registerDiscipline(disciplineName, disciplineTeacher, workload, disciplineCode);

        printerService.println("Disciplina cadastrada com sucesso!");
    }

    public void showRegistryStudent() {
        printerService.println("--------------- CADASTRO DE ESTUDANTE ---------------");
        printerService.print("Nome do estudante: ");
        String studentName = readerService.nextLine();
        printerService.print("Matricula do estudante: ");
        String registration = readerService.nextLine();
        printerService.print("Endereço do estudante: ");
        String studentAddress = readerService.nextLine();
        printerService.print("Email do estudante: ");
        String studentEmail = readerService.nextLine();

        studentController.registerStudent(studentName, registration, studentAddress, studentEmail);

        printerService.println("Estudante cadastrado(a) com sucesso!");
    }

    public void showRegistryStudentDiscipline() {
        printerService.println("--------------- CADASTRO DE ESTUDANTE EM DISCIPLINA ---------------");
        printerService.println(studentService.showAll());
        printerService.print("Matrícula do estudante: ");
        String studentRegistration = readerService.nextLine();
        printerService.println(disciplineService.showAll());
        printerService.print("Código da disciplina: ");
        String disciplineCode = readerService.nextLine();

        disciplineController.registerStudentInDiscipline(studentRegistration, disciplineCode);
    }
}
