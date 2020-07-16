package com.kodilla.good.patterns.challenges;

public class Information  implements InformationService{
    @Override
    public void inform(User user) {
        System.out.println("email sent to " + user);
    }
}
