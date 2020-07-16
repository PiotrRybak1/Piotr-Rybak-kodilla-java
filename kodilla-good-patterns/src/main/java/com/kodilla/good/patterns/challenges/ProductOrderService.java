package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {
    @Override
    public boolean order(User user, LocalDateTime timeOrder, Product product) {
        return true;
    }
}
