package pl.sda.bookstore.menu;

import pl.sda.bookstore.Book;
import pl.sda.bookstore.BookCollection;
import pl.sda.bookstore.BookStorage;
import pl.sda.bookstore.OrderManager;

import java.util.*;

public class MainMenu {

    private Scanner sc = new Scanner(System.in);
    private BookStorage bookStorage = new BookStorage(new HashMap<>());
    private BookCollection bookCollection = new BookCollection(new HashSet<>(), bookStorage);
    private OrderManager orderManager = new OrderManager();
    private  BookCollectionMenu bookCollectionMenu = new BookCollectionMenu(sc, bookCollection);

    public void showMenu() {
        System.out.println();
        System.out.println("===========================================================================");
        System.out.println("Wybierz menu");
        System.out.println("1. Kolekcja książek");
        System.out.println("2. Magazyn");
        System.out.println("3. Aktualne Zamówienia");
        System.out.println("4. Zamów");
        System.out.println("5. Zakończ");

        switch (sc.nextInt()) {
            case 1:
                bookCollectionMenu.showMenu();
                break;
            case 2:
                BookStorageMenu bookStorageMenu = new BookStorageMenu(sc, bookStorage);
                bookStorageMenu.showMenu();
                break;
            case 3:
                BookCurrentOrdersMenu bookCurrentOrdersMenu = new BookCurrentOrdersMenu(sc, orderManager);
                bookCurrentOrdersMenu.showMenu();
                break;
            case 4:
                BookNewOrderMenu bookNewOrderMenu = new BookNewOrderMenu(sc, bookCollectionMenu, orderManager);
                bookNewOrderMenu.showMenu();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Wybrałeś niewspieraną opcje");
        }
    }

}
