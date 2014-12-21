import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

import java.util.ArrayList;
import java.awt.Color;

/**
 * A <code>KnightCritter</code> is an actor that moves through its world in the
 * same fashion as a knight moves on a chess board. <br />
 * 
 * @author George Peck
 * @version 11/02/2014
 * @author Period: 1-7
 * @author Assignment: KnightCritterTour
 * 
 * @author Sources: na
 */
public class KnightCritter extends Critter
{
    public final int MAX_MOVES = 8;

    // keep track of the number of times this knight has moved
    private int moveNum = 1;

    /*
     * The array horizontal contains the horizontal movement necessary
     * to move to a new location. These values will ultimately be added
     * to a column location. Likewise the array vertical will be used
     * to make vertical moves, which will adjust the row location.
     */
    private int[] horizMoveOffset = {  1,  2, 2, 1, -1, -2, -2, -1 };
    private int[] vertMoveOffset  = { -2, -1, 1, 2,  2,  1, -1, -2 };

    /**
     * Constructs a KnightCritter with a random bright (>127) color
     */
    public KnightCritter()
    {
        int randomRed = (int)( Math.random() * 128 ) + 128;
        int randomGreen = (int)( Math.random() * 128 ) + 128;
        int randomBlue = (int)( Math.random() * 128 ) + 128;
        setColor( new Color( randomRed, randomGreen, randomBlue ) );
    }

    /**
     * Gets the actors for processing. Returns an empty list since
     * this Actor does no processing of other Actors in the grid<br />
     * Postcondition: The state of all actors is unchanged.
     * 
     * @return an empty list.
     */
    public ArrayList<Actor> getActors()
    {
        return new ArrayList<Actor>();
    }

    /**
     * Processes the elements of <code>actors</code>. No processing is
     * performed. <br />
     * Postcondition: (1) The state of all actors in the grid other
     * than this critter and the elements of <code>actors</code> is
     * unchanged. (2) The location of this critter is unchanged.
     * 
     * @param actors  the actors to be processed
     */
    public void processActors( ArrayList<Actor> actors )
    {
        // do nothing
    }

    /**
     * Assembles a list of valid moves. Checks each possible move
     * location and adds it to the list if it is valid (in the grid)
     * and empty.
     * 
     * The possible moves are categorized as follows:
     * 
     * move 1: +1 to the right, -2 up, a negative move to go up in the grid
     * move 2: +2 to the right, -1 up
     * move 3: +2 to the right, +1 down
     * move 4: +1 to the right, +2 down
     * move 5: -1 to the left, +2 down
     * move 6: -2 to the left, +1 down
     * move 7: -2 to the left, -1 up
     * move 8: -1 to the left, -2 up
     * 
     * @param loc  location of base for possible moves
     * 
     * @return ArrayList of locations corresponding to valid
     *         "knight-like" moves from loc
     */
    public ArrayList<Location> getPossibleMoves( Location loc )
    {
        ArrayList<Location> list = new ArrayList<Location>( MAX_MOVES );

        for ( int move = 0; move < MAX_MOVES; move++ )
        {
          int newRow = loc.getRow() + vertMoveOffset[move];
          int newCol = loc.getCol() + horizMoveOffset[move];
          
          Location newLoc = new Location(newRow, newCol);
          if(getGrid().isValid( newLoc ) && getGrid().get( newLoc ) == null)
            list.add(new Location(newRow, newCol));
        }

        return list;
    }

    /**
     * Gets a list of possible locations for the next move. These
     * locations must be valid in the grid of this critter. Implemented
     * to return the empty neighboring locations. <br />
     * Postcondition: The state of all actors is unchanged.
     * 
     * @return a list of possible locations for the next move
     * 
     * 
     */
    public ArrayList<Location> getMoveLocations()
    {
        return getPossibleMoves( getLocation() );
    }

    /**
     * Moves this KnightCritter to the given location <code>loc</code>,
     * or removes this critter from its grid if <code>loc</code> is
     * <code>null</code>.
     * 
     * A TextCell actor is constructed with the current move number
     * and added to the old location thus marking the grid locations as
     * they are visited. The color of the TextCell is chosen as
     * follows: green for first cell, red for the last cell, and the
     * color as this KnightCritter for all other cells<br />
     * 
     * Postcondition: (1) <code>getLocation() == loc</code>.
     * (2) The state of all actors other than those at the old and
     * new locations is unchanged.
     * 
     * @param loc  the location to move to
     */
    public void makeMove( Location loc )
    {
        if ( loc == null )
        {
            removeSelfFromGrid();
        }
        else
        {
            Location oldLoc = getLocation();

            moveTo( loc );

            TextCell moveNumCell = new TextCell( moveNum, getColor() );
            if ( loc != oldLoc )
            {
                if ( moveNum == 1 )
                    moveNumCell.setColor(Color.GREEN);
            }
            else
            {
                moveNumCell.setColor(Color.RED);
            }

            moveNumCell.putSelfInGrid( getGrid(), oldLoc );

            moveNum++;
        }
    }

    /**
     * Returns the current move number
     * 
     * @return the current move number
     */
    public int getMoveNum()
    {
        return moveNum;
    }
}
