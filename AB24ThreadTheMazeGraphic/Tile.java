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

    public Tile( Color color )
    {
        this.color = color;
    }

    public Color getColor()
    {
        return color;
    }

    public void setColor( Color color )
    {
        this.color = color;
    }

    public String getText()
    {
        return "";
    }
}
