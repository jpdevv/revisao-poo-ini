package presentation.views;

public class Main {
    public static void main(String[] args) {
        MenuView menuView = new MenuView();
        boolean running = true;
        while(running) {
            running = menuView.showMenu();
        }
    }
}
