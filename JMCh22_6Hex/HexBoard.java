/**
   TODO Write a one-sentence summary of your class here.
   TODO Follow it with additional details about its purpose, what abstraction
   it represents, and how to use it.

   @author  Jessica Jiang
   @version January 23th, 2015

   @author  Period - 4
   @author  Assignment - JM Ch22.6 - Hex

   @author  Sources - TODO list collaborators
 */
public class HexBoard extends CharMatrix 
{ 
    public HexBoard( int rows, int cols ) 
    { 
        super( rows, cols ); 
    } 
  
  
    public boolean isBlack( int r, int c ) 
    { 
        if ( charAt( r, c ) == 'b' && isInBounds( r, c ) ) 
        { 
            return true; 
        } 
        return false; 
    } 
  
  
    public void setBlack( int r, int c ) 
    { 
        setCharAt( r, c, 'b' ); 
    } 
  
  
    public boolean isWhite( int r, int c ) 
    { 
        if ( charAt( r, c ) == 'w' && isInBounds( r, c ) ) 
        { 
            return true; 
        } 
        return false; 
    } 
  
  
    public void setWhite( int r, int c ) 
    { 
        setCharAt( r, c, 'w' ); 
    } 
  
  
    public boolean isGray( int r, int c ) 
    { 
        if ( charAt( r, c ) == 'x' && isInBounds( r, c ) ) 
        { 
            return true; 
        } 
        return false; 
    } 
  
  
    public void setGray( int r, int c ) 
    { 
        setCharAt( r, c, 'x' ); 
    } 
  
  
    /** 
     * Returns true if there is a contiguous chain of black stones that starts 
     * in col 0 and ends in the last column of the board; otherwise returns 
     * false. 
     */
    public boolean blackHasWon() 
    { 
        int cnt = 0; 
        for ( int i = 0; i < numRows(); i++ ) 
        { 
            areaFill( i, 0 ); 
        } 
        for ( int i = 0; i < numRows(); i++ ) 
        { 
            if ( isGray( i, numCols() - 1 ) ) 
            { 
                cnt++; 
            } 
        } 
        for ( int i = 0; i < numRows(); i++ ) 
        { 
            for ( int k = 0; k < numCols(); k++ ) 
            { 
                if ( isGray( i, k ) ) 
                { 
                    setBlack( i, k ); 
                } 
            } 
        } 
        return cnt > 0; 
    } 
  
  
    /** 
     * Fills the contiguous area that contains r,c with gray color. Does nothing 
     * if r, c is out of bounds or is not black. 
     */
    public void areaFill( int r, int c ) 
    { 
        if ( isInBounds( r, c ) && isBlack( r, c ) ) 
        { 
            setGray( r, c ); 
            areaFill( r - 1, c - 1 ); 
            areaFill( r - 1, c ); 
            areaFill( r, c - 1 ); 
            areaFill( r, c + 1 ); 
            areaFill( r + 1, c ); 
            areaFill( r + 1, c + 1 ); 
        } 
    } 
  
  
    public String toString() 
    { 
        String word = ""; 
  
        for ( int r = 0; r < numRows(); r++ ) 
        { 
            for ( int c = 0; c < numCols(); c++ ) 
            { 
                if ( isBlack( r, c ) ) 
                    word += 'B'; 
                else if ( isWhite( r, c ) ) 
                    word += 'W'; 
                else if ( isGray( r, c ) ) 
                    word += 'X'; 
                else
                    word += '.'; 
            } 
            word += '\n'; 
        } 
        return word; 
    } 
  
 //****************************************************//
    private boolean isInBounds( int row, int col ) 
    { 
        if ( row >= 0 && row < numRows() && col >= 0 && col < numCols() ) 
        { 
            return true; 
        } 
        return false; 
    } 
}
