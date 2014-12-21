import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

/**
   This program compares benchmarks for Selection Sort, Insertion Sort,
   Mergesort, and Quicksort
  
   @author  George Peck
   @version 11/17/2014

   @author Period: 1-7
   @author Assignment: JM Ch13.9 - Benchmarks

   @author Sources: Maria and Gary Litvin
 */
@SuppressWarnings("serial")
public class Benchmarks extends JFrame
{    
    private JTextField arraySizeInput, display;

    private StepCount[] sortMethods = { new BubbleSort(), new SelectionSort(),
        new InsertionSort(), new Mergesort(), new Quicksort() };

    private String[] sortMethodNames = { "Bubble Sort", "Selection Sort",
        "Insertion Sort", "Mergesort", "Quicksort" };

    private JComboBox<String> chooseSortMethod;

    // Use the same random number generator seed for all benchmarks
    // in one run of this program:
    private static final long seed = System.currentTimeMillis();

    private int arraySize;

    // Constructor
    public Benchmarks()
    {
        super( "Benchmarks" );

        Container c = getContentPane();
        c.setLayout( new GridLayout( 6, 1 ) );

        c.add( new JLabel( " Array size: " ) );
        arraySizeInput = new JTextField( 4 );
        arraySizeInput.setText( "100" );
        arraySizeInput.selectAll();
        c.add( arraySizeInput );

        chooseSortMethod = new JComboBox<String>( sortMethodNames );
        c.add( chooseSortMethod );

        JButton run = new JButton( "Run" );
        run.addActionListener( new RunButtonListener() );
        c.add( run );

        c.add( new JLabel( " Step Count: " ) );

        display = new JTextField( "   Ready" );
        display.setBackground( Color.YELLOW );
        display.setEditable( false );
        c.add( display );
    }

  
  /**
     Fills a[] with random numbers and sorts it using the sorting method
     specified in sortMethod:
         1 -- Bubble Sort
         2 -- Selection Sort
         3 -- Insertion Sort
         4 -- Mergesort
         5 -- Quicksort
     Returns the total number of steps it took.
     
     @param a  array of doubles to be filled with random numbers
     @param sm  array of possible sort methods
     @param sortMethod  index of method to used for sort
     @return  total sort time in milliseconds
   */
    public static long runSort( double[] a, StepCount[] sm, int sortMethod )
    {
        long totalSteps = 0;

        Random randomGenerator = new Random( seed );

        for ( int k = 0; k < a.length; k++ )
        {
            a[k] = randomGenerator.nextDouble();
        }
        
        sm[sortMethod].setStepCount( 0 );
        sm[sortMethod].sort( a );
        totalSteps = sm[sortMethod].getStepCount();
        return totalSteps;
    }

    // Handles Run button events
    private class RunButtonListener implements ActionListener
    {
        public void actionPerformed( ActionEvent e )
        {
            String inputStr = arraySizeInput.getText().trim();
            try
            {
                arraySize = Integer.parseInt( inputStr );
            }
            catch ( NumberFormatException ex )
            {
                display.setText( " Invalid array size" );
                arraySize = 0;
                return;
            }

            if ( arraySize <= 0 )
            {
                display.setText( " Invalid array size" );
                return;
            }

            if ( arraySize <= 0 )
                return;

            int sortMethod = chooseSortMethod.getSelectedIndex() + 1;
            double a[] = new double[arraySize];
            long stepCount = runSort( a, sortMethods, sortMethod - 1 );
            display.setText( "" + stepCount );

            arraySizeInput.selectAll();
            arraySizeInput.requestFocus();
            System.out.println( "Array size = " + arraySize + " "
                + sortMethodNames[sortMethod - 1] + " Step Count: " + stepCount );

        }
    }

  //************************************************************

    public static void main( String[] args )
    {
        Benchmarks window = new Benchmarks();
        window.setBounds( 300, 300, 180, 200 );
        window.setDefaultCloseOperation( EXIT_ON_CLOSE );
        window.setVisible( true );
    }
}

