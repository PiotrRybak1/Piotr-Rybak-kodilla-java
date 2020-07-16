package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private LocalDateTime timeOrder;
    private Product product;

    public OrderRequest(User user, LocalDateTime timeOrder, Product product) {
        this.user = user;
        this.timeOrder = timeOrder;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getTimeOrder() {
        return timeOrder;
    }

    public Product getProduct() {
        return product;
    }
}
