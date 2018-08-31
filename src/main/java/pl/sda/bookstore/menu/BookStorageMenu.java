package pl.sda.bookstore.menu;

import pl.sda.bookstore.Book;
import pl.sda.bookstore.BookStorage;

import java.util.List;
import java.util.Scanner;

public class BookStorageMenu {
    private final Scanner sc;
    private final BookStorage bookStorage;

    public BookStorageMenu(Scanner sc, BookStorage bookStorage) {
        this.sc = sc;
        this.bookStorage = bookStorage;
        initBooks();
    }

    private void initBooks() {
        List<Book> books = BookMenager.createBooks();
        bookStorage.addBooksToStorage(books);
    }


    public void showMenu() {
        while(true) {
            System.out.println("1. Zwiększ stan magazynowy książki. Podaj: tytuł, autor, ilość");
            System.out.println("2. Zmniejsz stan magazynowy książki. Podaj: tytuł, autor, ilość");
            System.out.println("3. Pokaż stan magazynowy");
            System.out.println("4. Wyświetl wszystkie książki posortowane alfabetycznie po tytule");
            System.out.println("5. Wyświetl wszystkie książki posortowane po ratingu");
            System.out.println("6. Powrót");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1:
                    String[] splittedData = sc.nextLine().split(",");
                    bookStorage.updateBookCount(new Book(splittedData[0], splittedData[1]), Integer.valueOf(splittedData[2]));
                    break;
                case 2:
                    String[] splittedData2 = sc.nextLine().split(",");
                    bookStorage.updateBookCount(new Book(splittedData2[0], splittedData2[1]), 0 - Integer.valueOf(splittedData2[2])); // 0 - 2 = -2 - hack na szybko wymyślony
                    break;
                case 3:
                    bookStorage.showStorageState();
                    break;
                case 4:
                   bookStorage.sortByTitle();
                    break;
                case 5:
                    bookStorage.sortByRating();
                case 6:
                    return;
            }
        }
    }
}
