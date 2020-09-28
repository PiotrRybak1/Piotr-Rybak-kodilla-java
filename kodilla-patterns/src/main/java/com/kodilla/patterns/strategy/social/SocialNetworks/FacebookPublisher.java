package com.kodilla.patterns.strategy.social.SocialNetworks;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class FacebookPublisher implements SocialPublisher {
    public String share(){
        return "Facebook";
    }

}
