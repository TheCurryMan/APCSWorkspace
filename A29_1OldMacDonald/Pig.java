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
class Pig implements Animal
{
    private String myType;

    private String mySound;


    /**
     * @param type of animal
     * @param sound that the animal makes
     */
    public Pig( String type, String sound )
    {
        myType = type;
        mySound = sound;
    }


    /**
     * returns sound of animal
     * 
     * @return mySound sound of animal
     */
    public String getSound()
    {
        return mySound;
    }


    /**
     * @return myType type of animal
     */
    public String getType()
    {
        return myType;
    }
}