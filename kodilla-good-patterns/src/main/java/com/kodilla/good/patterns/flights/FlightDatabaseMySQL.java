package com.kodilla.good.patterns.flights;

import java.util.HashSet;

public class FlightDatabaseMySQL implements FlightDatabase{
    HashSet<Flight> flights = new HashSet<>();

    public HashSet<Flight> getFlights() {
        return flights;
    }

    public void addFlight(Flight flight){
        flights.add(flight);
    }
}
