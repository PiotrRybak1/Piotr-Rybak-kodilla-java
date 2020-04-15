package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testaddFigure() {
        //Given
        ArrayList<Shape> figureCollection = new ArrayList<>();
        //When
        figureCollection.add(new Circle("circle", 4.5));
        //Then
        Assert.assertEquals(1, figureCollection.size());
    }

    @Test
    public void testremoveFigure() {
        //Given
        ArrayList<Shape> figureCollection = new ArrayList<>();
        //When
        figureCollection.add(new Circle("circle", 4.5));
        boolean result = figureCollection.remove(new Circle("circle", 4.5));
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, figureCollection.size());
    }

    @Test
    public void testgetFigure() {
        //Given
        ArrayList<Shape> figureCollection = new ArrayList<>();
        //When
        figureCollection.add(new Triangle("triangle", 4.5, 5.6));
        Shape items = figureCollection.get(0);
        //Then
        Assert.assertEquals(new Triangle("triangle", 4.5, 5.6), items);
    }

    @Test
    public void testShowFigures() {
        //Given
        ArrayList<Shape> figureCollection = new ArrayList<>();
        //When
        figureCollection.add(new Circle("circle", 4.5));
        Shape items = figureCollection.get(0);
        String figureName = items.getShapeName();
        //Then
        Assert.assertEquals("circle", figureName);

    }


}

