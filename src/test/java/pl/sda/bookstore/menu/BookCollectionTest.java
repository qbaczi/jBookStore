package pl.sda.bookstore.menu;

import org.junit.jupiter.api.Test;
import pl.sda.bookstore.BookCollection;
import pl.sda.bookstore.BookStorage;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class BookCollectionTest {

    @Test
    public void test() {
        //given
        BookCollection collecion = new BookCollection(new HashSet<>(), new BookStorage(new HashMap<>()));
        //when
        collecion.add("tytul, autor, typ");
        collecion.add("tytul, autor,33.33,typ,9.0");
        //then
        assertEquals(2, collecion.collectionSize());
    }

    @Test
    public void test2() {
        BookCollection collection2 = new BookCollection(new HashSet<>(), new BookStorage(new HashMap<>()));

        collection2.add("tytul, autor, typ");
        collection2.add("tytul-do-usuniecia, autor, typ");
        collection2.removeBook("tytul-do-usuniecia");
        assertEquals(1, collection2.collectionSize());
    }

    @Test
    public void test3() {
        BookCollection collection2 = new BookCollection(new HashSet<>(), new BookStorage(new HashMap<>()));
        collection2.add("tytul, autor, typ");
        collection2.add("tytul, autor, typ");

        assertEquals(1, collection2.collectionSize());
    }

    @Test
    public void test4(){
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();

        set.add("a");
        set.add("a");
        assertEquals(1, set.size());

        list.add("a");
        list.add("a");
        assertEquals(2, list.size());
    }
}