package com.kodilla.good.patterns.challenges.food2door;

public class Communicant implements InformService{
    @Override
    public void inform(User user) {
        System.out.println("The information has been sent");
    }
}
