/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

// Target Interface
interface FlightAPI {
    void getFlightData(String dateRange);
}

// Adaptee 1
class AirlineAAPI {
    public void fetchFlights(String dateRange) {
        System.out.println("Airline A: Fetching flights for " + dateRange);
    }
}

// Adaptee 2
class AirlineBAPI {
    public void retrieveFlights(String dateRange) {
        System.out.println("Airline B: Retrieving flights for " + dateRange);
    }
}

// Adapter for Airline A
class AirlineAAdapter implements FlightAPI {
    private AirlineAAPI airlineA;

    public AirlineAAdapter(AirlineAAPI airlineA) {
        this.airlineA = airlineA;
    }

    @Override
    public void getFlightData(String dateRange) {
        airlineA.fetchFlights(dateRange);
    }
}

// Adapter for Airline B
class AirlineBAdapter implements FlightAPI {
    private AirlineBAPI airlineB;

    public AirlineBAdapter(AirlineBAPI airlineB) {
        this.airlineB = airlineB;
    }

    @Override
    public void getFlightData(String dateRange) {
        airlineB.retrieveFlights(dateRange);
    }
}
