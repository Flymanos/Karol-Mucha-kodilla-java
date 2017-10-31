package com.kodilla.good.patterns.flights;

import java.util.Set;

public interface FlightDatabase {
    public Iterable<Flight> getFlights();

    public void addFlight(Flight flight);
}
