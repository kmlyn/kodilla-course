package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Warsaw", true);
        airports.put("Prague", false);
        airports.put("Geneve", true);
        airports.put("Helsinki", true);

        if(!airports.get(flight.getArrivalAirport()) || !airports.get(flight.getDepartureAirport()))
            throw new RouteNotFoundException();
    }
}
