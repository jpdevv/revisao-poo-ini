package presentation.views;

public class Main {
    public static void main(String[] args) {
        MenuView menuView = new MenuView();
        while(true) {
            menuView.showMenu();
        }
    }
}
