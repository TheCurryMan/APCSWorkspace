import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 * The Mainscene class dealt with the 
 *
 * @author jessicajiang
 * @version May 11, 2015
 * @author Period: TODO
 * @author Assignment: 1APCSfinalproject
 *
 * @author Sources: TODO
 */
public class MainScene extends JPanel
{
    private static final Color BG_COLOR = new Color(0x6B5A62);
    //background color of playing screen
    private static final String FONT_NAME = "Questrial";
    //font of the numbers of the tiles
    private static final int TILE_SIZE = 64;
    private static final int TILES_MARGIN = 16;
    private GameGrid grid;
   
    protected boolean myWin = false;
    protected boolean myLose = false;
    protected int myScore = 0;

    public MainScene()
    {
        setFocusable( true ); //focusable flag indicates whether a component 
        //can gain the focus if it is requested to do so
        
        grid = new GameGrid(this);
        
        //deals with all the keystroke registering
        //keyadapter allows the keys pressed to work
        addKeyListener( new KeyAdapter()
        {
            //
            public void keyPressed( KeyEvent e )
            {
                if ( e.getKeyCode() == KeyEvent.VK_ESCAPE )
                {
                    resetGame();
                }
                
                if ( !grid.canMove() )
                {
                    myLose = true;
                }

                if ( !myWin && !myLose )
                {
                    switch ( e.getKeyCode() )
                    {
                        case KeyEvent.VK_LEFT:
                            grid.left();
                            break;
                        case KeyEvent.VK_RIGHT:
                            grid.right();
                            break;
                        case KeyEvent.VK_DOWN:
                            grid.down();
                            break;
                        case KeyEvent.VK_UP:
                            grid.up();
                            break;
                    }
                }

                if ( !myWin && !grid.canMove() )
                {
                    myLose = true;
                }

                repaint();
            }
        } );
        

        myScore = 0;
        myWin = false;
        myLose = false;
    }


    public void resetGame()
    {
        myScore = 0;
        myWin = false;
        myLose = false;
        grid.resetGrid();
    }

    public void addScore(int score)
    {
        myScore += score;
    }
    
    public void paint( Graphics g )
    {
        super.paint( g );
        g.setColor( BG_COLOR );
        g.fillRect( 0, 0, this.getSize().width, this.getSize().height );
        for ( int y = 0; y < 4; y++ )
        {
            for ( int x = 0; x < 4; x++ )
            {
                drawTile( g, grid.getGrid()[x + y * 4], x, y );
            }
        }
    }
    
    private void drawTile( Graphics g2, Tile tile, int x, int y )
    {
        Graphics2D g = ( (Graphics2D)g2 );
        g.setRenderingHint( RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON );
        g.setRenderingHint( RenderingHints.KEY_STROKE_CONTROL,
            RenderingHints.VALUE_STROKE_NORMALIZE );
        int value = tile.value;
        int xOffset = offsetCoors( x );
        int yOffset = offsetCoors( y );
        g.setColor( tile.getBackground() );
        g.fillRoundRect( xOffset, yOffset, TILE_SIZE, TILE_SIZE, 14, 14 );
        g.setColor( tile.getForeground() );
        final int size = value < 100 ? 36 : value < 1000 ? 32 : 24;
        final Font font = new Font( FONT_NAME, Font.BOLD, size );
        g.setFont( font );

        String s = String.valueOf( value );
        final FontMetrics fm = getFontMetrics( font );

        final int w = fm.stringWidth( s );
        final int h = -(int)fm.getLineMetrics( s, g ).getBaselineOffsets()[2];

        if ( value != 0 )
            g.drawString( s, xOffset + ( TILE_SIZE - w ) / 2, yOffset
                + TILE_SIZE - ( TILE_SIZE - h ) / 2 - 2 );

        //=================================================================
        // Winning/Losing Conditions
        //===================================================================
        if ( myWin || myLose )
        {
            //TODO://edit window GUI
            g.setColor( Color.lightGray ); //sets the background color of the last screen
            g.fillRect( 0, 0, getWidth(), getHeight() );
            g.setColor( Color.white ); //sets the color of the text
            g.setFont( new Font( FONT_NAME, Font.BOLD, 48 ) );
            if ( myWin )
            {
                g.drawString( "You won!", 65, 150 );
            }
            if ( myLose )
            {
                g.drawString( "Game over!", 50 , 130 );
            }
            if ( myWin || myLose )
            {
                g.setFont( new Font( FONT_NAME, Font.ITALIC, 16 ) );
                g.setColor( new Color( 128, 128, 128, 128 ) );
                g.drawString( "Press ESC to play again", 80, getHeight() - 60 );
            }
        }
        g.setFont( new Font( FONT_NAME, Font.PLAIN, 18 ) );
        g.drawString( "Score: " + myScore, getWidth() - 150, getHeight() - 20 );

    }


    private static int offsetCoors( int arg )
    {
        return arg * ( TILES_MARGIN + TILE_SIZE ) + TILES_MARGIN;
    }

}
