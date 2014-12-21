import org.junit.*;
import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;

import java.util.Iterator;

public class JUTestSinglyLinkedList
{
    private static Integer[] intArray = {0, 1, 2, 1, 4};

    @Test
    public void test_IsEmpty()
    {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        assertTrue("<< isEmpty >>", list.isEmpty());

        list = new SinglyLinkedList<Integer>(intArray);
        assertFalse("<< isEmpty >>", list.isEmpty());
    }

    @Test
    public void test_Size()
    {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        assertEquals("<< size >>", 0, list.size());

        list = new SinglyLinkedList<Integer>(intArray);
        assertEquals("<< size >>", 5, list.size());
    }

    @Test
    public void test_Contains()
    {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        assertFalse("<< contains - empty list >>", list.contains(0));

        list = new SinglyLinkedList<Integer>(intArray);
        assertFalse("<< contains - not in list>>", list.contains(-1));

        assertTrue("<< contains - in list >>", list.contains(4));
    }

    @Test
    public void test_IndexOf()
    {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        assertTrue("<< indexOf - empty list >>", list.indexOf(0) < 0);

        list = new SinglyLinkedList<Integer>(intArray);
        assertTrue("<< indexOf - not in list >>", list.indexOf(-1) < 0);

        assertEquals("<< indexOf - in list >>", 4, list.indexOf(4));
    }

    @Test
    public void test_Add()
    {
        int size;

        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        size = list.size();
        assertTrue("<< add - empty list >>", list.add(23));
        assertEquals("<< add - list size increase by 1 >>", size + 1, list.size());

        int val = list.iterator().next();
        assertEquals("<< add - list contains value >>", 23, val);

        list = new SinglyLinkedList<Integer>(intArray);
        size = list.size();
        assertTrue("<< add - failed >>", list.add(23));
        assertEquals("<< add - list size increase by 1 >>", size + 1, list.size());

        // iterate to last value
        for (Integer intVal : list)
        {
            val = intVal;
        }
        assertEquals("<< add - value at end >>", 23, val);
    }

    @Test
    public void test_Remove()
    {
        Integer val = new Integer(23);
        Integer one = new Integer(1);
        Integer two = new Integer(2);
        int size;

        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        size = list.size();
        assertFalse("<< remove - empty list >>", list.remove(val));
        assertEquals("<< remove - list size 0 >>", size, list.size());

        list = new SinglyLinkedList<Integer>(intArray);
        size = list.size();
        assertTrue("<< remove - empty list >>", list.remove(new Integer(two)));
        assertEquals("<< remove - list size decrease by 1 >>", size - 1, list.size());

        assertTrue("<< remove - empty list >>", list.remove(new Integer(one)));
        assertEquals("<< remove - list size decrease by 2 >>", size - 2, list.size());
        assertEquals("<< add - indexOf of remaining value >>", 1, list.indexOf(one));
    }

    @Test
    public void test_RemoveAtIndex()
    {
        int val, arrayVal;
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>(intArray);

        try
        {
            val = list.remove(list.size() - 1);
            arrayVal = intArray[intArray.length-1];
            assertEquals("<< remove - failed >>", arrayVal, val);
            assertEquals("<< remove - failed size >>", intArray.length-1, list.size());
        }
        catch (IndexOutOfBoundsException ex)
        {
            fail("<< remove failed (valid index) >>");
        }

        try
        {
            val = list.remove(0);
            arrayVal = intArray[0];
            assertEquals("<< remove - failed >>", arrayVal, val);
            assertEquals("<< remove - failed size >>", intArray.length-2, list.size());
        }
        catch (IndexOutOfBoundsException ex)
        {
            fail("<< remove failed (valid index) >>");
        }
        
        try
        {
            val = list.remove(-1);
            fail("<< remove from index -1 >>");
        }
        catch (IndexOutOfBoundsException ex) { }

        try
        {
            val = list.remove(list.size());
            fail("<< remove from index = list.size() >>");
        }
        catch (IndexOutOfBoundsException ex) { }
    }
    
    @Test
    public void test_Get()
    {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        try
        {
            list.get(0);
            fail("<< get from an empty list >>");
        }
        catch (IndexOutOfBoundsException ex) {  }

        list = new SinglyLinkedList<Integer>(intArray);
        try
        {
            list.get(-1);
            fail("<< get index -1 >>");
        }
        catch (IndexOutOfBoundsException ex) {  }

        try
        {
            list.get(list.size());
            fail("<< get index == list.size() >>");
        }
        catch (IndexOutOfBoundsException ex) {  }

        try
        {
            int val = list.get(2);
            assertEquals("<< get - failed >>", 2, val);
        }
        catch (IndexOutOfBoundsException ex)
        {
            fail("<< get failed (valid index) >>");
        }
    }

    @Test
    public void test_Set()
    {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        try
        {
            list.set(0, -1);
            fail("<< set - empty list >>");
        }
        catch (IndexOutOfBoundsException ex) {  }

        list = new SinglyLinkedList<Integer>(intArray);
        try
        {
            list.set(-1, -1);
            fail("<< set index -1 >>");
        }
        catch (IndexOutOfBoundsException ex) {  }

        try
        {
            list.set(list.size(), -1);
            fail("<< set index == list.size() >>");
        }
        catch (IndexOutOfBoundsException ex) {  }

        try
        {
            int val = list.set(3, 3);
            assertEquals("<< set - failed >>", 1, val);
        }
        catch (IndexOutOfBoundsException ex)
        {
            fail("<< set failed (valid index) >>");
        }
    }

    @Test
    public void test_AddAtIndex()
    {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();

        try
        {
            list.add(0, -1);
            assertTrue("<< set - failed >>", list.toString().contains("-1"));
        }
        catch (IndexOutOfBoundsException ex)
        {
            fail("<< add failed (index == 0) >>");
        }

        list = new SinglyLinkedList<Integer>(intArray);
        try
        {
            list.add(-1, -1);
            fail("<< add index -1 >>");
        }
        catch (IndexOutOfBoundsException ex) {  }

        try
        {
            list.add(list.size() + 1, -1);
            fail("<< add index > list.size() >>");
        }
        catch (IndexOutOfBoundsException ex) {  }

        try
        {
            list.add(3, 3);
            assertTrue("<< add - failed >>", list.toString().contains("3"));
            assertEquals("<< add - failed size >>", intArray.length + 1, list.size());
        }
        catch (IndexOutOfBoundsException ex)
        {
            fail("<< add failed (valid index) >>");
        }
    }

    @Test
    public void test_toString()
    {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>(intArray);
        String str = list.toString();

        int i = 0;
        for (Integer val : list)
        {
            String valStr = val.toString();
            str = str.substring( str.indexOf(valStr) );
            String s = str.substring( 0, valStr.length());
            assertEquals("<< toString - failed >>", valStr, s);
            //      System.out.println(s);
        }
    }

    public static junit.framework.Test suite()
    {
        return new JUnit4TestAdapter( JUTestSinglyLinkedList.class );
    }

    public static void main( String args[] )
    {
        org.junit.runner.JUnitCore.main( "JUTestSinglyLinkedList" );
    }
}

