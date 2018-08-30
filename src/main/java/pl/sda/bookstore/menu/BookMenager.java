package pl.sda.bookstore.menu;

import pl.sda.bookstore.Book;

import java.util.Arrays;
import java.util.List;

public class BookMenager {

    public static List<Book> createBooks() {
        Book book1 = new Book("Jaś rozrabiaka", "Tadek Kapsel", 20.44, "klasyk", 5.5);
        Book book2 = new Book("Staś rozrabiaka", "Tadek von Kapsel", 24.5, "klasyk", 4.0);
        Book book3 = new Book("Adaś rozrabiaka", "Tadek Kapsel 3", 20.44, "klasyk", 6.5);
        Book book4 = new Book("Karol rozrabiaka", "Tadek Kapsel", 28.33, "klasyk", 8.0);
        Book book5 = new Book("Witek rozrabiaka", "Jan Kapsel", 20.44, "klasyk", 4.5);

        List<Book> books = Arrays.asList(book1, book2, book3, book4, book5);

        return books;

    }
}
