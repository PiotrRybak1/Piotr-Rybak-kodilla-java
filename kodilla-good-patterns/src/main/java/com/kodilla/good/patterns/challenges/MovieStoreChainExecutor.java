package com.kodilla.good.patterns.challenges;
import java.util.stream.Collectors;

public class MovieStoreChainExecutor {
    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();
        String chain = movieStore.getMovies().entrySet().stream()
                .flatMap(titles -> titles.getValue().stream())
                .collect(Collectors.joining("!"," "," "));
        System.out.println(chain);


    }
}
