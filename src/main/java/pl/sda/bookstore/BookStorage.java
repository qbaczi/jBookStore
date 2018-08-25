package pl.sda.bookstore;

import java.util.Map;

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
}
