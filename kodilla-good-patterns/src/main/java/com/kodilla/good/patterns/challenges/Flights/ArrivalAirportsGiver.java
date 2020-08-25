package com.kodilla.good.patterns.challenges.Flights;

import java.util.Objects;

public class ArrivalAirportsGiver {
    String name;

    public ArrivalAirportsGiver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArrivalAirportsGiver)) return false;
        ArrivalAirportsGiver that = (ArrivalAirportsGiver) o;
        return Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
