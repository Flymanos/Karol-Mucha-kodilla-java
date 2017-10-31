package com.kodilla.good.patterns.flights;

import java.time.LocalDate;

public class Flight {
    private final String from;
    private final String to;
    private final LocalDate when;

    public Flight(String from, String to, LocalDate when) {
        this.from = from;
        this.to = to;
        this.when = when;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public LocalDate getWhen() {
        return when;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!getFrom().equals(flight.getFrom())) return false;
        if (!getTo().equals(flight.getTo())) return false;
        return getWhen().equals(flight.getWhen());
    }

    @Override
    public int hashCode() {
        return getFrom().hashCode();
    }

    @Override
    public String toString() {
        return "Flight{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", when=" + when +
                '}';
    }
}
