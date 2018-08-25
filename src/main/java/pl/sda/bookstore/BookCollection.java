package pl.sda.bookstore;

import java.util.HashSet;
import java.util.Set;

public class BookCollection {

    private final Set<Book> bookCollection;
    private final BookStorage bookStorage;

    public BookCollection(Set<Book> bookCollection, BookStorage bookStorage) {
        this.bookCollection = bookCollection;
        this.bookStorage = bookStorage;
    }

    public void add(String data) {
        String[] splittedText = data.split(",");
        Book bookToAdd = null;
        if (splittedText.length == 3) {
            bookToAdd = new Book(splittedText[0], splittedText[1], splittedText[2]);
        } else if (splittedText.length == 5) {
            bookToAdd = new Book(splittedText[0], splittedText[1], Double.parseDouble(splittedText[2]), splittedText[3], Double.parseDouble(splittedText[4]));
        }
        bookCollection.add(bookToAdd);
        bookStorage.addNewBookToStorage(bookToAdd);
    }

    public void showAllBooks() {
        for (Book book : bookCollection) {
            System.out.println(book);
        }
    }

    public void removeBook(String s) {
        Book bookToRemove = null;
        for (Book book : bookCollection) {
            if (book.getTitle().equals(s)) {
                bookToRemove = book;
            }
        }

        bookCollection.remove(bookToRemove);
    }

    public int collectionSize() {
        return bookCollection.size();
    }
}
