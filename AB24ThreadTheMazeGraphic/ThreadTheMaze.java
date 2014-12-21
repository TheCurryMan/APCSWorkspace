import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.awt.Color;

import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.UnboundedGrid;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

/**
 * Demonstrates a recursive maze traversal algorithm using a
 * <code>GridWorld</code> based <code>World</code>. The maze is
 * defined as a 2-D grid of asterisks (marking walls) and blanks
 * (marking potential paths) which is translated into a black (walls)
 * and white (paths) <code>Tile</code> objects in the <code>World</code>.
 * 
 * @author George Peck
 * @version 11/20/08
 * 
 * @author Sources: Cary Matsuoka
 */
public class ThreadTheMaze extends World<Tile>
{
    private static final char WALL = '*';
    private static final char PATH = ' ';
    private static final Color WALL_COLOR = Color.BLACK;
    private static final Color PATH_COLOR = Color.WHITE;
    private static final Color PATH_VISITED_COLOR = Color.RED;

    /**
     * Constructs and displays this <code>World</code> using
     * data from "MazeData.txt".
     */
    public ThreadTheMaze()
    {
        this( "MazeData.txt" );
    }

    /**
     * Constructs and displays this <code>World</code> using data
     * from the indicated file.
     * @param fileName name of file containing data used to build this maze
     */
    public ThreadTheMaze( String fileName )
    {
        getData( fileName );
        this.show();
        setMessage( "Click on the starting location in the maze" );
    }

    /**
     * Overrides <code>info.gridworld.world.World&lt;Tile&lt;.locationClicked</code>
     * This method is called when the user clicks on a location in the
     * <code>WorldFrame</code>. Invokes the recursive maze trace procedure on
     * the clicked location.
     * 
     * @param loc the grid location that the user selected
     * @return true - the world consumes the click
     */
    public boolean locationClicked( Location loc )
    {
        Grid<Tile> gridMaze = getGrid();

        this.setMessage( "Tile clicked at " + loc );
        traceMaze( gridMaze, loc.getRow(), loc.getCol() );

        return true;
    }

    /**
     * Constructs a grid and loads the data from the indicated text file
     * into the this world. The data is structured with the first two values
     * indicating the dimensions of the grid (r x c). The dimension values
     * are followed by r rows of c column characters where an '*' indicates
     * a wall (black tile) portion of the grid and a ' ' indicates a potential
     * path (white tile). The following data would produce a "+" shaped maze.
     * <pre>
     *      5 5
     *      ** **
     *      ** **
     *   
     *      ** **
     *      ** **
     * </pre>
     * 
     * @param fileName  name of file containing maze data
     */
    private void getData( String fileName )
    {
        try
        {
            Scanner inFile = new Scanner( new File( fileName ) );

            int rows = inFile.nextInt();
            int cols = inFile.nextInt();
            inFile.nextLine();

            setGrid( new BoundedGrid<Tile>( rows, cols ) );

            for ( int r = 0; r < rows; r++ )
            {
                String line = inFile.nextLine();
                // System.out.println(line);

                for ( int c = 0; c < cols; c++ )
                {
                    char ch = line.charAt( c );
                    if ( ch == WALL )
                    {
                        this.add( new Location( r, c ), new Tile( WALL_COLOR ) );
                    }
                    else
                    // if (ch == PATH)
                    {
                        this.add( new Location( r, c ), new Tile( PATH_COLOR ) );
                    }
                }
            }
        }
        catch ( IOException i )
        {
            System.out.println( "Error: " + i.getMessage() );
        }
    }

    /**
     * Will attempt to find a path out of the maze. A path will be marked
     * with a <code>PATH_VISITED_COLOR</code> colored block. The method
     * makes a copy of the grid each time so that only the path out will
     * be marked, otherwise extra markers will appear in the answer. The
     * method is recursive.
     *
     * @param maze grid containing maze
     * @param row start row
     * @param col start column
     */
    private void traceMaze( Grid<Tile> maze, int row, int col )
    {
        Grid<Tile> mazeCopy = new BoundedGrid<Tile>( maze.getNumRows(),
            maze.getNumCols() );

        for ( Location loc : maze.getOccupiedLocations() )
        {
            mazeCopy.put( loc, new Tile( maze.get( loc ).getColor() ) );
        }

        Location loc = new Location( row, col );
        if ( mazeCopy.isValid( loc ) )
        {
            if ( mazeCopy.get( loc ) != null
                && mazeCopy.get( loc ).getColor().equals( PATH_COLOR ) )
            {
                // grCopy.remove(loc);
                mazeCopy.put( new Location( row, col ),
                    new Tile( PATH_VISITED_COLOR ) );
                if ( row == 0 || row == mazeCopy.getNumRows() - 1 || col == 0
                    || col == mazeCopy.getNumCols() - 1 )
                {
                    new World<Tile>( mazeCopy ).show();
                }
                else
                {
                    traceMaze( mazeCopy, row - 1, col );
                    traceMaze( mazeCopy, row, col + 1 );
                    traceMaze( mazeCopy, row + 1, col );
                    traceMaze( mazeCopy, row, col - 1 );
                }
            }
        }
    }

    /**
     * Runner for a <code>ThreadTheMaze</code> world.
     * @param args command-line parameters (not used)
     */
    public static void main( String[] args )
    {
        new ThreadTheMaze();
    }
}
