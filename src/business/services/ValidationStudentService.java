package business.services;

public class ValidationStudentService {

    public void validateStudent(String registration, String name, String email, String address) {
        if(registration == null || registration.isEmpty()) {
            throw new IllegalArgumentException("Matrícula não pode ser nula ou vazia.");
        }
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio.");
        }
        if(email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email não pode ser nulo ou vazio.");
        }
        if(address == null || address.isEmpty()) {
            throw new IllegalArgumentException("Endereço não pode ser nulo ou vazio.");
        }
    }
}
