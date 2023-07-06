// extend the Beverage class since it's a beverage
public class Espresso extends Beverage
{
    // add description
    public Espresso()
    {
        description = "Espresso";
    }

    // compute the cost
    public double cost()
    {
        return 1.99;
    }
}