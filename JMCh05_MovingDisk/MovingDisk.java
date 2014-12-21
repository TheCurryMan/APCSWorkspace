import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


/**
 * This program draws a JPanel with a black or cyan background with a moving
 * orange disk across the sky.
 *
 * @author Jessica Jiang
 * @version Sep 2, 2014
 * @author Period: 4
 * @author Assignment: JMCh05_MovingDisk
 *
 * @author Sources: N/A
 */
public class MovingDisk extends JPanel implements ActionListener
{
    private int time;


    /**
     * Constructor for the class
     */
    public MovingDisk()
    {
        time = 0;
        Timer clock = new Timer( 30, this );
        clock.start();
    }


    /**
     * TODO Paints the whole picture with the moving disk and background
     * 
     * @param g
     *            takes in a variable with data type Graphics
     */
    public void paintComponent( Graphics g )
    {
        int x = 150 - (int)( 100 * Math.cos( 0.005 * Math.PI * time ) );
        int y = 130 - (int)( 75 * Math.sin( 0.005 * Math.PI * time ) );
        int r = 20;

        Color sky;
        if ( y > 130 )
        {
            sky = Color.BLACK;

        }
        else
        {
            sky = Color.CYAN;
        }
        setBackground( sky );
        super.paintComponent( g );

        g.setColor( Color.ORANGE );
        g.fillOval( x - r, y - r, 2 * r, 2 * r );
    }


    /**
     * Repaints the world
     * 
     * @param e
     *            takes in parameter e
     */
    public void actionPerformed( ActionEvent e )
    {
        time++;
        repaint();
    }


    /**
     * 
     * The main that executes the program.
     * 
     * @param args
     *            takes in String
     */
    public static void main( String args )
    {
        JFrame w = new JFrame( "Moving Disk" );
        w.setSize( 300, 150 );
        w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        Container c = w.getContentPane();
        c.add( new MovingDisk() );
        w.setResizable( false );
        w.setVisible( true );
    }
}
