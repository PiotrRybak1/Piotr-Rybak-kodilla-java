package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.SocialNetworks.SnapchatPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
@Test
    public void testDefaultSharingStrategies(){
    //Given
    User alfred = new Millenials("Alfred G.");
    User henio = new ZGeneration( "Henryk K.");
    User gienio = new YGeneration("Gienek Ż.");

    //When
    String alfredFavoriteSocialNetwork = alfred.favoriteSocialNetwork();
    String henioFavoriteSocialNetwork = henio.favoriteSocialNetwork();
    String gienioFavoriteSocialNetwork = gienio.favoriteSocialNetwork();


    //Then
    Assert.assertEquals("Facebook", alfredFavoriteSocialNetwork);
    Assert.assertEquals("Snapchat", henioFavoriteSocialNetwork);
    Assert.assertEquals("Twitter", gienioFavoriteSocialNetwork);


}
@Test
    public void testIndividualSharingStrategy(){
    //Given
    User gienio = new YGeneration("Gienek Ż.");

    //When
    String gienioFavoriteSocialNetwork = gienio.favoriteSocialNetwork();
    System.out.println("Gieno favorite social network is " + gienioFavoriteSocialNetwork + ".");
    gienio.setSocialPublisher(new SnapchatPublisher());
    gienioFavoriteSocialNetwork = gienio.favoriteSocialNetwork();
    System.out.println("Now Gieno favorite social network is " + gienioFavoriteSocialNetwork + ".");

    //Then
    Assert.assertEquals("Snapchat", gienioFavoriteSocialNetwork);
}

}

