package pl.sda.bookstore;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private final List<Book> books = new ArrayList<>();

    private final String name;
    private final String surname;
    private final String address;

    public Order(String user) {
        String[] split = user.split(",");

        this.name = split[0];
        this.surname = split[1];
        this.address = split[2];
    }

    public void addBook(Book book) {

        books.add(book);
    }

    public List<Book> getAllBooks() {

        return books;
    }

    public int size() {

        return books.size();
    }

    public void removeBook(Book book) {

        books.remove(book);
    }

    public Double price() {
        double sum = 0;
        for (Book book : books) {
            sum += book.getPrice();
        }
        return sum;
    }
}
