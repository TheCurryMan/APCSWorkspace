/**
 *  Checks for substrings in a given text
 *
 *  @author  jessicajiang
 *  @version Oct 22, 2014
 *  @author  Period: 4
 *  @author  Assignment: A11_3Checker
 *
 *  @author  Sources: 
 */
public class SubstringChecker implements Checker
{
    private String check2;
    
    /**
     * @param check2
     *          checker2
     */
    public SubstringChecker( String check2 )
    {
        this.check2 = check2;
    }
    
    /** 
     * @return boolean text if accepts
     * @param text a string
     */
    public boolean accept( String text )
    {
        return text.indexOf(  check2  ) >= 0;
    }
}
