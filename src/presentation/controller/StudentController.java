// Define o pacote onde a classe está localizada
package presentation.controller;

// Importa o serviço de estudantes do pacote business.services
import business.services.StudentService;
// Importa o serviço de impressão do pacote business.services
import business.services.PrinterService;

// Define a classe StudentController que gerencia a interação entre a interface e os serviços
public class StudentController {
    // Cria uma instância do serviço de estudantes
    private StudentService studentService = new StudentService();
    // Cria uma instância do serviço de impressão
    private PrinterService printerService = new PrinterService();

    // Método para criar um novo estudante recebendo os dados como parâmetros
    public void createStudent(String registration, String name, String email, String address) {
        // Inicia um bloco try-catch para tratamento de exceções
        try {
            // Chama o serviço para criar o estudante
            studentService.createStudent(registration, name, email, address);
            // Imprime mensagem de sucesso
            printerService.printf("Estudante %s cadastrado com sucesso!\n", name);
        // Captura qualquer exceção que possa ocorrer
        } catch (Exception e) {
            // Imprime mensagem de erro com a descrição da exceção
            printerService.println("[Erro] - Erro ao cadastrar estudante: " + e.getMessage());
        }
    }
}
