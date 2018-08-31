package pl.sda.bookstore.customer;

import java.util.Objects;

public abstract class Customer {

    private final String address;

    public Customer(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(address, customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address);
    }

}
