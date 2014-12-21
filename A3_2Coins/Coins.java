import java.lang.reflect.Field;
import java.util.Scanner;

/**
 * Coins: This class accepts a certain amount of monetary change (in cents).
 * The output is a list of the number of quarters, dimes, nickels, and
 * pennies that will make that amount of change with the least number of
 * coins possible.
 *
 * @author jjiang686
 * @version September 3, 2014
 * @author Period: 4
 * 
 * @author Assignment: Lab Activity 3.2 - Coins
 * 
 * @author Sources: TODO: list collaborators
 */
public class Coins
{
    private int myChange;
    
    /**This assigns the variable myChange to the value of change.
     * @param change myChange
     */
    public Coins( int change )
    {
        myChange = change;
    }

    /**
     * Calculates the number of each coin needed.
     */
    public void calculate()
    {
        int q;
        int a;
        int d;
        int b;
        int n;
        int c;

        q = myChange / 25;
        System.out.println("Quarter(s) " + q);
        a = myChange % 25;
        d = a / 10;
        System.out.println("Dime(s) " + d);
        b = a % 10;
        n = b / 5;
        System.out.println("Nickel(s)" + n);
        c = b % 5;
        System.out.println("Penny(s)" + c);
    }
    
    /**
     * Intended only for debugging.
     * 
     * <p>A generic toString implementation that uses reflection to print
     * names and values of all fields <em>declared in this class</em>.
     * Note that superclass fields are left out of this implementation.</p>
     * 
     * @return a string representation of this Easter.
     */
    public String toString()
    {
        String str = this.getClass().getName() + "[";
        String separator = "";

        Field[] fields = this.getClass().getDeclaredFields();

        for ( Field field : fields )
        {
            try
            {
                str += separator + field.getType().getName() + " "
                    + field.getName() + ":" + field.get( this );
            }
            catch ( IllegalAccessException ex )
            {
                System.out.println( ex );
            }
            separator = ", ";
        }
        return str + "]";
    }

    /**
     * Tester for the Coins class.
     * @param args command line arguments - not used
     */
    public static void main( String[] args )
    {
        Scanner console = new Scanner( System.in );

        System.out.print( "Please enter the number of cents --> " );
        int cents = console.nextInt();

        Coins change = new Coins( cents );
        change.calculate();
    }
}
