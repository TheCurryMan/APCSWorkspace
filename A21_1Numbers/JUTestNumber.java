import org.junit.*;
import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;

public class JUTestNumber
{
    @Test
    public void mDigit()
    {
        Digit d = new Digit();
        assertEquals(d.toString(), "0");
    }

    @Test
    public void mDigit_int_int()
    {
        Digit d2 = new Digit(1, 2);
        assertEquals(d2.toString(), "1");

        Digit d8 = new Digit(7, 8);
        assertEquals(d8.toString(), "7");

        Digit d16 = new Digit(15, 16);
        assertEquals(d16.toString().toUpperCase(), "F");
    }

    @Test
    public void mDigit_inc()
    {
        boolean overflow;

        Digit d2 = new Digit(0, 2);
        overflow = d2.increment();
        assertFalse(overflow);
        overflow = d2.increment();
        assertTrue(overflow);
        assertEquals(d2.toString(), "0");

        Digit d8 = new Digit(6, 8);
        overflow = d8.increment();
        assertFalse(overflow);
        assertEquals(d8.toString(), "7");
        overflow = d8.increment();
        assertTrue(overflow);
        assertEquals(d8.toString(), "0");

        Digit d16 = new Digit(14, 16);
        overflow = d16.increment();
        assertFalse(overflow);
        assertEquals(d16.toString().toUpperCase(), "F");
        overflow = d16.increment();
        assertTrue(overflow);
        assertEquals(d16.toString(), "0");
    }

    @Test
    public void mNumber()
    {
        Number n = new Number();
        assertEquals(n.toString(), "0");
    }

    @Test
    public void mNumber_int_int()
    {
        Number n2 = new Number(21, 2);
        assertEquals(n2.toString(), "10101");

        Number n8 = new Number(491, 8);
        assertEquals(n8.toString(), "753");

        Number n16 = new Number(254, 16);
        assertEquals(n16.toString().toUpperCase(), "FE");
    }

    @Test
    public void mNumber_inc()
    {
        Number n2 = new Number(21, 2);
        n2.increment();
        assertEquals(n2.toString(), "10110");

        Number n8 = new Number(491, 8);
        n8.increment();
        assertEquals(n8.toString(), "754");

        Number n16 = new Number(254, 16);
        n16.increment();
        assertEquals(n16.toString().toUpperCase(), "FF");
        n16.increment();
        assertEquals(n16.toString().toUpperCase(), "100");
    }

    public static junit.framework.Test suite()
    {
        return new JUnit4TestAdapter( JUTestNumber.class );
    }

    public static void main( String args[] )
    {
        org.junit.runner.JUnitCore.main( "JUTestNumber" );
    }
}
