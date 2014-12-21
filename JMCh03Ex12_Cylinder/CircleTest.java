import java.util.Scanner;

/**
 *  This is a class that tests the Circle class.
 *
 *  @author  Maria Litvin
 *  @version Aug 23, 2014
 *  @author  Period: 1-7
 *  @author  Assignment: JMCh03Ex12_Cylinder
 *
 *  @author  Sources: Maria & Gary Litvin
 */
public class CircleTest
{
    /**
     * The main method in this class checks the Circle operations for
     * consistency.
     * @param args is not used.
     */
    public static void main( String[] args )
    {
        Scanner kb = new Scanner( System.in );
        System.out.print( "Enter the radius: " );
        double r = kb.nextDouble();

        Circle circle = new Circle( r );
        double area = circle.getArea();
        System.out.println( "radius = " + r + " area = " + area );
    }
}
