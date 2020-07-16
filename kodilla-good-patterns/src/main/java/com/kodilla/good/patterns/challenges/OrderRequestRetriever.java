package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retriever(){
        User user = new User("Jacek", "Placek");
        LocalDateTime timeOrder = LocalDateTime.of(2020,1,17,13,13);
        Product product = new Product( "Nice Socks",14.50);
        return new OrderRequest(user,timeOrder,product);
    }
}
