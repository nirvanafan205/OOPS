public class ChicagoStyleCheesePizza extends Pizza
{
    public ChicagoStyleCheesePizza()
    {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzerella Cheese");
    }

    // ovverides cut() method since pieces are to be cut in squares
    void cut()
    {
        System.out.println("Cutting the pizza into square slices");
    }
}