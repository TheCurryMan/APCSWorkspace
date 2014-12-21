import java.awt.Color;
import info.gridworld.actor.Actor;

/**
 * TextCell is the "Actor pretender" class. It inherits from Actor.
 * Without the minimal TextCellDisplay class, TextCells objects would
 * display as "?".
 *
 * TextCells display as black text (from toString) on a white
 * background. All the normal text "options" apply.
 *
 * @author George Peck
 * @author TextCell.java
 * @version Nov 15, 2007
 */
public class TextCell extends Actor
{
    private static final Color DEFAULT_COLOR = Color.WHITE;
    String text;

    /**
     * Constructs a white TextCell.
     */
    public TextCell()
    {
        this( "", DEFAULT_COLOR );
    }

    /**
     * Constructs a white TextCell.
     * 
     * @param str
     *            text to display in cell
     */
    public TextCell( String str )
    {
        this( str, DEFAULT_COLOR );
    }

    /**
     * Constructs a TextCell of a given color.
     * 
     * @param str
     *            text to display
     * @param cellColor
     *            the background color of this cell
     */
    public TextCell( String str, Color cellColor )
    {
        setColor( cellColor );
        text = str;
    }

    /**
     * Constructs a white TextCell.
     * 
     * @param numVal
     *            number to display as text in cell
     */
    public TextCell( int numVal )
    {
        this( "" + numVal, DEFAULT_COLOR );
    }

    /**
     * Constructs a TextCell of a given color containing a number.
     * 
     * @param number
     *            to display as text in cell
     * @param cellColor
     *            the background color of this cell
     */
    public TextCell( int numVal, Color cellColor )
    {
        this( "" + numVal, cellColor );
    }

    /**
     * Overrides the <code>act</code> method in the <code>Actor</code>
     * class to do nothing.
     */
    public void act()
    {
    }

    @Override
    public String toString()
    {
        if ( text.length() == 1 )
            return "  " + text + " ";
        else if ( text.length() == 2 )
            return " " + text + " ";
        else
            return text;
    }
}
