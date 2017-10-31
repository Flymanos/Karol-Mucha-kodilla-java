package com.kodilla.good.patterns.flights;

import java.util.Set;

public interface FlightDatabase {
    public Set<Flight> getFlights();

    public void addFlight(Flight flight);
}
