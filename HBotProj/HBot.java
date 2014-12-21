import kareltherobot.*;

/**
 *  Draws an 'H' on a blank 10 x 10 world by placing beepers.
 *
 *  @author  TODO Your Name
 *  @version TODO Assignment Date
 *  @author  Period: TODO Your Period
 *  @author  Assignment: HBotProj
 *
 *  @author  Sources: TODO list collaborators
 */
public class HBot extends UrRobot
{
    public HBot( int street, int avenue, Direction direction, int beepers )
    {
       super( street, avenue, direction, beepers );
    }

    public void drawH()
    {
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        turnLeft();
        turnLeft();
        move();
        turnLeft();
        move();
        putBeeper();
        move();
        putBeeper();
        turnLeft();
        move();
        putBeeper();
        turnLeft();
        turnLeft();
        move();
        move();
        putBeeper();
        
    }
    
}
