/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

//View

import java.util.Map;

public class FlightView {
    public void displayFlightPrice(String date, String price) {
        System.out.println("Flight on " + date + ": " + price);
    }

    public void displayAllFlights(Map<String, String> flights) {
        System.out.println("Available Flights:");
        flights.forEach((date, price) -> System.out.println("Date: " + date + ", Price: " + price));
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
