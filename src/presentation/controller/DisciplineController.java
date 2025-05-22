// Define o pacote onde a classe está localizada
package presentation.controller;

// Importa os serviços necessários do pacote business.services
import business.services.ConvertionService;
import business.services.DisciplineService;
import business.services.PrinterService;

// Define a classe DisciplineController que gerencia a interação entre a interface e os serviços
public class DisciplineController {
    // Cria uma instância do serviço de disciplinas
    private DisciplineService disciplineService = new DisciplineService();
    // Cria uma instância do serviço de impressão
    private PrinterService printerService = new PrinterService();
    // Cria uma instância do serviço de conversão
    private ConvertionService convertionService = new ConvertionService();

    // Método para criar uma nova disciplina recebendo os dados como String
    public void createDiscipline(String disciplineName, String workload, String teacherName) {
        // Inicia um bloco try-catch para tratamento de exceções
        try {
            // Converte a carga horária de String para inteiro
            int workloadInt = convertionService.convertStringToInt(workload);
            // Chama o serviço para criar a disciplina
            disciplineService.createDiscipline(disciplineName, workloadInt, teacherName);
            // Imprime mensagem de sucesso
            printerService.printf("Disciplina %s criada com sucesso!\n", disciplineName);
        // Captura qualquer exceção que possa ocorrer
        } catch (Exception e) {
            // Imprime mensagem de erro com a descrição da exceção
            printerService.println("[Erro] - Erro ao criar uma disciplina: " + e.getMessage());
        }
    }
}
