// Define o pacote onde a classe está localizada
package business.services;

// Importa a classe Student do pacote model.entities
import model.entities.Student;
// Importa a classe StudentRepository do pacote model.repositories
import model.repositories.StudentRepository;

// Define a classe StudentService que gerencia operações relacionadas a estudantes
public class StudentService {
    // Cria uma instância do repositório de estudantes para manipular os dados
    private StudentRepository studentRepository = new StudentRepository();
    // Cria uma instância do serviço de validação de estudantes
    private ValidationStudentService validationStudentService = new ValidationStudentService();
    
    // Método para criar um novo estudante recebendo matrícula, nome, email e endereço
    public void createStudent(String registration, String name, String email, String address) {
        // Valida os dados do estudante antes de criá-lo
        validationStudentService.validateStudent(registration, name, email, address);
        // Cria um novo objeto Student e registra no repositório
        studentRepository.registerStudent(new Student(registration, name, email, address));
    }

    // Método que retorna uma String contendo a lista de todos os estudantes
    public String showAllStudents() {
        // Verifica se a lista de estudantes está vazia (null)
        if (studentRepository.listStudents() == null) {
            // Se estiver vazia, retorna null
            return null;
        }
        // Se não estiver vazia, retorna a lista de estudantes convertida em String
        return studentRepository.listStudents();
    }
}
