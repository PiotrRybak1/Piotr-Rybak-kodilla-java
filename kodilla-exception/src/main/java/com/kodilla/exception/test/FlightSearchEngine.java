package com.kodilla.exception.test;

public class FlightSearchEngine {
    public static void main(String[] args) {

        FlightSearch flightSearch = new FlightSearch();
        try {
            flightSearch.findFlight(new Flight("Cape Town", "Copenhagen")); // (true,true)
            flightSearch.findFlight(new Flight("Berlin", "New York"));      // (true,false)
            flightSearch.findFlight(new Flight("Chicago", "Osaka"));        // (false,true)
            flightSearch.findFlight(new Flight("Amsterdam", "Moscow"));     // (false,false)
            flightSearch.findFlight(new Flight("Cape Town", "Nmmdhkfhifh"));// (true, not exist)
            //flightSearch.findFlight(new Flight("Mjnbj","Pnmkjkj"));                                  // (not exist,not exist)
            //flightSearch.findFlight(new Flight("New York","KLKOKJOJ"));                              // (false, not exist)
        } catch (RouteNotFoundException e) {
            System.out.println("Flight not found due to missing valid destination name. Please correct the city name.");
        }
    }
}
