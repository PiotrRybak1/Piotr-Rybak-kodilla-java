package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;
import java.util.Random;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test collection: begin");
    }
    @After
    public void after() {
        System.out.println("Test collection: end");
    }


    @Test
    public void testOddNumbersExterminatorEmptyList() {

        ArrayList<Integer> testNumber = new ArrayList<Integer>();
        OddNumbersExterminator examinator = new OddNumbersExterminator();
        ArrayList<Integer> oddScore = examinator.exterminate(testNumber);
        Assert.assertTrue(oddScore.size() == 0);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        Random theGenerator = new Random();
        ArrayList<Integer> testNumber;
        testNumber = new ArrayList<Integer>();
        for (int k = 0; k < 100; k++) {
            testNumber.add(theGenerator.nextInt(200));
        }
        OddNumbersExterminator examinator = new OddNumbersExterminator();
        ArrayList<Integer> oddScore = examinator.exterminate(testNumber);
        for (int j = 0; j< oddScore.size(); j++)
        {
            Assert.assertTrue(oddScore.get(j) % 2 == 0);
        }

    }

}