import java.util.Random;


/**
 * TODO Write a one-sentence summary of your class here. TODO Follow it with
 * additional details about its purpose, what abstraction it represents, and how
 * to use it.
 *
 * @author jessicajiang
 * @version Oct 23, 2014
 * @author Period: 4
 * @author Assignment: A29_1OldMacDonald
 *
 * @author Sources: TODO
 */
public class Chick implements Animal
{
    private String myType;
    private String mySound1;
    private String mySound2;


    /**
     * @param type of chick
     * @param sound1 the first type of sound chick makes
     * @param sound2 the second type of sound chick makes
     */
    public Chick( String type, String sound1, String sound2 )
    {
        myType = type;
        mySound1 = sound1;
        mySound2 = sound2;
    }


    /**
     * @return myType type of animal string
     */
    public String getType()
    {
        return myType;
    }


    /** 
     * 
     * @return sound that is string of animal
     */
    public String getSound()
    {
        Random random = new Random();
        int rand = random.nextInt();

        if ( rand % 2 == 0 )
        {
            return mySound1;

        }
        else
        {
            return mySound2;
        }
        //return mySound;
    }
}
