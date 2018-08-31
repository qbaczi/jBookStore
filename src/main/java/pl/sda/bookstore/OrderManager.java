package pl.sda.bookstore;

import pl.sda.bookstore.Order;
import pl.sda.bookstore.customer.Customer;

import java.util.LinkedList;
import java.util.Queue;

public class OrderManager {

    Queue<Order> orderQueue = new LinkedList<>();


    public void add(Order order) {

        orderQueue.add(order);
    }

    public int orderCount() {

        return orderQueue.size();
    }

    public Order getNextOrder(){

        return orderQueue.remove();
    }

    public void removeOrder(Customer customer) {

        for (Order order : orderQueue) {
            if (order.getCustomer().equals(customer)) {
                orderQueue.remove(order);
            } else {
                System.out.println("Brak zamówienia");
            }
        }
    }

}
