package pl.sda.bookstore;

import java.util.*;

public class BookStorage {

    private final Map<Book, Integer> storage;

    public BookStorage(Map<Book, Integer> storage) {
        this.storage = storage;
    }

    public void addNewBookToStorage(Book book){
        storage.put(book, 0);
    }

    public void updateBookCount(Book book, int diff) {
        storage.put(book, storage.get(book) + diff);
    }

    public void addBooksToStorage(List<Book> books){
        for (Book book : books) {
            addNewBookToStorage(book);

        }
    }

    public void showStorageState(){
        System.out.println();
        System.out.println("===========================================================================");
        System.out.println("Stan magazynowy: ");
        for (Map.Entry<Book,Integer> book : storage.entrySet()) {
            Book key = book.getKey();
            int value = book.getValue();
            System.out.println(key + ", " + value);
        }
    }

    public void sortByTitle() {
        Set<Book> bookSet = storage.keySet();
        bookSet.stream().sorted(Comparator.comparing(Book::getTitle)).forEach(System.out::println);
    }
    public void sortByRating() {
        Set<Book> bookSet = storage.keySet();
        bookSet.stream().sorted(Comparator.comparing(Book::getRating)).forEach(System.out::println);
    }
}
