
/**
 *  Message class containing a single string. Used for testing
 *
 *  @author  george_peck
 *  @version Mar 2, 2015
 *  @author  Period: 1-7
 *  @author  Assignment: JMCh25HW
 *
 *  @author  Sources: TODO
 */
public class Message implements Comparable<Message>
{
    private String msg;
    
    public Message(String msg)
    {
        this.msg = msg;
    }

    @Override
    public int compareTo( Message other )
    {
        return msg.compareTo( other.msg );
    }
    
    public String toString()
    {
        return msg;
    }
}
