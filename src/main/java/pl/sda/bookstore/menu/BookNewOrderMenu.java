package pl.sda.bookstore.menu;

import pl.sda.bookstore.Book;
import pl.sda.bookstore.BookCollection;
import pl.sda.bookstore.Order;
import pl.sda.bookstore.OrderManager;

import java.util.Scanner;

public class BookNewOrderMenu {
    private final Scanner sc;
    private BookCollectionMenu bookCollectionMenu;
    private BookCollection bookCollection;
    private OrderManager orderManager;


    public BookNewOrderMenu(Scanner sc, BookCollectionMenu bookCollectionMenu, OrderManager orderManager) {

        this.sc = sc;
        this.bookCollectionMenu = bookCollectionMenu;
        this.orderManager = orderManager;
    }



    public void showMenu() {
        System.out.println("Podaj swoje dane w formacie: imię, nazwisko, adres");
        sc.nextLine();

        String customerData = sc.nextLine();
        Order order = new Order(customerData);
//TODO tutaj należy dodać sobie jakieś inicjalizowanie zamówienia na podstawie wprowadzonych danych

        while (true) {
        System.out.println("1. Znajdz książkę - przejdź do nowego menu");
        System.out.println("2. Dodaj książkę do zamówienie - podaj tytuł, autor");
        System.out.println("3. Usuń książkę z zamówienia");
        System.out.println("4. Wybierz opcje wysyłki");
        System.out.println("5. Dodaj kod rabatowy");
        System.out.println("6. Oblicz cenę");
        System.out.println("7. Zamów");
        System.out.println("8. Anuluj i wróć");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    bookCollectionMenu.showMenu();
                    break;
                case 2:
                    String[] bookFromUser = sc.nextLine().split(",");
                    order.addBook(new Book(bookFromUser[0], bookFromUser[1]));

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    orderManager.add(order);
                    break;
                case 8:
                    return;
            }
        }
    }
}
