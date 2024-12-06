/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

//Controller
public class FlightController {
    private FlightModel model;
    private FlightView view;

    public FlightController(FlightModel model, FlightView view) {
        this.model = model;
        this.view = view;
    }

    public void addFlight(String date, String price) {
        model.addFlight(date, price);
        view.displayMessage("Flight added: " + date + " -> " + price);
    }

    public void getFlightPrice(String date) {
        String price = model.getPrice(date);
        view.displayFlightPrice(date, price);
    }

    public void displayAllFlights() {
        view.displayAllFlights(model.getAllFlights());
    }
}
