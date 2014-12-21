import java.awt.*;
import javax.swing.*;

/**
 * Implements a program with a pie chart that shows interactive polling
 * results for three candidates
 *
 * @author  bygeorge
 * @version Sep 1, 2014
 * @author  Period: 1-7
 * @author  Assignment: JMCh06_10PieChartSoln
 *
 * @author Sources: Gary & Maria Litvin
 */
public class Poll extends JFrame
{
    /**
     *  Constructor
     */
    public Poll()
    {
        super( "Vote for Tami, Brian, or Liz" );

        Container c = getContentPane();
        c.setBackground( Color.WHITE );
        PollDisplayPanel chart = new PollDisplayPanel( "Tami", "Brian", "Liz" );
        PollControlPanel controls = new PollControlPanel( chart );
        c.add( chart, BorderLayout.CENTER );
        c.add( controls, BorderLayout.SOUTH );
    }

    /**
     * Instantiate a Poll object
     * @param args command-line arguments (not used)
     */
    public static void main( String[] args )
    {
        Poll w = new Poll();
        w.setBounds( 300, 300, 400, 400 );
        w.setDefaultCloseOperation( EXIT_ON_CLOSE );
        w.setVisible( true );
    }
}
