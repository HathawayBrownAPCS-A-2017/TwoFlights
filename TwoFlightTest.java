/**
 * A test class for two Flights
 */
public class TwoFlightTest
{
    public static void main( String[] args)
    {
        Flight firstFlight = new Flight ("United", "275", 
            new Time (15, 23), new Time (17, 34), "CLE", "SFO");
            
        Flight secondFlight = new Flight ("United". "4723",
            new Time (18, 46), new Time (23, 59), "SFO", "AUK");
            
        TwoFlightTrip myItinerary = new TwoFlightTrip (firstFlight, secondFlight);
        System.out.println (myItinerary);
}
