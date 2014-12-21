import java.awt.geom.*;

public class Driver
{
	/**
	 * Method main
	 *
	 *
	 * @param args command-line parameters (not used)
	 *
	 */
    public static void main( String[] args )
    {
        IrregularPolygon parallelogram = new IrregularPolygon();
        parallelogram.add( new Point2D.Double( 20, 10 ) );
        parallelogram.add( new Point2D.Double( 70, 20 ) );
        parallelogram.add( new Point2D.Double( 50, 50 ) );
        parallelogram.add( new Point2D.Double( 0, 40 ) );

        parallelogram.draw();
        System.out.println( "\nParallelogram" );
        System.out.printf( "%s%.2f", "Perimeter = ", parallelogram.perimeter() );
        System.out.printf( "%s%.2f", "\nArea = ", parallelogram.area() );
        System.out.println();

        // Invalid polygon (no vertices)
        IrregularPolygon bogus = new IrregularPolygon();
        bogus.draw();
        System.out.println( "\nDefault polygon with 0 vertices" );
        System.out.println( "Perimeter = " + bogus.perimeter() );
        System.out.println( "Area = " + bogus.area() );
        System.out.println();

        // create a square with sides of length 180
        IrregularPolygon square = new IrregularPolygon();

        square.add( new Point2D.Double( 90.0, 90.0 ) );
        square.add( new Point2D.Double( 90.0, -90.0 ) );
        square.add( new Point2D.Double( -90.0, -90.0 ) );
        square.add( new Point2D.Double( -90.0, 90.0 ) );

        square.draw();
        System.out.println( "\nSquare" );
        System.out.printf( "%s%.2f", "Perimeter = ", square.perimeter() );
        System.out.printf( "%s%.2f", "\nArea = ", square.area() );
        System.out.println();

        // create a pentagon with sides of length 90
        IrregularPolygon pentagon = new IrregularPolygon();

        pentagon.add( new Point2D.Double( 90.0, 123.87437284240565 ) );
        pentagon.add( new Point2D.Double( 145.62305898749054,
            -47.31580009072198 ) );
        pentagon.add( new Point2D.Double( 0.0, -153.11714550336717 ) );
        pentagon.add( new Point2D.Double( -145.6230589874905,
            -47.31580009072202 ) );
        pentagon.add( new Point2D.Double( -90.0, 123.87437284240563 ) );

        pentagon.draw();
        System.out.println( "\nPentagon" );
        System.out.printf( "%s%.2f", "Perimeter = ", pentagon.perimeter() );
        System.out.printf( "%s%.2f", "\nArea = ", pentagon.area() );
        System.out.println();

    }
}

/**************** sample run ****************************
Parallelogram
Perimeter = 174.09
Area = 1700.00

Default polygon with 0 vertices
Perimeter = 0.0
Area = 0.0


Square
Perimeter = 720.00
Area = 32400.00

Pentagon
Perimeter = 900.00
Area = 55743.47
**********************************************************/
