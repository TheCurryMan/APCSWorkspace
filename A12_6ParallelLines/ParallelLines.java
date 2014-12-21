import java.awt.*;
import javax.swing.*;


/**
 * TODO This class draws 8 parallel lines that each have 7 darkened squares on
 * each line.
 * 
 * @author Jessica Jiang
 * @version 22 September 2014
 * 
 * Period - 4 Assignment - A12.6 - ParallelLines
 * 
 * Sources - TODO list collaborators
 */
public class ParallelLines extends JPanel
{
    // TODO Your Instance Variables Here

    public void paintComponent( Graphics g )
    {
        super.paintComponent( g ); // Call JPanel's paintComponent method
                                   // to paint the background

        int width = getWidth();
        int height = getHeight();

        drawIllusion( g, width, height );
    }


    /**
     * TODO Write your method description here.
     * 
     * @param g
     * @param width
     * @param height
     * @param size
     */
    public void drawIllusion( Graphics g, int width, int height )
    {
        for ( int row = 0; row < 8; row++ )
        {
          // calculate the start of the row of squares
           
          // calculate and add a horizontal offset

          for ( int col = 0; col < 7; col++ )
          {
            // draw the square
            g.fillRect( x, y, width, height );
            // calculate and position for the next square
        
          }

          // calculate the location and draw the line
          g.drawLine( 0, 0, width, height );
        }
    }


    public static void main( String[] args )
    {
        JFrame w = new JFrame( "ParallelLines" );
        w.setBounds( 100, 100, 640, 480 );
        w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        ParallelLines panel = new ParallelLines();
        panel.setBackground( Color.WHITE );
        Container c = w.getContentPane();
        c.add( panel );
        w.setResizable( true );
        w.setVisible( true );
    }
}
