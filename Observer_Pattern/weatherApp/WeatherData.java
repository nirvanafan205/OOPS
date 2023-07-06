import java.util.*;

// implements the subject interface
public class WeatherData implements Subject 
{
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData()
    {
        // arraylist added to hold observers
        // created in t he constructor
        observers = new ArrayList<Observer>();
    }

    // when an observer registers, its added to the end of the list
    public void registerObserver(Observer o)
    {
        observers.add(o);
    }

    // when an observer wants to un-register
    // it's taken off the list
    public void removeObserver(Observer o)
    {
        observers.remove(o);
    }

    // tells all observers about the state
    // since they all implement update()
    // it's notified
    public void notifyObservers()
    {
        for(Observer observer : observers)
        {
            observer.update(temperature, humidity, pressure);
        }
    }

    // notify the observers when updated measurements from the weather station
    public void measurementsChanged()
    {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}