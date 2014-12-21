import java.awt.Color;

/**
 *  Represents a tile of the specified color (colored block).
 *
 *  @author  George Peck
 *  @version Nov 25, 2007
 *
 *  @author Sources: Cay Horstmann
 */
public class Tile
{
    private Color color;

    /**
     * @param color of tile
     * returns the color
     */
    public Tile( Color color )
    {
        this.color = color;
    }

    /**
     * gets the color of tile
     * @return nothing lol
     */
    public Color getColor()
    {
        return color;
    }

    /**
     * sets the color of the tile
     * @param color of the tile
     */
    public void setColor( Color color )
    {
        this.color = color;
    }

    /**
     * gets the text of the tile
     * @return empty string lmao
     */
    public String getText()
    {
        return "";
    }
}
