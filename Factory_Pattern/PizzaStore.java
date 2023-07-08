public abstract class PizzaStore
{
    public Pizza orderPizza(String type)
    {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // method that acts like a factory
     abstract Pizza createPizza(String type);
    /*
        A factor method handles object create
        and encapsulates it in a subclass
        decouples the client code in the superclass from the object creation code in the sub class 
     */
}