package pl.sda.bookstore.menu;

import org.junit.jupiter.api.Test;
import pl.sda.bookstore.Order;
import pl.sda.bookstore.OrderManager;

import static org.junit.jupiter.api.Assertions.*;

class OrderManagerTest {

    @Test
    void shouldAddOrder() {
        //given
        OrderManager orderManager = new OrderManager();
        //when
        orderManager.add(new Order("Anna, Kowalska, Poznań"));
        orderManager.add(new Order("Julia, Nowak, Wrocław"));

        //then
        assertEquals(orderManager.orderCount(), 2);
    }

}