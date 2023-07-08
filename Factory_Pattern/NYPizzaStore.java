// since NYPizzaStore extends PizzaStore
// it inherits orderPizza() method
public class NYPizzaStore extends PizzaStore {
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            // concrete classes
            return new NYStyleCheesePizza();
        }

        /* 
        else if (item.equals("veggie")) {
            // concrete classes
            return new NYStyleVeggiePizza();
        }

        else if (item.equals("clam")) {
            // concrete classes
            return new NYStyleClamPizza();
        }

        else if (item.equals("pepperoni")) {
            // concrete classes
            return new NYStylePepperoniPizza();
        }
        */

        else {
            return null;
        }
    }
}