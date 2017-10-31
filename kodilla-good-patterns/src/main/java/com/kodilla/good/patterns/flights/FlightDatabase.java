package com.kodilla.good.patterns.flights;

import java.util.Collection;

public interface FlightDatabase {
    public Collection<Flight> getFlights();

    public void addFlight(Flight flight);
}
