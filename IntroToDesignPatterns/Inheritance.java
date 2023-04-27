class Vehicle
{
    protected String brand = "Ford";

    public void honk()
    {
        System.out.println("Tuut, tuut!");
    }
}

class Inheritance extends Vehicle
{
    private String modelName = "Mustang";

    public static void main(String[] args)
    {
       Inheritance myFastCar = new Inheritance();
        myFastCar.honk();
        System.out.println(myFastCar.brand + " " + myFastCar.modelName); 
    }
}

/*
    In Java, we can inherit attributes and methods from one class to another
    
    We groupd the inheritance concept into two categories:

        subclass(child) - the class that inherits from another class

        superclass (parent) - the calss being inherited from

        To inherit from a class, use the extends keyword
*/