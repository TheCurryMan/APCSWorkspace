/**
 *  A checker is an object that examines strings and accepts those strings
 *  that meet a particular criterion.
 *
 *  @author  George Peck
 *  @version Oct 13, 2014
 *  @author  Period: 1-7
 *  @author  Assignment: A11_3Checker
 *
 *  @author  Sources: none
 */
public interface Checker
{
    /**
     * @param text  a string to consider for acceptance
     * @return true if this Checker accepts text; false otherwise
     */
    boolean accept( String text );
}
