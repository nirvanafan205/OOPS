
// extend the Beverage class since it's a beverage
public class HouseBlend extends Beverage
{
    // add description
    public HouseBlend()
    {
        description = "House Blend Coffe";
    }

    // compute the cost
    public double cost()
    {
        return .89;
    }
}