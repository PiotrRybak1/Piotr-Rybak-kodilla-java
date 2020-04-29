package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final List<Country> country;
    private final String nameContinent;

    public Continent(final List<Country> country, final String nameContinent) {
        this.country = country;
        this.nameContinent = nameContinent;
    }

    public List<Country> getCountry() {
        return country;
    }

}

