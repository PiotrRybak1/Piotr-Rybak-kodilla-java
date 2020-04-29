package com.kodilla.stream.world;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    List<Continent> continent;

    public World(List<Continent> continent) {
        this.continent = continent;
    }



    public final BigDecimal getPeopleQuantity() {
        return continent.stream()
                .flatMap(people -> people.getCountry().stream())
                .map(people -> people.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));


    }
}

