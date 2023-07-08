public class PizzaTestDrive
{
    public static void main(String args[])
    {
        PizzaStore nyStore = new NYPizzaStore();
        // PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Pizza PIzza time" + pizza.getName());
    }
}