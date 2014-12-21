public class Quicksort extends StepCount
{
    // Sorts a[0], ..., a[size-1] in ascending order
    // using the Quicksort algorithm.
    public void sort( double[] a )
    {
        recursiveSort( a, 0, a.length - 1 );
    }

    // Recursive helper method: sorts a[from], ..., a[to]
    private void recursiveSort( double[] a, int from, int to )
    {
        addSteps(1);
        if ( from >= to )
        {
            addSteps(1);
            return;
        }
        addSteps(1);

        // Choose pivot a[p]:
        int p = ( from + to ) / 2;
        // The choice of the pivot location may vary:
        // you can also use p = from or p = to or use
        // a fancier method, say, the median of the above three.

        // Partition:

        addSteps(5);
        int i = from;
        int j = to;
        while ( i <= j )
        {
            addSteps(1);
            if ( a[i] <= a[p] )
            {
                addSteps(1);
                i++;
            }
            else if ( a[j] >= a[p] )
            {
                addSteps(1);
                j--;
            }
            else
            {
                addSteps(5);
                swap( a, i, j );
                i++;
                j--;
            }
        }

        // Finish partitioning:

        if ( p < j ) // place the pivot in its correct position
        {
            addSteps(4);
            swap( a, j, p );
            p = j;
        }
        else if ( p > i )
        {
            addSteps(4);
            swap( a, i, p );
            p = i;
        }

        // Sort recursively:
        addSteps(2);
        recursiveSort( a, from, p - 1 );
        recursiveSort( a, p + 1, to );
    }
}
