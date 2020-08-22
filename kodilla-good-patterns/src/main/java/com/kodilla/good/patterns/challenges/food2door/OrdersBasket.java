package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OrdersBasket {
    List<Order> orders = new ArrayList<>();

    public void addOrders(Order order) {
        orders.add(order);
    }

    public boolean removeOrders(Order order) {
        return orders.remove(order);
    }

    public List<Order> getOrders() {
        return new ArrayList<>(orders);
    }


    @Override
    public String toString() {
        return "OrdersBasket{" +
                "orders=" + orders +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrdersBasket)) return false;
        OrdersBasket that = (OrdersBasket) o;
        return getOrders().equals(that.getOrders());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrders());
    }
}




