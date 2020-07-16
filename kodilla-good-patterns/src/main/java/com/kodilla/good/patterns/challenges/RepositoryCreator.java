package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class RepositoryCreator implements OrderRepository {
    @Override
    public boolean createOrder(User user, LocalDateTime TimeOrder, Product product) {
        System.out.println("Repository for " + user + " has been created");
        return true;
    }


}
