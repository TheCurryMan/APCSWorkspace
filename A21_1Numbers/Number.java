import java.util.*;


/**
 * Write a number class that represents a number with a given base. The number
 * class has two constructors. The default constructor sets the base at 10 and
 * the value to 0. The other constructor accepts a decimal value and a base. The
 * constructors will have to create all of the digits (as objects of the digit
 * class) and store them in some kind of list. Create a toString method and an
 * increment method. These two methods will use the corresponding methods of the
 * digit class to do most of the work for them.
 * 
 * For both classes, you can assume that the bases are restricted to binary,
 * octal, decimal or hexadecimal and the values are non-negative.
 * 
 * @author Jessica Jiang
 * @version April 1, 2015
 * @author Period - TODO Your Period
 * @author Assignment - TODO Assignment Name
 * @author Sources - TODO list collaborators
 */
public class Number
{
    LinkedList<Digit> list;
    int base;

    public Number()
    {
        list = new LinkedList<Digit>();
        list.add( new Digit( 0, 10 ) );
        this.base = 10;
    }
 
 
    public Number( int myValue, int myBase )
    {
        list = new LinkedList<Digit>();
        base = myBase;
        int remainder = 100000;
        while ( myValue > 0 )
        {
            remainder = myValue % base;
            myValue /= base;
            list.add( 0, new Digit( remainder, base ) );
        }
    }
 
 
    public String toString()
    {
        String str = "";
        for ( Digit d : list )
            str += d.toString();
        return str;
    }
 
 
    public void increment()
    {
        for ( int i = list.size() - 1; i >= 0; i-- )
            if ( list.get( i ).increment() == false )
                return;
        list.add( 0, new Digit( 1, base ) );
    }
}
