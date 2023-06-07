public class Weather Data 
{
    // instance variable declarations

    public void measurementsChanged() 
    {
        /*
            First, most recent measurements are grabed by calling the Weather Data's
            getter methods

            it is assigning each value to an appropriately namned variable
        */

        float temp = getTemperature();
        float humidity = getHumidty();
        float pressure = getPressure();

        /*
            each display is then updated by 
            callings its updated method and passing the most recent measurements
        */

        // the following need to be encapsulated
        currentConditionsDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidty, pressure);
        forecastDsiplay.update(temp, humidity, pressure);
        /*
            the problem with coding to concrete implementations,
            there's no way to add or remove other display elements without making 
            changes to the code
        */

       /*
            The Observer Pattern defines a one-to-many relationships between a set of objecs

            When the state of one object changes, all of its 
            dependents are notified.

            most revolve around a class design that includes a Subject and Observer interfaces
       */
    }
}