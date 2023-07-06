// extend the Beverage class since it's a beverage
public class Decaf extends Beverage
{
    // add description
    public Decaf()
    {
        description = "Decaf";
    }

    // compute the cost
    public double cost()
    {
        return 1.05;
    }
}