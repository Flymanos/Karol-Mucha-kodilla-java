package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {
    public static void main(String args[]){
        FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFlight(new Flight("Krakow", "Hrhrhr"));
        } catch (RouteNotFoundException e){
            System.out.println(e);
        } finally {
            System.out.println("Route finding finished.");
        }
    }

    public void findFlight(Flight flight) throws RouteNotFoundException{
        HashMap<String, Boolean> availableAirports = initializeMap();
        if (!availableAirports.containsKey(flight.getArrivalAirport()) || !availableAirports.containsKey(flight.getDepartureAirport())){
            throw new RouteNotFoundException("Route not found!");
        }
        System.out.println(flight.getArrivalAirport() + " available: " + availableAirports.get(flight.getArrivalAirport()));
        System.out.println(flight.getDepartureAirport() + " available: " + availableAirports.get(flight.getDepartureAirport()));
    }

    public HashMap<String, Boolean> initializeMap(){
        HashMap<String, Boolean> availableAirports = new HashMap<>();
        availableAirports.put("Krakow", true);
        availableAirports.put("Londyn", true);
        availableAirports.put("Moskwa", false);
        availableAirports.put("Pcim Dolny", false);
        return availableAirports;
    }
}
