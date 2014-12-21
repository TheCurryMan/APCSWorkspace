import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;

/**
 * Demonstrates a complete KnightsTour of an 8x8 "chess board"
 * 
 * @author George Peck
 * @author KnightsTour.java
 * @version Nov 18, 2007
 */
public class KnightsTour
{
    public static void main( String[] args )
    {
        ActorWorld chessBoard = new ActorWorld( new BoundedGrid<Actor>( 8, 8 ) );

        chessBoard.setMessage( "Knight's Tour" );
        chessBoard.add( new KnightTourCritter() );
        chessBoard.show();
    }
}