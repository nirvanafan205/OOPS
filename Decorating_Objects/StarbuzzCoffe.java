public class StarbuzzCoffe {
    public static void main(String args[]) {
        // ordering an espresso with no condiments and
        // prints its cost and description
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // DarkRoast
        Beverage beverage2 = new DarkRoast();

        // wrapping
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        // HouseBlend
        Beverage beverage3 = new HouseBlend();

        // wrapping
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}