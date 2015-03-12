/**
 * TODO Write a one-sentence summary of your class here. TODO Follow it with
 * additional details about its purpose, what abstraction it represents, and how
 * to use it.
 * 
 * @author Jessica Jiang
 * @version March 10, 2015
 * @author Period - 4
 * @author Assignment - TODO Assignment Name
 * @author Sources - TODO list collaborators
 */
public class Heapsort
{
    // Sorts a[0], ..., a[size-1] in ascending order
    // using the Mergesort algorithm
    public static void sort( double[] a )
    {
        int m = a.length;
        for ( int i = m / 2; i >= 1; i-- )
            reheapDown( a, i, m );
        while ( m > 1 )
        {
            // swap a[0] with a[n-1]:
            double temp = a[0];
            a[0] = a[m - 1];
            a[m - 1] = temp;
            m--;
            reheapDown( a, 1, m );
        }
    }


    // Should be private - made public for testing
    public static void reheapDown( double[] a, int i, int n )
    {
        int b = i - 1;
        //
        while ( 2 * b + 1 < n )
        {
            if ( 2 * b + 2 == n )
                //
                if ( a[b] > a[2 * b + 1] )
                    return;
                //
                else
                {
                    double t = a[b];
                    a[b] = a[2 * b + 1];
                    a[2 * b + 1] = t;
                    return;
                }
            if ( a[b] >= a[2 * b + 1] && a[b] >= a[2 * b + 2] )
                return;
            if ( a[2 * b + 1] > a[2 * b + 2] )
            {
                double t = a[b];
                a[b] = a[2 * b + 1];
                a[2 * b + 1] = t;
                b = 2 * b + 1;
            }
            else
            {
                //
                double t = a[b];
                a[b] = a[2 * b + 2];
                a[2 * b + 2] = t;
                b = 2 * ( b + 2 );
            }
        }
    }
}
