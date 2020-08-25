package com.kodilla.good.patterns.challenges.Flights;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SearchEngine {
    FlightList flightList;


    public SearchEngine(FlightList flightList) {
        this.flightList = flightList;
    }

    public List<Flight> allFlightsFrom(DepartureAirportGiver departureAirportGiver){
            return flightList.getListOfFlights().stream()
                .filter(f->f.getDepartureAirport().equals(departureAirportGiver.getName()))
                //.map(Flight::getArrivalAirport)
                .collect(Collectors.toList());

    }
    public List<Flight> allFlightsTo(ArrivalAirportsGiver arrivalAirportsGiver) {
         return flightList.getListOfFlights().stream()
                .filter(f -> f.getArrivalAirport().equals(arrivalAirportsGiver.getName()))
                //.map(Flight::getDepartureAirport)
                .collect(Collectors.toList());

    }
    public List<String> allPossibleConnection(DepartureAirportGiver departureAirportGiver,ArrivalAirportsGiver arrivalAirportsGiver){
        List<Flight> gArrAirForDepartureAir = allFlightsFrom(departureAirportGiver);
        List<Flight> gDepAirForArrivalAir = allFlightsTo(arrivalAirportsGiver);
        List <String> dAG = gArrAirForDepartureAir.stream()
                .map(Flight::getArrivalAirport)
                .collect(Collectors.toList());


        List <String> aAG = gDepAirForArrivalAir.stream()
                .map(Flight::getDepartureAirport)
                .collect(Collectors.toList());

        List<List<String>>connectionsListToCompare = new ArrayList<>();
        connectionsListToCompare.add(dAG);
        connectionsListToCompare.add(aAG);
        Set<String>uniqueAirports = new HashSet<>();
         return connectionsListToCompare.stream()
                .flatMap(n->n.stream())
                 .filter(n->!uniqueAirports.add(n))
                .collect(Collectors.toList());


    }

}
