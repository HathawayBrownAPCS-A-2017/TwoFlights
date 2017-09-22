
/**
 * Time class manages Time.
 * Time is stored in a 24-hour format.
 *
 * @author Michael Buescher
 * @version APCS 2017
 */
public class Time
{
    // instance variables - replace the example below with your own
    private int hour, minute, second;

    // ----------------------------------------------------------
    /** No-args constructor sets the time to midnight.       */
    public Time()
    {
        hour = 0;
        minute = 0;
        second = 0;
    }
    
    /** Constructor sets the hour, minute, and second to values passed
     *  through parameters. 
     * @param h the hour
     * @param m the minute
     * @param s the second
     */
    public Time (int h, int m, int s)
    {
         hour = h;
         minute = m;
         second = s;
    }
     
    /** Constructor sets the hour and minute to values passed
     *  through parameters. 
     * @param h the hour
     * @param m the minute
     */
    public Time (int h, int m)
    {
         hour = h;
         minute = m;
         second = 0;
    }
  
    /* ------------------ Accessor Methods ------------------------- */
    /** @return the hour  */
    public int getHour () 
    {  return hour;  }
    
    /** @return the minute  */
    public int getMinute () 
    {  return minute;  }
    
    /** @return the second  */
    public int getSecond () 
    {  return second;  }
    
    /* ------------------ Mutator Methods ------------------------- */
    /** @param the new hour  */
    public void setHour (int h)
    {  hour = h;  }
    
    /** @param the new minute  */
    public void setMinute (int m)
    {  minute = m;  }
    
    /** @param the new second  */
    public void setSecond (int s)
    {  second = s;  }
    
    /** sets the Time to (hour, minute, second)
     * @param h the hour
     * @param m the minute
     * @param s the second
     */
    public void setTime (int h, int m, int s)
    {
         hour = h;
         minute = m;
         second = s;
    }
     
    
    /* ------------------ Formatting Methods ------------------------- */
    /** Override the toString method. 
     *  Writes the Time in the format HH:MM:SS  */
    public String toString ()
    {
        return (to2Digits(hour) + ":" + 
                to2Digits(minute) + ":" + 
                to2Digits(second));
    }
    
    private String to2Digits (int n)
    {
        if (n < 10)
        {
            return "0" + n;
        }
        else
        {
            return "" + n;
        }
    }
    
    
    /* ------------------ Calculation Methods ------------------------ */
    public void addMinutes (int n)
    {
        int newMin = this.minute + n;
        this.minute = newMin % 60;
        this.addHours(newMin / 60);
    }
    
    public void addHours (int n)
    {
        int newHour = this.hour + n;
        this.hour = newHour % 24;
    }
    
    /**
     * Precondition:  Time other is later than this Time
     */
    public Time elapsedTime (Time other)
    {
        int totalSecThis = this.second + (60 * this.minute) + (3600 * this.hour);
        int totalSecOther = other.getSecond() + (60 * other.getMinute()) + (3600 * other.getHour());
        int elapsedSeconds = totalSecOther - totalSecThis;
        int newHour = elapsedSeconds / 3600;
        int newMin = (elapsedSeconds % 3600) / 60;
        int newSec = elapsedSeconds % 60;
        return new Time(newHour, newMin, newSec);
    }
    
    
    
    
    
    
    
    
}
