/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

// Abstract Product
abstract class FlightDataFetcher {
    public abstract void fetchData(String dateRange);
}

// Concrete Product A
class AirlineAFlightFetcher extends FlightDataFetcher {
    @Override
    public void fetchData(String dateRange) {
        System.out.println("Fetching data from Airline A for dates: " + dateRange);
        // Simulated data fetching logic
        System.out.println("Data fetched: Sample Data from Airline A");
    }
}

// Concrete Product B
class AirlineBFlightFetcher extends FlightDataFetcher {
    @Override
    public void fetchData(String dateRange) {
        System.out.println("Fetching data from Airline B for dates: " + dateRange);
        // Simulated data fetching logic
        System.out.println("Data fetched: Sample Data from Airline B");
    }
}

// Creator
class FlightFetcherFactory {
    public static FlightDataFetcher createFetcher(String airline) {
        if (airline.equalsIgnoreCase("A")) {
            return new AirlineAFlightFetcher();
        } else if (airline.equalsIgnoreCase("B")) {
            return new AirlineBFlightFetcher();
        } else {
            throw new IllegalArgumentException("Unknown airline: " + airline);
        }
    }
}

