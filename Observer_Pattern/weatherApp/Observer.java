/* 
public interface Observer
{
    // has state values that the observer gets from the subject when
    // a weather measurement changes
    public void update(float temp, float humidty, float preassure);
}
*/

// updated version
// has no paramets now
public interface Observer
{
    public void update();
}

/*
    observer interface is implemented by all the observers
    they all have to implement the update() method
    passes the measurements to the observers
*/