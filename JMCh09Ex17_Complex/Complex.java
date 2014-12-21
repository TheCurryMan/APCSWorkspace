/**
 * Represents a complex number of the form a + bi. Provides methods for adding,
 * multiplying and calculating the absolute value.
 *
 * @author Jessica Jiang
 * @version October 3
 * @author Period: 4
 * @author Assignment: JMCh09Ex17_Complex
 *
 * @author Sources: TODO List collaborators
 */
public class Complex
{
    // TODO instance variables
    double a;

    double b;


    // TODO Constructors

    /**
     * @param a
     */
    public Complex( double a )
    {
        //TODO:
    }


    /**
     * @param a
     * @param b
     */
    public Complex( double a, double b )
    {
        // TODO: finish this
    }


    // TODO Methods

    /**
     * This method finds the absolute value of a variable
     * 
     * @param a
     * @param b
     * @return absolute value
     */
    /**
    public double abs( int a, int b )
    {
        return Math.sqrt( a * a + b * b );
    }
    */
    public double abs (Complex other)
    {
        return Math.sqrt( a * a + b * b );
    }
    
    /**
     * TODO Write your method description here.
     * @param other
     * @return
     */
    public Complex add(Complex other)
    {
        
    }
    
    /**
     * TODO Write your method description here.
     * @param a
     * @param b
     * @return
     */
    public double multiply ( int a, int b)
    {
        return a * b; // TODO: change later
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        return a + " + " + b + "i";
    }
}
