package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    public static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .forEach(System.out::println);
        double average = IntStream.range(0, numbers.length)
                .mapToDouble(n -> (double) n)
                .average().getAsDouble();


        return average;

    }


}

