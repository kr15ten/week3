package za.ac.cput.kristen.week3Ex1;

/**
 * Created by student on 2015/02/17.
 */
public class Dog
{
    private String name, breed;
    private int age;

    public Dog(String nm, String brd, int age)
    {
        name = nm;
        breed=brd;
        this.age = age;
    }


    public String getName()
    {
        return name;
    }

    public String getBreed()
    {
        return breed;
    }

    public String toString()
    {
        return String.format("%s\n%d year old %s\n", name, age, breed);
    }
}
