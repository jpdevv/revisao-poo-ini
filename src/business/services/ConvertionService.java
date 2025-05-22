package business.services;

public class ConvertionService {
    public int convertStringToInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Inválido: " + str);
        }
    }
}
