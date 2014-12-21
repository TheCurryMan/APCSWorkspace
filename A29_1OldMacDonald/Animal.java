/**
 * Old MacDonald had a farm and several types of animals. Every animal shared
 * certain characteristics: they had a type (such as cow, chick or pig) and each
 * made a sound (moo, cluck or oink).
 * 
 * The animal interface defines those things required to be an animal on the
 * farm.
 * 
 * @author George Peck
 * @version Nov 5, 2007
 * 
 *          Period - 1-7 Assignment - A29.1 - Old MacDonald
 * 
 *          Sources - Frank
 */
public interface Animal
{
    /**
     * Returns the sound of this Animal
     * 
     * @return A string representation of the sound this Animal makes
     */
    public String getSound();


    /**
     * Returns the type of this Animal
     * 
     * @return A string representation of this Animal's type
     */
    public String getType();
}
