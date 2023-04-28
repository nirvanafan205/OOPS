public class Person
{
    // since it's private, it has restricted access
    private String name;

    // Setter
    public void setName(String newName)
    {
        // takes a parameter (neName) and assigns it to the name variable
        // this keyword is used to refer to the current object
        this.name = newName;
    }

    // Getter 
    public String getName()
    {
        // returns the value of the variable name
        return name;
    }
}