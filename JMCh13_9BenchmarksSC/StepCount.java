/**
 * Class to aid in the tracking of steps in implemented sort methods.
 * An instrumented sort method must be provided.
 *
 * @author George Peck
 * @version Nov 15, 2014
 * @author Period: 1-7
 * @author Assignment: JMCh13_9BenchmarksSC
 *
 * @author Sources: NA
 */
public abstract class StepCount
{
    private long steps;
    
    public abstract void sort( double[] a );

    /**
     * Adds the specified number of steps to the step counter
     *
     * @param countToAdd counts to add to the step counter
     */
    public void addSteps( int countToAdd )
    {
        steps += countToAdd;
    }

    /**
     * Sets the stepCount attribute of the Sorts object
     *
     * @param stepCount The new stepCount value
     */
    public void setStepCount( int stepCount )
    {
        steps = stepCount;
    }

    /**
     * Gets the stepCount attribute of the Sorts object
     *
     * @return The stepCount value
     */
    public long getStepCount()
    {
        return steps;
    }
    
    public static void swap( double[] a, int i, int j )
    {
        double temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
