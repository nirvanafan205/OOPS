class Animal 
{
    public void animalSound()
    {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal
{
    public void animalSound()
    {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal
{
    public void animalSound()
    {
        System.out.println("The dog says: bow wow");
    }
}

public class Polymorphisim
{
    public static void main(String[] args)
    {
        Animal myAnimal = new Animal(); // created an Animal object
        Animal myPig = new Pig(); // pig object created
        Animal myDog = new Dog(); // Dog object created

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}

/*
    Polymorphisim occures when we have many classes that are related to each other by inheritance

    It uses methods to perform different tasks

    This allows us to perform a single action in different ways
*/