/**
 *  TODO Write a one-sentence summary of your class here.
 *  TODO Follow it with additional details about its purpose, what
 *       abstraction it represents, and how to use it.
 *
 *  @author  TODO your name
 *  @version TODO date
 *  @author  Period: TODO your period
 *  @author  Assignment: JMCh03Ex12_Cylinder
 *
 *  @author  Sources: TODO list collaborators
 */
public class Cylinder
{
    private double height;
    private Circle base;

    /**
     * Constructs a circle of radius r.
     * @param r
     */
    public Cylinder( double r, double h)
    {
        height = h;
        base = new Circle (r); 
    }

    /**
     * Calculates the volume of a cylinder of a given radius.
     * @return area of this circle
     */
    public double getVolume()
    {
        return base.getArea() * height;
    }
}
