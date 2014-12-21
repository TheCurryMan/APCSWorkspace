
/**
 *  Implements a Bubble sort algorithm with step counting.
 *
 *  @author  George Peck
 *  @version Nov 15, 2014
 *  @author  Period: 1-7
 *  @author  Assignment: JMCh13_9BenchmarksSC
 *
 *  @author  Sources: NA
 */
public class BubbleSort extends StepCount
{
    public void sort( double[] a )
    {
        addSteps(1); // initialize outer = 0
        for ( int outer = 0; outer < a.length - 1; outer++ )
        {
            addSteps(3);
            //  1 - boundary check of outer loop;
            //  2 - increment, outer++
            //  3 - initialization of inner loop
            for ( int inner = 0; inner < a.length - outer - 1; inner++ )
            {
                addSteps(3);
                //  1 - boundary check of inner loop
                //  2 - increment, inner++
                //  3 - if comparison
                if ( a[inner] > a[inner + 1] )
                {
                    addSteps(3); // swap of list[inner] & list[inner + 1]
                    swap(a, inner, inner + 1);
                }
            }
        }
    }
}
