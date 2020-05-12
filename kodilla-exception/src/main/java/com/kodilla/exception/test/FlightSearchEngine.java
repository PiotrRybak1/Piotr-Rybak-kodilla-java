package com.kodilla.exception.test;

public class FlightSearchEngine {
    public static void main(String[] args) {

        FlightSearch flightSearch = new FlightSearch();
        try {
            flightSearch.findFlight(new Flight("Cape Town", "Copenhagen"));
            flightSearch.findFlight(new Flight("Berlin", "New York"));
            flightSearch.findFlight(new Flight("Chicago", "Osaka"));
            flightSearch.findFlight(new Flight("Berlin", "Moscow"));
            flightSearch.findFlight(new Flight("Cape Town", "Nmmdhkfhifh"));
            //flightSearch.findFlight(new Flight("Mjnbj","Pnmkjkj"));
            //flightSearch.findFlight(new Flight("New York","KLKOKJOJ"));
        } catch (RouteNotFoundException e) {
            System.out.println("Flight not found due to missing valid destination name. Please correct the city name.");
        }
    }
}
