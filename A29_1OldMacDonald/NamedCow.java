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
class NamedCow extends Cow
{
    private String myName;
    /**
     * creates a new cow that is named 
     * 
     * @param type of animal
     * @param name of animal
     * @param sound that the animal makes
     */
    public NamedCow( String type, String name, String sound )
    {
        super( type, sound );

        myName = name;
    }
    
    /**
     * returns name of cow
     * @return myName name of cow
     */
    public String getName()
    {
        return myName;
    }
    
    /** 
     * returns type of cow
     * 
     * @return myType type of cow
     */
    /**
    public String getType()
    {
        return myType;
    }
    */
    
    /** 
     * returns sound of cow
     * 
     * @return mySound sound of cow
     */
    /**
    public String getSound()
    {
        return mySound;
    }
    
    */
}
