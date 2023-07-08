import java.util.*;
// start with abstract pizza class
// all concrete pizzas will derive from this
public abstract class Pizza {
    // each pizza has a name, type of dough, a type of sauce, and a set of toppings
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<String>();

    void prepare() {
        // preperation follows a number of steps in a particular sequence
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings...");
        for (String topping : toppings) {
            System.out.println(" " + topping);
        }
    }

    void bake() {
        System.out.println("Bake for 25 minutes sat 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slice");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}