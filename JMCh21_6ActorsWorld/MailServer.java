import java.util.*;


/**
 * Queues and dispatches messages. A MailServer is a queue of messages.
 * 
 * @author Jessica jiang
 * @version January 21st
 * @author Period - 4
 * @author Assignment - TODO Assignment Name
 * 
 * @author Sources - TODO list collaborators
 */
public class MailServer extends LinkedList<Message>
{
    private Set<Actor> actors;
 
    public MailServer()
    {
        actors = new TreeSet<Actor>();
    }
 
    public void signUp( Actor actor )
    {
        actors.add( actor );
    }
 
 
    public void dispatch( Message msg )
    {
        if ( msg.getRecipient() == null )
        {
            for ( Actor actor : actors )
            {
                if ( !actor.equals( msg.getSender() ) )
                {
                    actor.receive( msg );
                }
            }
        }
        else
        {
            msg.getRecipient().receive( msg );
        }
    }
 
 
    // for testing purposes only
    protected Set<Actor> getActors()
    {
        return actors;
    }
}
