package com.kodilla.good.patterns.challenges.food2door;

public class BuyingDto {
    public User user;
    public boolean acceptedShoping;

    public BuyingDto(User user, boolean acceptedShoping) {
        this.user = user;
        this.acceptedShoping = acceptedShoping;
    }

    public User getUser() {
        return user;
    }

    public boolean isAcceptedShoping() {
        return acceptedShoping;
    }
}

