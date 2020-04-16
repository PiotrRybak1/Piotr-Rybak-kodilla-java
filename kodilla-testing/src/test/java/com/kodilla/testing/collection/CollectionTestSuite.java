package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;
import java.util.Random;

public class CollectionTestSuite {
    private ArrayList<Integer> prepareData() {
        Random theGenerator = new Random();
        ArrayList<Integer> testNumber;
        testNumber = new ArrayList<Integer>();
        for (int k = 0; k < 100; k++) {
            testNumber.add(theGenerator.nextInt(200));
        }

        return testNumber;
    }

    @Before
    public void before() {
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
        ArrayList<Integer> oddNumbers = examinator.exterminate(testNumber);
        Assert.assertEquals(oddNumbers.size(), 0);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        CollectionTestSuite testData = new CollectionTestSuite();
        ArrayList<Integer> dataTest = testData.prepareData();
        OddNumbersExterminator examinator = new OddNumbersExterminator();
        ArrayList<Integer> oddScore = examinator.exterminate(dataTest);
        for (int j = 0; j < oddScore.size(); j++) {
            Assert.assertTrue(oddScore.get(j) % 2 == 0);
        }

    }

}