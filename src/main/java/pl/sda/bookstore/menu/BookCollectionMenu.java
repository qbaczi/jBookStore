package pl.sda.bookstore.menu;

import pl.sda.bookstore.Book;
import pl.sda.bookstore.BookCollection;

import java.util.Scanner;

public class BookCollectionMenu {

    private final Scanner sc;
    private final BookCollection bookCollection;

    BookCollectionMenu(Scanner sc, BookCollection bookCollection){
        this.sc = sc;
        this.bookCollection = bookCollection;
    }

    public void showMenu() {
        while (true) {
            System.out.println();
            System.out.println("===========================================================================");
            System.out.println("1. Dodaj ksiażkę w formacie: tytył, autor, cena, typ, ocena");
            System.out.println("2. Dodaj ksiażkę w formacie: tytył, autor, typ");
            System.out.println("3. Pokaż kolekcje ksiażek");
            System.out.println("4. Usuń ksiażkę - podaj tytuł");
            System.out.println("5. Powrót");

            int option = sc.nextInt(); // pobranie inta nie powoduje przejścia do kolejnej linii
            sc.nextLine(); // tutaj muszę przejść dalej.

            switch (option) {
                case 1:
                    String dataFromUser = sc.nextLine();
                    bookCollection.add(dataFromUser);
                    break;
                case 2:
                    String dataFromUser2 = sc.nextLine();
                    bookCollection.add(dataFromUser2);
                    break;
                case 3:
                    System.out.println();
                    System.out.println("===========================================================================");
                    System.out.println("Kolekcja książek:");
                    bookCollection.showAllBooks();
                    break;
                case 4:
                    bookCollection.removeBook(sc.nextLine());
                    break;
                case 5:
                    return;
            }
        }
    }
}
