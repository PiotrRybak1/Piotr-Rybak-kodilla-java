package com.kodilla.good.patterns.challenges.Flights;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FlightList {
    List<Flight>ListOfFlights= new ArrayList<>();


    public void addFlight(Flight flight){
        ListOfFlights.add(flight);
    }
    public boolean removeFlight(Flight flight){
       return ListOfFlights.remove(flight);
    }

    public List<Flight> getListOfFlights(){

        return new ArrayList<Flight>(ListOfFlights);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FlightList)) return false;
        FlightList that = (FlightList) o;
        return Objects.equals(getListOfFlights(), that.getListOfFlights());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getListOfFlights());
    }
}
