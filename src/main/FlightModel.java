/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

//Model
import java.util.HashMap;
import java.util.Map;

public class FlightModel {
    private Map<String, String> flightPrices = new HashMap<>();

    public void addFlight(String date, String price) {
        flightPrices.put(date, price);
    }

    public String getPrice(String date) {
        return flightPrices.getOrDefault(date, "No data available");
    }

    public Map<String, String> getAllFlights() {
        return flightPrices;
    }
}
