/**
 * Circle.java
 *
 * <code>Circle</code> represents a circle of radius r.
 *
 *  @author  Maria Litvin
 *  @version Aug 23, 2014
 *  @author  Period: 1-7
 *  @author  Assignment: JMCh03Ex12_Cylinder
 *
 *  @author  Sources: Maria & Gary Litvin
 */
public class Circle
{
    private double radius;

    /**
     * Constructs a circle of radius r.
     * @param r
     */
    public Circle( double r )
    {
        radius = r;
    }

    /**
     * Calculates the area of a circle of a given radius.
     * @return area of this circle
     */
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
}
