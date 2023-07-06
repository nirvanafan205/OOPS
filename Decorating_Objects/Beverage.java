// abstract class with two methods
public abstract class Beverage
{
    String description = "Unknown Beverage";

    public String getDescription()
    {
        return description;
    }

    public abstract double cost();
}