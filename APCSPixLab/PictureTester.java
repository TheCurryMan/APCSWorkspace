/**
 * This class contains class (static) methods that will help you test the
 * Picture class methods. Uncomment the methods and the code in the main to
 * test.
 * 
 * @author Barbara Ericson
 */
public class PictureTester
{
    /** Method to test zeroBlue */
    public static void testZeroBlue()
    {
        Picture beach = new Picture( "beach.jpg" );
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }

    /** Method to test keepOnlyBlue */
    public static void testKeepOnlyBlue()
    {
        Picture beach = new Picture( "beach.jpg" );
        beach.explore();
        beach.keepOnlyBlue();
        beach.explore();
    }

    /** Method to test keepOnlyGreen */
    public static void testKeepOnlyGreen()
    {
        Picture beach = new Picture( "beach.jpg" );
        beach.explore();
        beach.keepOnlyGreen();
        beach.explore();
    }

    /** Method to test negate */
    public static void testNegate()
    {
        Picture beach = new Picture( "beach.jpg" );
        beach.explore();
        beach.negate();
        beach.explore();
    }

    /** Method to test grayscale */
    public static void testGrayscale()
    {
        Picture beach = new Picture( "beach.jpg" );
        beach.explore();
        beach.grayscale();
        beach.explore();
    }

    /** Method to test keepOnlyRed */
    public static void testKeepOnlyRed()
    {
        Picture beach = new Picture( "beach.jpg" );
        beach.explore();
        beach.keepOnlyRed();
        beach.explore();
    }

    /** Method to test fixUnderwater */
    public static void testFixUnderwater()
    {
        Picture water = new Picture( "water.jpg" );
        water.explore();
        water.fixUnderwater();
        water.explore();
    }

    /** Method to test mirrorVertical */
    public static void testMirrorVertical()
    {
        Picture caterpillar = new Picture( "caterpillar.jpg" );
        caterpillar.explore();
        caterpillar.mirrorVertical();
        caterpillar.explore();
    }

    /** Method to test mirrorVerticalRightToLeft */
    public static void testMirrorVerticalRightToLeft()
    {
        Picture pic = new Picture( "swan.jpg" );
//        Picture pic = new Picture( "android.jpg" );
        pic.explore();
        pic.mirrorVerticalRightToLeft();
        pic.explore();
    }

    /** Method to test mirrorHorizontal */
    public static void testMirrorHorizontal()
    {
        Picture cycle = new Picture( "redMotorcycle.jpg" );
        cycle.explore();
        cycle.mirrorHorizontal();
        cycle.explore();
    }

    /** Method to test mirrorHorizontalBotToTop */
    public static void testMirrorHorizontalBotToTop()
    {
        Picture swan = new Picture( "swan.jpg" );
        swan.explore();
        swan.mirrorHorizontalBotToTop();
        swan.explore();
    }

    /** Method to test mirrorDiagonal */
    public static void testMirrorDiagonal()
    {
        Picture beach = new Picture( "beach.jpg" );
        beach.explore();
        beach.mirrorDiagonal();
        beach.explore();
    }

    /** Method to test mirrorTemple */
    public static void testMirrorTemple()
    {
        Picture temple = new Picture( "temple.jpg" );
        temple.explore();
        temple.mirrorTemple();
        temple.explore();
    }

    /** Method to test mirrorArms */
    public static void testMirrorArms()
    {
        Picture snowman = new Picture( "snowman.jpg" );
        snowman.explore();
        snowman.mirrorArms();
        snowman.explore();
    }

    /** Method to test mirrorGull */
    public static void testMirrorGull()
    {
        Picture gull = new Picture( "seagull.jpg" );
        gull.explore();
        gull.mirrorGull();
        gull.explore();
    }

    /** Method to test the collage method */
    public static void testCollage()
    {
        Picture canvas = new Picture( "640x480.jpg" );
        canvas.createCollage();
        canvas.explore();
    }

    /** Method to test copy */
    public static void testCopy()
    {
        Picture katie = new Picture( "KatieFancy.jpg" );
        Picture blank = new Picture( "640x480.jpg" );
        blank.copy( katie, 4, 67, 75, 129, 10, 10 );
        blank.show();
    }

    /** Method to test edgeDetection */
    public static void testEdgeDetection()
    {
        Picture swan = new Picture( "swan.jpg" );
        swan.edgeDetection( 10 );
        swan.explore();
    }

    /** Method to test edgeDetection2 */
    public static void testEdgeDetection2()
    {
        Picture swan = new Picture( "swan.jpg" );
        swan.edgeDetection2( 10 );
        swan.explore();
    }

    /** Method to test chromakey */
    public static void testChromakey()
    {
        Picture mark = new Picture( "blue-mark.jpg" );
        Picture moon = new Picture( "moon-surface.jpg" );
        mark.chromakey( moon );
        mark.explore();
    }

    /** Method to test encode and decode */
    public static void testEncodeAndDecode()
    {
        Picture beach = new Picture( "beach.jpg" );
        beach.explore();
        Picture message = new Picture( "msg.jpg" );
        beach.encode( message );
        beach.explore();
        Picture decoded = beach.decode();
        decoded.explore();
    }

    /** Method to test getCountRedOverValue */
    public static void testGetCountRedOverValue( int value )
    {
        Picture beach = new Picture( "beach.jpg" );
        int count = beach.getCountRedOverValue( value );
        System.out.println( count );
    }

    /** Method to test setRedToHalfValueInTopHalf */
    public static void testSetRedToHalfValueInTopHalf()
    {
        Picture beach = new Picture( "beach.jpg" );
        beach.explore();
        beach.setRedToHalfValueInTopHalf();
        beach.explore();
    }

    /** Method to test clearBlueOverValue */
    public static void testClearBlueOverValue( int value )
    {
        Picture beach = new Picture( "beach.jpg" );
        beach.explore();
        beach.clearBlueOverValue( value );
        beach.explore();
    }

    /** Method to test getAverageForColumn */
    public static void testGetAverageForColumn( int col )
    {
        Picture beach = new Picture( "beach.jpg" );
        beach.explore();
        int[] avgArray = beach.getAverageForColumn( col );
        for ( int i = 0; i < 5; i++ )
        {
            System.out.println( avgArray[i] );
        }
    }

    /**
     * Main method for testing. Every class can have a main method in Java
     */
    public static void main( String[] args )
    {
        // uncomment a call here to run a test
        // and comment out the ones you don't want
        // to run
        testZeroBlue();
        // testKeepOnlyBlue();
        // testKeepOnlyRed();
        // testKeepOnlyGreen();
        // testNegate();
        // testGrayscale();
        // testFixUnderwater();
        // testMirrorVertical();
        // testMirrorVerticalRightToLeft();
        // testMirrorHorizontal();
        // testMirrorHorizontalBotToTop();
        // testMirrorDiagonal();
        // testMirrorTemple();
        // testMirrorArms();
        // testMirrorGull();
        // testCollage();
        // testCopy();
        // testEdgeDetection();
        // testEdgeDetection2();
        // testChromakey();
        // testEncodeAndDecode();
        // testGetCountRedOverValue(250);
        // testSetRedToHalfValueInTopHalf();
        // testClearBlueOverValue(200);
        // testGetAverageForColumn(0);
    }
}