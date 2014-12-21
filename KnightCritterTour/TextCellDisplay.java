import info.gridworld.gui.Display;
import info.gridworld.gui.DefaultDisplay;

import java.awt.Component;
import java.awt.Rectangle;
import java.awt.Graphics2D;

/**
 * Display class that caused the TextCell object to be drawn with text. It uses
 * the DefaultDisplay which draws the object's text property with a background
 * color given by the object's color property.<br>
 * Otherwise it would be displayed as an Actor since TextCell inherits from
 * Actor.
 * 
 * This is the minimal object_nameDisplay.java file. It creates a
 * DefaultDisplay object and uses it to do the actual drawing.
 * 
 * @author George Peck
 * @author TextCellDisplay.java
 * @version 7/19/2007
 * 
 * @author Source: Robert Glen Martin
 */
public class TextCellDisplay implements Display
{
    private DefaultDisplay display;

    public TextCellDisplay()
    {
        display = new DefaultDisplay();
    }

    /**
     * Use the DefaultDisplay object display to draw the given object.
     * DefaultDisplay draws a string with a background color. The
     * background color is the value of the color property, or, if
     * there is no such property and the object is an instance of Color.
     * the object itself. The string is the text property, or if there
     * is no such property, the result of calling toString. The string
     * is clipped to 8 characters.
     * 
     * @param obj  object we want to draw
     * @param comp  component on which to draw
     * @param g2  drawing surface
     * @param rect  rectangle in which to draw
     */
    public void draw( Object obj, Component comp, Graphics2D g2, Rectangle rect )
    {
        display.draw( obj, comp, g2, rect );
    }
}
