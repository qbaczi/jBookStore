package pl.sda.bookstore;

import pl.sda.bookstore.customer.Customer;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private final List<Book> books = new ArrayList<>();
private final Customer customer;


    public Order(Customer customer) {
       this.customer = customer;
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

    public Customer getCustomer() {
        return customer;
    }
}
