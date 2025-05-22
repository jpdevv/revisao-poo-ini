package presentation.views;

import business.services.DisciplineService;
import business.services.PrinterService;
import business.services.ReaderService;
import business.services.StudentService;
import presentation.controller.DisciplineController;
import presentation.controller.StudentController;

public class RegistryView {
    private DisciplineController disciplineController = new DisciplineController();
    private StudentController studentController = new StudentController();
    private PrinterService printerService = new PrinterService();
    private ReaderService readerService = new ReaderService();
    private StudentService studentService = new StudentService();
    private DisciplineService disciplineService = new DisciplineService();

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
        printerService.println("--------------- CADASTRAR ESTUDANTE ---------------");
        printerService.print("Digite o nome do estudante: ");
        String studentName = readerService.nextLine();
        printerService.print("Digite a matrícula do estudante: ");
        String registration = readerService.nextLine();
        printerService.print("Digite o email do estudante: ");
        String email = readerService.nextLine();
        printerService.print("Digite o endereço do estudante: ");
        String address = readerService.nextLine();
        studentController.createStudent(registration, studentName, email, address);
    }

    public void showAddStudentToDiscipline() {
        printerService.println("--------------- ADICIONAR ESTUDANTE À DISCIPLINA ---------------");
        
        if(studentService.showAllStudents() == null) {
            printerService.println("Nenhum estudante cadastrado.");
            return;
        }
        printerService.println(studentService.showAllStudents());

        printerService.print("Digite a matrícula do estudante: ");
        String registration = readerService.nextLine();

        if (disciplineService.showAllDisciplines() == null) {
            printerService.println("Nenhuma disciplina cadastrada.");
            return;
        }
        printerService.println(disciplineService.showAllDisciplines());

        printerService.print("Digite o código da disciplina: ");
        String disciplineCode = readerService.nextLine();
    }
}
