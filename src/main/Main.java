/*
Maan Bashwieh
1846435
 */
package main;

public class Main {
    public static void main(String[] args) {
        // Instantiate Model and View
        FlightModel model = new FlightModel();
        FlightView view = new FlightView();

        // Create Controller
        FlightController controller = new FlightController(model, view);

        // Add Flights
        controller.addFlight("2024-12-01", "$300");
        controller.addFlight("2024-12-05", "$250");
        controller.addFlight("2024-12-10", "$200");

        // Fetch Specific Flight Price
        controller.getFlightPrice("2024-12-05");

        // Display All Flights
        controller.displayAllFlights();
        
         FlightPriceTracker tracker = new FlightPriceTracker();

        // Create observers
        MobileAppUser user1 = new MobileAppUser("Alice");
        MobileAppUser user2 = new MobileAppUser("Bob");
        EmailSubscriber subscriber1 = new EmailSubscriber("alice@example.com");

        // Register observers
        tracker.registerObserver(user1);
        tracker.registerObserver(user2);
        tracker.registerObserver(subscriber1);

        // Update price and notify observers
        tracker.setPriceUpdate("Price dropped to $300 for flights on 2024-12-10!");
        
        // Remove an observer and update again
        tracker.removeObserver(user2);
        tracker.setPriceUpdate("Price dropped to $250 for flights on 2024-12-15!");

         String[] airlines = {"A", "B"};
        String dateRange = "2024-12-01 to 2024-12-15";

        for (String airline : airlines) {
            FlightDataFetcher fetcher = FlightFetcherFactory.createFetcher(airline);
            fetcher.fetchData(dateRange);
        }
        
         String dateRange2 = "2024-12-01 to 2024-12-15";

        // Using the Adapter for Airline A
        AirlineAAPI airlineAAPI = new AirlineAAPI();
        FlightAPI airlineAAdapter = new AirlineAAdapter(airlineAAPI);
        airlineAAdapter.getFlightData(dateRange);

        // Using the Adapter for Airline B
        AirlineBAPI airlineBAPI = new AirlineBAPI();
        FlightAPI airlineBAdapter = new AirlineBAdapter(airlineBAPI);
        airlineBAdapter.getFlightData(dateRange);
    }
}

