package com.kodilla.good.patterns.flights;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FlightFinder {
    private FlightDatabase flightDatabase;

    public FlightFinder(FlightDatabase flightDatabase) {
        this.flightDatabase = flightDatabase;
    }

    public void searchFromCity(String city){
        fromCity(city).stream().forEach(System.out::println);
    }

    public void searchToCity(String city){
        toCity(city).stream().forEach(System.out::println);
    }

    private List<Flight> fromCity(String city){
        return flightDatabase.getFlights().stream()
                .filter(s -> s.getFrom().equals(city))
                .collect(Collectors.toList());
    }

    private List<Flight> toCity(String city){
        return flightDatabase.getFlights().stream()
                .filter(s -> s.getTo().equals(city))
                .collect(Collectors.toList());
    }

    public void searchFromCityToCity(String from, String to){
        fromCity(from).stream()
                .filter(s -> s.getTo().equals(to))
                .forEach(System.out::println);
    }

    public void searchIndirectFlight(String from, String to){
        for (Flight flightFrom : fromCity(from)){
            for (Flight flightTo : toCity(to)){
                if(flightFrom.getTo().equals(flightTo.getFrom()) && flightFrom.getWhen().isBefore(flightTo.getWhen()))
                    System.out.println("Indirect flight: \n" + flightFrom + "\n" + flightTo);
            }
        }
    }
}
