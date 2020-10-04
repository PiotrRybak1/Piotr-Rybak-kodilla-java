package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder() {

        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("bun with sezame")
                .ingredients("cucumber")
                .sauce("sweet and sour")
                .burgers(3)
                .ingredients("red onion")
                .ingredients("lettuce")
                .ingredients("tomato")
                .bulid();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        String whatABun = bigmac.getBun();
        String watASauce = bigmac.getSauce();

        //Then
        Assert.assertEquals(4, howManyIngredients);
        Assert.assertEquals(3, howManyBurgers);
        Assert.assertEquals("bun with sezame", whatABun);
        Assert.assertEquals("sweet and sour", watASauce);


    }
}
