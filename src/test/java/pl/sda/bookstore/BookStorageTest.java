package pl.sda.bookstore;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class BookStorageTest {

    @Test
    void shouldAddTwoBookToStarage() {
        //given
        Map<Book, Integer> map = new HashMap<>();
        map.put(new Book("tytyl1", "autor1", "typ1"), 5);
        map.put(new Book("tytyl2", "autor2", "typ2"), 5);
        map.put(new Book("tytyl3", "autor3", "typ1"), 5);
        BookStorage storage = new BookStorage(map);

        //when
        storage.updateBookCount(new Book("tytyl2", "autor2", "typ2"), 2);

        //then
        assertEquals(7, map.get(new Book("tytyl2", "autor2", "typ2")).intValue());
        assertEquals(5, map.get(new Book("tytyl1", "autor1", "typ1")).intValue());
        assertEquals(5, map.get(new Book("tytyl3", "autor3", "typ1")).intValue());
        assertEquals(3, map.size());
    }

    @Test
    void shouldSubstractTwoBookToStarage() {
        //given
        Map<Book, Integer> map = new HashMap<>();
        map.put(new Book("tytyl1", "autor1", "typ1"), 5);
        map.put(new Book("tytyl2", "autor2", "typ2"), 5);
        map.put(new Book("tytyl3", "autor3", "typ1"), 5);
        BookStorage storage = new BookStorage(map);

        //when
        storage.updateBookCount(new Book("tytyl2", "autor2", "typ2"), -2);

        //then
        assertEquals(3, map.get(new Book("tytyl2", "autor2", "typ2")).intValue());
        assertEquals(5, map.get(new Book("tytyl1", "autor1", "typ1")).intValue());
        assertEquals(5, map.get(new Book("tytyl3", "autor3", "typ1")).intValue());
        assertEquals(3, map.size());
    }
}