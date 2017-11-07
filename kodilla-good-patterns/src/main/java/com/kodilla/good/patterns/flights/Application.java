package com.kodilla.good.patterns.flights;

import java.time.LocalDate;

public class Application {
    public static void main(String args[]){
        FlightDatabase flightDatabase = new FlightDatabaseFile("/Users/karolmucha/Documents/lotyDB.txt");
        flightDatabase.addFlight(new Flight("Warszawa", "Wroclaw", LocalDate.of(2014, 12, 24)));
        FlightFinder flightFinder = new FlightFinder(flightDatabase);
        flightFinder.searchFromCity("Warszawa");
        flightFinder.searchToCity("Wroclaw");
        flightFinder.searchFromCityToCity("Warszawa", "Wroclaw");
        flightFinder.searchIndirectFlight("Warszawa", "Praga");
    }
}
