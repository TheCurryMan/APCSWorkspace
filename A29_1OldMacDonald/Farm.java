import java.util.*;
import java.util.Random;


/**
 * TODO Write a one-sentence summary of your class here. TODO Follow it with
 * additional details about its purpose, what abstraction it represents, and how
 * to use it.
 * 
 * @author Jessica Jiang
 * @version October
 * Period - TODO Your Period Assignment - A29.1 Old MacDonald
 * Sources - TODO list collaborators
 */
public class Farm
{
    private Animal[] a = new Animal[3];


    /**
     * constructs an object of the farm class
     */
    public Farm()
    {
        a[0] = new NamedCow( "cow", "Elsie", "moo" );
        a[1] = new Chick( "chick", "cheep","cluck");
        a[2] = new Pig( "pig", "oink" );
    }


    /**
     * creates the string for animalSounds
     */
    public void animalSounds()
    {
        for ( int i = 0; i < a.length; i++ )
        {
            System.out.println( a[i].getType() + " goes " + a[i].getSound() );
        }
        System.out.println( "The cow is known as "
            + ( (NamedCow)a[0] ).getName() );
    }
}
