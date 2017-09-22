
/**
 * Write a description of class Date here.
 *
 * @author Brice Bai
 * @version (a version number or a date)
 */
public class TwoFlightTrip
{   
    private Flight flight1, flight2;
    
    public TwoFlightTrip (Flight f1, Flight f2)
    {
        flight1 = f1;
        flight2 = f2;
    }
    
    public String toString()
    {    
        Time t1 = flight1.getArrTime();
        Time t2 = flight2.getDepTime();
        Time layover = (t1.elapsedTime (t2));
        
        return (flight1.toString()) + "\n\n" +
        "Layover" + layover.toString() + "\n\n" +
        flight2.toString();
        
    }
    
}