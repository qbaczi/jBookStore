package pl.sda.bookstore;

import pl.sda.bookstore.menu.MainMenu;

public class Main {

    public static void main(String[] args) {
        MainMenu menu = new MainMenu();
        while (true) {
                menu.showMenu();

        }
    }
}
