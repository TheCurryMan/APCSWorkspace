/**
   Represents a grocery store item that consists of an integer id and
   an inventory level

   @author  George Peck
   @version July 18, 2002

   @author Period - 1-7
   @author Assignment - TODO Assignment Name

   @author Sources - Modified by Jason Quesenberry and Nancy Quesenberry
 */
public class Item implements Comparable<Item>
{
    private int myId;
    private int myInv;

    /**
     * Constructor for the Item object
     * 
     * @param id id value
     * @param inv inventory value
     */
    public Item( int id, int inv )
    {
        myId = id;
        myInv = inv;
    }

    /**
     * Gets the id attribute of the Item object
     * 
     * @return The id value
     */
    public int getId()
    {
        return myId;
    }

    /**
     * Gets the inv attribute of the Item object
     * 
     * @return The inv value
     */
    public int getInv()
    {
        return myInv;
    }

    /**
     * Compares two Item objects by their Id (myId) fields
     * 
     * @param otherItem Item object to compare to
     * @return positive int if myId > otherItem.myId
     *          0 if myId == otherItem.myId
     *          negative int if myId < otherItem.myId
     */
    public int compareTo( Item otherItem )
    {
        return myId - otherItem.myId;
    }

    /**
     * Compares the Item to the specified object
     * 
     * @param otherObject Item object to compare to
     * @return true if equal, false otherwise
     */
    public boolean equals( Object otherObject )
    {
        if ( !( otherObject instanceof Item ) )
        {
            return false;
        }

        return this.compareTo( (Item)otherObject ) == 0;
    }

    public String toString()
    {
        return "Id=" + myId + ",Inv=" + myInv;
    }
}

