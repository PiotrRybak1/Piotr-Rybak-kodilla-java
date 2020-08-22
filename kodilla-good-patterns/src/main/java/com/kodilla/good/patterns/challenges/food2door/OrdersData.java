package com.kodilla.good.patterns.challenges.food2door;

public class OrdersData {
    User user;
    Product product;
    Producer producer;
    Order order;
    OrdersBasket ordersBasket;

    public OrdersData(User user, Producer producer, OrdersBasket ordersBasket) {
        this.user = user;
        this.product = product;
        this.producer = producer;
        this.order = order;
        this.ordersBasket = ordersBasket;
    }

    public User getUser() {
        return user;
    }



    public Product getProduct() {
        return product;
    }

    public Producer getProducer() {
        return producer;
    }

    public Order getOrder() {
        return order;
    }

    public OrdersBasket getOrdersBasket() {
        return ordersBasket;
    }
}
