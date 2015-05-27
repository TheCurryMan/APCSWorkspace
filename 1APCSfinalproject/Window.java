import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.WindowConstants;


/**
 * Creates the window used for the 2048 game.
 *
 * @author jessicajiang and sarahpark
 * @version May 27, 2015
 * @author Period: TODO
 * @author Assignment: 1APCSfinalproject
 *
 * @author Sources: TODO
 */
public class Window
{
    JFrame frame = new JFrame();


    public static void main( String[] args )
    {
        JFrame myFrame = new JFrame();
        myFrame.setTitle( "2048 APCS" );
        myFrame.setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
        myFrame.setSize( 340, 400 );
        myFrame.setResizable( false );

        myFrame.add( new MainScene() );

        myFrame.setLocationRelativeTo( null );
        myFrame.setVisible( true );
    }
    
    Runtime runtime = Runtime.getRuntime();

    
}
