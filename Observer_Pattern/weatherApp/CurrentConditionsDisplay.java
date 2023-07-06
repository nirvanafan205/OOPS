// implements the observer interface to get changed from the WeatherData object
// also implments DisplayElement since it requires all display elements to implement this interface
public class CurrentConditionsDisplay implements Observer, DisplayElement
{
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    // constructor is passed and the weatherData object 
    // used to register display as an observer
    public CurrentConditionsDisplay(WeatherData weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    /* 
    // saves the temp and humidty
    // calls display function
    public void update(float temperature, float humidity, float pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
    */

    // updated version
    // gets weather data from the Subject
    public void update()
    {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    // prints most recent temp and humidity
    public void display()
    {
        System.out.println("Current conditions: " + temperature + "F degerees and " + humidity + "% humidty");
    }
}