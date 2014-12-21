
/**
 *  Accepts any string that does NOT contain a given substring. 
 *
 *  @author  jessicajiang
 *  @version Oct 22, 2014
 *  @author  Period: 4
 *  @author  Assignment: A11_3Checker
 *
 *  @author  Sources:
 */
public class NotChecker implements Checker
{
    private Checker check1;
    
    /**
     * @param check1 checker 1
     */
    public NotChecker( Checker check1 )
    {
        this.check1 = check1;
    }
    
    /** 
     * @return boolean of not accepts
     * @param text a
     */
    public boolean accept( String text )
    {
        return !check1.accept( text );
        
    }
}
