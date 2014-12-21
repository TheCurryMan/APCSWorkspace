import java.util.*;
import java.io.*;

/**
 * Chapter 23 - File I/O with Scanner and PrintStream Exercises.
 * 
 * @author TODO Your Name
 * @version TODO Date
 * 
 * @author Period - TODO
 * @author Your Period
 * @author Assignment - Ch23Exercises
 * 
 * @author Sources - TODO list collaborators
 */
public class Ch23Exercises
{
    Scanner scan;

    /**
     * Constructs a Scanner for input from the console.
     */
    public Ch23Exercises()
    {
        scan = new Scanner( System.in );
    }

    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * 
     * @param str  input for the various methods
     */
    public Ch23Exercises( String str )
    {
        scan = new Scanner( str );
    }

    /**
     * Exercise 1 - Sum of a file of Integers
     * 
     * TODO Description
     */
    public int sumOfIntFile()
    {
        int sum = 0;
        
        // TODO Your code goes here
        
        return sum;
    }

    /**
     * Exercise 2 - Average and Standard Deviation of a file of Doubles
     * 
     * TODO Description
     */
    public double[] avgStdDevOfDoubleFile()
    {
        double avg = 0;
        double sd = 0;

        // TODO Your code goes here

        double[] result = { avg, sd };
        return result;
    }

    /**
     * Exercise 4 - Separate Sums
     * 
     * TODO Description
     */
    public int[] seperateSums()
    {
        int xSum = 0;
        int ySum = 0;

        // TODO Your code goes here

        int[] result = { xSum, ySum };
        return result;
    }

    /**
     * Exercise 6 - E-Mail Address Extractor
     * 
     * TODO Description
     */
    public void emailAddressExtractor()
    {
        // TODO Your code goes here
    }
    
    /**
     * Testing method: instantiates a Ch23Exercises object and then invokes
     * each method.
     * 
     * @param args command line parameters (not used)
     */
    public static void main( String[] args ) throws IOException
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        Ch23Exercises exercise = new Ch23Exercises();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "   (1) Sum of a file of Integers" );
            System.out.println( "   (2) Average and Standard Deviation "
                + "of a file of Doubles" );
            System.out.println( "   (4) Separate Sums" );
            System.out.println( "   (6) E-Mail Address Extractor" );
            System.out.println( "   (Q) Quit" );
            System.out.println();
            System.out.print( "Enter a choice:  " );
            String response = kbd.nextLine();

            if ( response.length() > 0 )
            {
                System.out.println();

                switch ( response.charAt( 0 ) )
                {
                    case '1':
                        System.out.println( "Sum of the file = "
                            + exercise.sumOfIntFile() );
                        break;
                    case '2':
                        double[] avgSD = exercise.avgStdDevOfDoubleFile();
                        System.out.println("Average = " + avgSD[0]);
                        System.out.println("Standard Deviation = " + avgSD[1]);
                        break;
                    case '4':
                        int[] sums = exercise.seperateSums();
                        System.out.println("Sum of x = " + sums[0]);
                        System.out.println("Sum of y = " + sums[1]);
                        break;
                    case '6':
                        exercise.emailAddressExtractor();
                        break;
                    default:
                        if ( response.toLowerCase().charAt( 0 ) == 'q' )
                        {
                            done = true;
                        }
                        else
                        {
                            System.out.print( "Invalid Choice" );
                        }
                        break;
                }
            }
        } while ( !done );
        
        System.out.println( "Goodbye!" );
    }
}
