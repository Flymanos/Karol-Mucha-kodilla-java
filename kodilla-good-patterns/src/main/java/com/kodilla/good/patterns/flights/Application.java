package com.kodilla.good.patterns.flights;

import java.time.LocalDate;

public class Application {
    public static void main(String args[]){
        FlightDatabase flightDatabase = new FlightDatabaseMySQL();
        flightDatabase.addFlight(new Flight("Wroclaw", "Pionki", LocalDate.of(2010, 9, 12)));
        flightDatabase.addFlight(new Flight("Pionki", "Praga", LocalDate.of(2010, 9, 13)));
        flightDatabase.addFlight(new Flight("Wroclaw", "Warszawa", LocalDate.of(2010, 9, 12)));
        flightDatabase.addFlight(new Flight("Warszawa", "Praga", LocalDate.of(2010, 9, 13)));
        FlightFinder flightFinder = new FlightFinder(flightDatabase);
        flightFinder.searchFromCity("Pionki");
        flightFinder.searchToCity("Praga");
        flightFinder.searchFromCityToCity("Wroclaw", "Pionki");
        flightFinder.searchIndirectFlight("Wroclaw", "Praga");
    }
}
