package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testgetPeopleQuantity() {
        //Given
        List<Continent>continents=new ArrayList<>();
        continents.add(new Continent(new ArrayList <Country>(Collections.singleton((new Country(new BigDecimal("111111111111111"), "Germany")))),"Europa"));
        continents.add(new Continent(new ArrayList <Country>(Collections.singleton((new Country(new BigDecimal("222222222222222"), "Poland")))),"Europa"));
        continents.add(new Continent(new ArrayList <Country>(Collections.singleton((new Country(new BigDecimal("333333333333333"), "Norway")))),"Europa"));
        continents.add(new Continent(new ArrayList <Country>(Collections.singleton((new Country(new BigDecimal("444444444444444"), "India")))),"Asia"));
        continents.add(new Continent(new ArrayList <Country>(Collections.singleton((new Country(new BigDecimal("555555555555555"), "Pakistan")))),"Asia"));
        continents.add(new Continent(new ArrayList <Country>(Collections.singleton((new Country(new BigDecimal("666666666666666"), "USA")))),"America"));
        continents.add(new Continent(new ArrayList <Country>(Collections.singleton((new Country(new BigDecimal("777777777777777"), "Japan")))),"Asia"));
        continents.add(new Continent(new ArrayList <Country>(Collections.singleton((new Country(new BigDecimal("888888888888888"), "Senegal")))),"Africa"));
        continents.add(new Continent(new ArrayList <Country>(Collections.singleton((new Country(new BigDecimal("999999999999999"), "China")))),"Asia"));
        World world = new World(continents);



        //Then
        Assert.assertEquals(new BigDecimal("4999999999999995"), world.getPeopleQuantity());

    }
}

