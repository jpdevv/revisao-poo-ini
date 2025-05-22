// Define o pacote onde a classe está localizada
package business.services;

// Importa a classe StudentRepository do pacote model.repositories
import model.repositories.StudentRepository;

// Define a classe ValidationStudentService que gerencia validações relacionadas a estudantes
public class ValidationStudentService {
    // Cria uma instância do repositório de estudantes para consultar dados existentes
    private StudentRepository studentRepository = new StudentRepository();

    // Método que valida os dados de um estudante antes de sua criação
    public void validateStudent(String registration, String name, String email, String address) {
        // Verifica se a matrícula é nula ou vazia
        if(registration == null || registration.isEmpty()) {
            // Lança exceção se a matrícula for inválida
            throw new IllegalArgumentException("Matrícula não pode ser nula ou vazia.");
        }
        // Verifica se o nome é nulo ou vazio
        if(name == null || name.isEmpty()) {
            // Lança exceção se o nome for inválido
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio.");
        }
        // Verifica se o email é nulo ou vazio
        if(email == null || email.isEmpty()) {
            // Lança exceção se o email for inválido
            throw new IllegalArgumentException("Email não pode ser nulo ou vazio.");
        }
        // Verifica se o endereço é nulo ou vazio
        if(address == null || address.isEmpty()) {
            // Lança exceção se o endereço for inválido
            throw new IllegalArgumentException("Endereço não pode ser nulo ou vazio.");
        }
        // Verifica se já existe um estudante com a mesma matrícula
        if(studentRepository.findByRegistration(registration) != null) {
            // Lança exceção se o estudante já existir
            throw new IllegalArgumentException("Estudante já existe.");
        }
    }
}
