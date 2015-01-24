/**
   TODO Write a one-sentence summary of your class here.
   TODO Follow it with additional details about its purpose, what abstraction
   it represents, and how to use it.

   @author  TODO Your Name
   @version TODO Date

   @author  Period - TODO Your Period
   @author  Assignment - JM Ch22.6 - Hex

   @author  Sources - TODO list collaborators
 */
public class HexBoard extends CharMatrix
{
    public HexBoard(int rows, int cols)
    {
        super(rows, cols);
        // TODO complete method
    }

    public boolean isBlack(int r, int c)
    {
        // TODO complete method
        return false; // fix this
    }

    public boolean isWhite(int r, int c)
    {
        // TODO complete method
        return false; // fix this
    }

    public  boolean isGray(int r, int c)
    {
        // TODO complete method
        return false; // fix this
    }

    public void setBlack(int r, int c)
    {
        setCharAt(r, c, 'b');
    }

    public void setWhite(int r, int c)
    {
        setCharAt(r, c, 'w');
    }

    public void setGray(int r, int c)
    {
        setCharAt(r, c, 'x');
    }

    /**
     *  Returns true if there is a contiguous chain of black stones
     *  that starts in col 0 and ends in the last column of the board;
     *  otherwise returns false.
     */
    public boolean blackHasWon()
    {
        // TODO complete method
        return false; //fix this
    }

    /**
     *  Fills the contiguous area that contains r,c with gray color.
     *  Does nothing if r, c is out of bounds or is not black.
     */
    public void areaFill(int r, int c)
    {
        // TODO complete method
    }

    public String toString()
    {
        String s = "";

        for (int r = 0; r < numRows(); r++)
        {
            for (int c = 0; c < numCols(); c++)
            {
                if (isBlack(r, c))
                    s += 'B';      
                else if (isWhite(r, c))
                    s += 'W';
                else if (isGray(r, c))
                    s += 'X';
                else
                    s += '.';
            }
            s += '\n';
        }
        return s;
    }

    //****************************************************************

    private boolean isInBounds(int row, int col)
    {
        // TODO complete method
        return false; //fix this
    }
}
