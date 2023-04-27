public class Encapsulation
{
    public static void main(String[] args)
    {
        Person myObj = new Person();
        myObj.setName("John"); // Sets the value of the name variable to "John"

        System.out.println(myObj.getName());
    }
}
/*
    Encapsulation:
                    Making sensitive data hidden from users

        Must do's to acheive this:

                    declar class variables/attributes as private

                    provide public getters/setters methods to access
                    and updated the value of a private variable

        Get method returns the variable value
        Set methods update the value of a private variable


        We use Encapsulation for 

            Better control of class attributes and methods
            
*/