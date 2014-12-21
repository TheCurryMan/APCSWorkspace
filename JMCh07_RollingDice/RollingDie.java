// Implements a rolling die object.

import java.awt.*;
import javax.swing.*;


/**
 *  Implements a rolling die object.
 *
 *  @author  TODO your Name
 *  @version TODO date
 *  @author  Period: TODO your period
 *  @author  Assignment: JMCh07_RollingDice
 *
 *  @author  Sources: TODO collaborators
 */
public class RollingDie extends Die
{
    private static final double SLOW_DOWN = 0.97;
    private static final double SPEED_FACTOR = 0.04;
    private static final double SPEED_LIMIT = 2.0;

    private static int TABLE_LEFT;
    private static int TABLE_RIGHT;
    private static int TABLE_TOP;
    private static int TABLE_BOTTOM;
    
    private final int DIE_SIZE = 24;
    
    private int xCenter, yCenter;
    private double xSpeed, ySpeed;

    /**
     * sets the "table" boundaries.
     * 
     * @param left   left boundary of table
     * @param right  right boundary of table
     * @param top    top boundary of table
     * @param bottom bottom boundary of table
     */
    public static void setBounds( int left, int right, int top, int bottom )
    {
        TABLE_LEFT = left;
        TABLE_RIGHT = right;
        TABLE_TOP = top;
        TABLE_BOTTOM = bottom;
    }

    /**
     * Constructor: sets this die "off the table".
     */
    public RollingDie()
    {
        xCenter = -1;
        yCenter = -1;
    }

    /**
     *  Starts this die rolling
     * @see Die#roll()
     */
    public void roll()
    {
        super.roll();
        int width = TABLE_RIGHT - TABLE_LEFT;
        int height = TABLE_BOTTOM - TABLE_TOP;
        xCenter = TABLE_LEFT;
        yCenter = TABLE_TOP + height / 2;
        xSpeed = width * ( Math.random() + 1 ) * SPEED_FACTOR;
        ySpeed = height * ( Math.random() - .5 ) * 2. * SPEED_FACTOR;
    }

    /**
     * Returns true if this die is rolling; otherwise returns false.
     * 
     * @return true if this die is rolling; otherwise false
     */
    public boolean isRolling()
    {
        return xSpeed > SPEED_LIMIT || xSpeed < -SPEED_LIMIT
            || ySpeed > SPEED_LIMIT || ySpeed < -SPEED_LIMIT;
    }

    /**
     * Keeps moving this die as long as it overlaps with other.
     * @param other RollingDie to check for overlap with this RollingDie
     */
    public void avoidCollision( RollingDie other )
    {
        if ( other == this )
            return;

        while ( Math.abs( xCenter - other.xCenter ) < DIE_SIZE
            && Math.abs( yCenter - other.yCenter ) < DIE_SIZE )
            move();
    }

    /**
     * Moves this die on the "table," bouncing off the edges when necessary.
     */
    private void move()
    {
        xCenter += xSpeed;
        yCenter += ySpeed;

        int radius = DIE_SIZE / 2;

        if ( xCenter < TABLE_LEFT + radius )
        {
            xCenter = TABLE_LEFT + radius;
            xSpeed = -xSpeed;
        }

        if ( xCenter > TABLE_RIGHT - radius )
        {
            xCenter = TABLE_RIGHT - radius;
            xSpeed = -xSpeed;
        }

        if ( yCenter < TABLE_TOP + radius )
        {
            yCenter = TABLE_TOP + radius;
            ySpeed = -ySpeed;
        }

        if ( yCenter > TABLE_BOTTOM - radius )
        {
            yCenter = TABLE_BOTTOM - radius;
            ySpeed = -ySpeed;
        }
    }

    /**
     * Draws this die, rolling or stopped; also moves this die, when rolling.
     * 
     * @param g Graphics context for this die
     */
    public void draw( Graphics g )
    {
        if ( xCenter < 0 || yCenter < 0 )
            return;
        else if ( isRolling() )
        {
            move();
            drawRolling( g );
            xSpeed *= SLOW_DOWN;
            ySpeed *= SLOW_DOWN;
        }
        else
        {
            drawStopped( g );
        }
    }

    /*
     * Draws this die when rolling with a random number of dots.
     * @param g Graphics context for this die
     */
    private void drawRolling( Graphics g )
    {
        int x = xCenter - DIE_SIZE / 2 + (int)( 3 * Math.random() ) - 1;
        int y = yCenter - DIE_SIZE / 2 + (int)( 3 * Math.random() ) - 1;
        g.setColor( Color.RED );

        if ( x % 2 != 0 )
            g.fillRoundRect( x, y, DIE_SIZE, DIE_SIZE, DIE_SIZE / 4, DIE_SIZE / 4 );
        else
            g.fillOval( x - 2, y - 2, DIE_SIZE + 4, DIE_SIZE + 4 );

        Die die = new Die();
        die.roll();
        drawDots( g, x, y, die.getNumDots() );
    }

    /*
     * Draws this die when stopped.
     * @param g Graphics context for this die
     */
    private void drawStopped( Graphics g )
    {
        int x = xCenter - DIE_SIZE / 2;
        int y = yCenter - DIE_SIZE / 2;
        g.setColor( Color.RED );
        g.fillRoundRect( x, y, DIE_SIZE, DIE_SIZE, DIE_SIZE / 4, DIE_SIZE / 4 );
        drawDots( g, x, y, getNumDots() );
    }

    /*
     * Draws a given number of dots on this die.
     * 
     * @param g Graphics context for this die
     * @param x x coordinate of the upper left corner of this die
     * @param y y coordinate of the upper left corner of this die
     * @param numDots number of dots to be drawn on this die
     */
    private void drawDots( Graphics g, int x, int y, int numDots )
    {
        g.setColor( Color.WHITE );

        int dotSize = DIE_SIZE / 4;
        int step = DIE_SIZE / 8;
        int x1 = x + step - 1;
        int x2 = x + 3 * step;
        int x3 = x + 5 * step + 1;
        int y1 = y + step - 1;
        int y2 = y + 3 * step;
        int y3 = y + 5 * step + 1;

        switch ( numDots )
        {
            case 1:
                g.fillOval( x2, y2, dotSize, dotSize );
                break;

            // TODO complete the switch statement

        }
    }
}
