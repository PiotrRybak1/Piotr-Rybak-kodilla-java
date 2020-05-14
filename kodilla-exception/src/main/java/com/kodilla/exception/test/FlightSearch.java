package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    @Override
    public String toString() {
        return "FlightSearch{}";
    }

    public Boolean checkIfTheFlightIsAvailable(Map <String,Boolean>flights,Flight flight){
       Boolean available = flights.containsKey(flight.getDepartureAirport())
                && flights.get(flight.getDepartureAirport())
                && flights.containsKey(flight.getArrivalAirport())
                && flights.get(flight.getArrivalAirport());
        return available;


    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> flights = new HashMap<>();
        flights.put("Adelaide", true);
        flights.put("Copenhagen", true);
        flights.put("Moscow", false);
        flights.put("Wuhan", false);
        flights.put("Mediolan", false);
        flights.put("Toronto", true);
        flights.put("Tokyo", true);
        flights.put("Vancouver", true);
        flights.put("Calgary", true);
        flights.put("Osaka", true);
        flights.put("Sydney", true);
        flights.put("Melbourne", true);
        flights.put("Vienna", true);
        flights.put("New York", false);
        flights.put("Chicago", false);
        flights.put("Cape Town", true);
        flights.put("Zurich", true);
        flights.put("Amsterdam", false);
        flights.put("Berlin", true);
        flights.put("Geneva", true);



        if (checkIfTheFlightIsAvailable(flights,flight)){
            System.out.println("Found a flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + "." + " Clic the link to go to the booking page. ");
        }
        else if (flights.containsKey(flight.getDepartureAirport()) && flights.containsKey(flight.getArrivalAirport())) {

            System.out.println("Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " not found. Clic the link to move back to the search engine.");
        } else {
            throw new RouteNotFoundException("The searched set does not have such a city");
        }

    }
}




