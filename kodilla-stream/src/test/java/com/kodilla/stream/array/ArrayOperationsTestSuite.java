package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {

        //Given
        int[] numbers = new int[20];
        for (int i = 0; i < 20; i++) {
            numbers[i] = i;
        }
        //When
        double sample = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(9.5, sample, 0.5);
    }
}
