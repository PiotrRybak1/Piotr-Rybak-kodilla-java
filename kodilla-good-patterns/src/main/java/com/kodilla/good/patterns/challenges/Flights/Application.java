package com.kodilla.good.patterns.challenges.Flights;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        Flight flight0 = new Flight("Warszawa","Wrocław");
        Flight flight1 = new Flight("Warszawa","Gdańsk");
        Flight flight2 = new Flight("Warszawa","Lublin");
        Flight flight3 = new Flight("Warszawa","Rzeszów");
        Flight flight4 = new Flight("Warszawa","Olsztyn");
        Flight flight5 = new Flight("Warszawa","Kraków");
        Flight flight6 = new Flight("Warszawa","Katowice");
        Flight flight7 = new Flight("Wrocław","Warszawa");
        Flight flight8 = new Flight("Wrocław","Franfurkt");
        Flight flight9 = new Flight("Warszawa","Franfurkt");
        Flight flight10 = new Flight("Gdańsk","Warszawa");
        Flight flight11 = new Flight("Gdańsk","Rejkiawik");
        Flight flight12 = new Flight("Lublin","Warszawa");
        Flight flight13 = new Flight("Lublin","Tel-awiw");
        Flight flight14 = new Flight("Lublin","Oslo");
        Flight flight15 = new Flight("Rzeszów","Warszawa");
        Flight flight16 = new Flight("Rzeszów","Moskwa");
        Flight flight17 = new Flight("Olsztyn","Warszawa");
        Flight flight18 = new Flight("Olsztyn","Helsinki");
        Flight flight19 = new Flight("Kraków","Warszawa");
        Flight flight20 = new Flight("Kraków","Ateny");
        Flight flight21 = new Flight("Kraków","Kair");
        Flight flight22 = new Flight("Katowice","Warszawa");
        Flight flight23 = new Flight("Katowice","Bukareszt");
        Flight flight24 = new Flight("Katowice","Warna");
        Flight flight25 = new Flight("Warszawa","Paryż");
        Flight flight26 = new Flight("Paryż","Warszawa");
        Flight flight27 = new Flight("Warszawa","Madryt");
        Flight flight28 = new Flight("Madryt","Warszawa");
        Flight flight29 = new Flight("Warszawa","Mediolan");
        Flight flight30 = new Flight("Mediolan","Warszawa");
        Flight flight31 = new Flight("Warszawa","Zurych");
        Flight flight32 = new Flight("Zurych","Warszawa");
        Flight flight33 = new Flight("Warszawa","Bruksela");
        Flight flight34 = new Flight("Bruksela","Bruksela");
        FlightList flightList = new FlightList();
        flightList.addFlight(flight0);
        flightList.addFlight(flight1);
        flightList.addFlight(flight2);
        flightList.addFlight(flight3);
        flightList.addFlight(flight4);
        flightList.addFlight(flight5);
        flightList.addFlight(flight6);
        flightList.addFlight(flight7);
        flightList.addFlight(flight8);
        flightList.addFlight(flight9);
        flightList.addFlight(flight10);
        flightList.addFlight(flight11);
        flightList.addFlight(flight12);
        flightList.addFlight(flight13);
        flightList.addFlight(flight14);
        flightList.addFlight(flight15);
        flightList.addFlight(flight16);
        flightList.addFlight(flight17);
        flightList.addFlight(flight18);
        flightList.addFlight(flight19);
        flightList.addFlight(flight20);
        flightList.addFlight(flight21);
        flightList.addFlight(flight22);
        flightList.addFlight(flight23);
        flightList.addFlight(flight24);
        flightList.addFlight(flight25);
        flightList.addFlight(flight26);
        flightList.addFlight(flight27);
        flightList.addFlight(flight28);
        flightList.addFlight(flight29);
        flightList.addFlight(flight30);
        flightList.addFlight(flight31);
        flightList.addFlight(flight32);
        flightList.addFlight(flight33);
        flightList.addFlight(flight34);

        DepartureAirportGiver departureAirportGiver = new DepartureAirportGiver("Warszawa");
        ArrivalAirportsGiver arrivalAirportsGiver = new ArrivalAirportsGiver( "Rejkiawik");


        SearchEngine searchEngine = new SearchEngine(flightList);
        System.out.println("Direct air connections that are available from the airport in the city " + departureAirportGiver.getName()+ " are: " );
        List<Flight> warsawDepartureAirport = searchEngine.allFlightsFrom(departureAirportGiver);
        warsawDepartureAirport.stream()
                .map(Flight::getArrivalAirport)
                .forEach(System.out::println);

System.out.println();
        System.out.println("Direct air connections that are available to the airport in the city " + arrivalAirportsGiver.getName()+ " are: " );
        List<Flight> kairArrivalAirport = searchEngine.allFlightsTo(arrivalAirportsGiver);
        kairArrivalAirport.stream()
                .map(Flight::getDepartureAirport)
                .forEach(System.out::println);

        System.out.println();
System.out.println("The indirect air connection that is available from the airport in the city " + departureAirportGiver.getName() +" to the airport in the city " + arrivalAirportsGiver.getName() +" is via the airport in the city: ");
        List<String> indirectConnectionBetweenTheAirports = searchEngine.allPossibleConnection(departureAirportGiver,arrivalAirportsGiver);
indirectConnectionBetweenTheAirports
        .forEach(System.out ::println);










    }
}
