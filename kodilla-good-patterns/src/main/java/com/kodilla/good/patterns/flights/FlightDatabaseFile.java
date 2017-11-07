package com.kodilla.good.patterns.flights;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

public class FlightDatabaseFile implements FlightDatabase{
    private HashSet<Flight> flights = new HashSet<>();
    private String filename;

    public FlightDatabaseFile(String filename) {
        this.filename = filename;
        reload();
    }

    public void reload(){
        parseFile(loadFile(filename));
    }

    public ArrayList<String> loadFile(String filename){
        ArrayList<String> flights = new ArrayList<>();
        File file = new File(filename);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                flights.add(scanner.nextLine());
            }
            return flights;
        } catch (FileNotFoundException e){
            System.out.println(e);
        }
        return flights;
    }

    public void parseFile(ArrayList<String> flightStrings){
        for (String flight: flightStrings) {
            StringTokenizer stringTokenizer = new StringTokenizer(flight, ";", false);
            flights.add(new Flight(stringTokenizer.nextToken(), stringTokenizer.nextToken(),
                    LocalDate.of(Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()),
                            Integer.parseInt(stringTokenizer.nextToken()))));
        }
    }

    @Override
    public Collection<Flight> getFlights() {
        return flights;
    }

    @Override
    public void addFlight(Flight flight) {
        File file = new File(filename);
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.append(flight.toString());
        }catch (IOException e){
            System.out.println(e);
        }
        reload();
    }
}
