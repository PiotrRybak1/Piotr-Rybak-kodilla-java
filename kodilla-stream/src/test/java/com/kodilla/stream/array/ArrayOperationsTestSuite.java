package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {

        //Given
        int n = 0;
        int[] numbers = new int[20];
        for (int i = 35; i < 55; i++) {
            numbers[n] = i;
            n++;
        }
        //When
        double sample = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(44.5, sample, 0.5);
    }
}
