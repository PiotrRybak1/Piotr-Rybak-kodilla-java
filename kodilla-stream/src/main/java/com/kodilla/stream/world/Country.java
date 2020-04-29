package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public final class Country {
    private final BigDecimal peopleQuantity;
    private final String countryName;

    public Country(final BigDecimal peopleQuantity, final String countryName) {
        this.peopleQuantity = peopleQuantity;
        this.countryName = countryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;
        Country country = (Country) o;
        return Objects.equals(getPeopleQuantity(), country.getPeopleQuantity()) &&
                Objects.equals(countryName, country.countryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPeopleQuantity(), countryName);
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

}
