package business.services;

public class PrinterService {
    public void println(String message) {
        System.out.println(message);
    }

    public void print(String message) {
        System.out.print(message);
    }

    public void printf(String format, Object ... args) {
        System.out.printf(format, args);
    }
}
