package pl.sda.bookstore;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void shouldAddBookToOrder() {
        //given
        Order order = new Order("notImportant, notImportant, notImportant");
        //when
        order.addBook(new Book("Clean code", "Martin", "programming"));
        order.addBook(new Book("Test driven development", "Kent Beck", "programming"));
        //then
        assertEquals(2, order.size());
    }

    @Test
    void shouldSubstracteFromOrder() {
        //given
        Order order = new Order("notImportant, notImportant, notImportant");
        order.addBook(new Book("Clean code", "Martin", "programming"));
        order.addBook(new Book("Test driven development", "Kent Beck", "programming"));
        //when
        order.removeBook(new Book("Clean code", "Martin", "programming"));
        //then
        assertEquals(1, order.size());

        //order.getAllBooks().get(0)
//        Dokładnie to samo co na górze
//        List<Book> bookList= order.getAllBooks();
//        bookList.get(0);

        assertEquals(order.getAllBooks().get(0), (new Book("Test driven development", "Kent Beck", "programming")));
    }

    @Test
    void shouldCountPrice() {
        //given
        Order order = new Order("notImportant, notImportant, notImportant");
        order.addBook(new Book("Clean code", "Martin",60.00, "programming", 6.7));
        //when
        Double bookPrice = order.price();
        //then
        assertEquals(bookPrice, new Double (60.00));

    }
    @Test
    void shouldCountPriceForMoreBooks (){
        //given
        Order order = new Order("notImportant, notImportant, notImportant");
        order.addBook(new Book("Clean code", "Martin",60.00, "programming", 6.7));
        order.addBook(new Book("Test driven development", "Kent Beck", 80.00, "programming", 9.8));

        //when
        Double bookPrice = order.price();
        //then
        assertEquals(bookPrice,new Double (140.00));
    }
}