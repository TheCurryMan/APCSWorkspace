public class InsertionSort extends StepCount
{
    // Sorts a[0], ..., a[size-1] in ascending order
    // using Insertion Sort.
    public void sort( double[] a )
    {
        addSteps(1);
        for ( int n = 1; n < a.length; n++ )
        {
            // Save the next element to be inserted:
            addSteps(5);
            double aTemp = a[n];

            // Going backward from a[n-1], shift elements to the
            // right until you find an element a[i] <= aTemp:
            int i = n;
            while ( i > 0 && aTemp < a[i - 1] )
            {
                addSteps(4);
                a[i] = a[i - 1];
                i--;
            }

            // Insert the saved element after a[i]:
            a[i] = aTemp;
        }
    }
}

