// is interchangeable with a Beverage so we extend the Beverage class
public abstract class CondimentDecorator extends Beverage
{
    // the Beverage each Decorator will be wrapping
    // supertype is refered to the Beverage so the Decorator can wrap any beverage
    Beverage beverage;
    
    // makes condiment decorators all reimplement the method
    public abstract String getDescription();
}