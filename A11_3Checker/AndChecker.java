/**
 * This class checks for multiple acceptance criteria by combining other checker
 * objects.
 *
 * @author jjiang686
 * @version Oct 22, 2014
 * @author Period: 4
 * @author Assignment: A11_3Checker
 *
 * @author Sources: TODO
 */
public class AndChecker implements Checker
{
    private Checker check1;

    private Checker check2;


    /**
     * @param check1
     *          checker 1
     * @param check2
     *          checker 2
     */
    public AndChecker( Checker check1, Checker check2 )
    {
        this.check1 = check1;
        this.check2 = check2;
    }


    /** 
     * @param text a
     * @return true if text
     */
    public boolean accept( String text )
    {
        return check1.accept( text ) && check2.accept( text );
    }
}
