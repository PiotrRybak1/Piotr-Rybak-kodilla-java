package com.kodilla.good.patterns.challenges.Flights;

import java.util.Objects;

public class DepartureAirportGiver {
    String name;

    public DepartureAirportGiver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DepartureAirportGiver)) return false;
        DepartureAirportGiver that = (DepartureAirportGiver) o;
        return Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "DepartureAirportGiver{" +
                "name='" + name + '\'' +
                '}';
    }
}
