public class Location
{
    private int row, col;

    // Constructor
    public Location( int r, int c )
    {
        row = r;
        col = c;
    }

    // Returns this location's row
    public int getRow()
    {
        return row;
    }

    // Returns this location's column
    public int getCol()
    {
        return col;
    }
}
