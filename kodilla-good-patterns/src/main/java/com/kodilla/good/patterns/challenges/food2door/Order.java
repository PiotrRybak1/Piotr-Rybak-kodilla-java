package com.kodilla.good.patterns.challenges.food2door;

import java.util.Objects;

public class Order {
    User user;
    Product product;
    double quantity;
    Producer producer;

    public Order(User user, Product product, double quantity,Producer producer) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.producer = producer;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    public Double amountToPay(){
       return product.getProductPrice()*getQuantity();
    }

    public Producer getProducer() {
        return producer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return Double.compare(order.getQuantity(), getQuantity()) == 0 &&
                Objects.equals(getUser(), order.getUser()) &&
                Objects.equals(getProduct(), order.getProduct()) &&
                Objects.equals(getProducer(), order.getProducer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUser(), getProduct(), getQuantity(), getProducer());
    }
}
