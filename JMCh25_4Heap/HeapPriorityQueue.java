import java.util.*;

/**
   Implements a priority queue based on a min-heap.

   @author  Jessica Jiang
   @version March 6th, 2015

   @author Period - 4
   @author Assignment - Heap

   @author Sources - TODO list collaborators
 */
public class HeapPriorityQueue
{
    private static final int DFLT_CAPACITY = 101;
    private Object[] items;
    private int numItems;
    private final Comparator<Object> comparator;

    public HeapPriorityQueue()
    {
        this(DFLT_CAPACITY, null);
    }

    public HeapPriorityQueue(Comparator<Object> c)
    {
        this(DFLT_CAPACITY, c);
    }

    public HeapPriorityQueue(int initialCapacity)
    {
        this(initialCapacity, null);
    }

    public HeapPriorityQueue(int initialCapacity, Comparator<Object> c)
    {
        items = new Object[initialCapacity + 1];
        comparator = c;
    }

    /**
     *  Returns true if this priority queue is empty;
     *  otherwise returns false.
     */
    public boolean isEmpty()
    {
        return numItems == 0;
    }

    /**
     *  Returns the highest priority element without removing
     *  it from this priority queue.
     */
    public Object peek()
    {
        if (numItems == 0)
        {
            throw new NoSuchElementException();
        }
        return items[1];
    }

    /**
     *  Adds obj to this priority queue; returns true.
     */
    public boolean add(Object obj)
    {
        numItems++;
        if (numItems >= items.length)  // items[0] is not used
            growCapacity();
        items[numItems] = obj;
        reheapUp();
        return true;
    }

    /**
     *  Removes and returns the highest priority item.
     */
    public Object remove()
    {
        if (numItems == 0)
        {
            throw new NoSuchElementException();
        }

        Object minObject = items[1];
        items[1] = items[numItems];
        numItems--;
        reheapDown();
        return minObject;
    }

    //**************************************************************************

    private boolean lessThan(Object obj1, Object obj2)
    {
        if (comparator != null)
            return comparator.compare(obj1, obj2) < 0;
        else
            return ((Comparable)obj1).compareTo(obj2) < 0;
    }

    public void reheapDown()
    {
        for ( int i = 1; i <= numItems / 2; i++)
        {
            int a;
            Object obj;
 
            // compares the two children
            if ( lessThan( items[2 * i + 1], items[2 * i] ) )
                a = 2 * i + 1;
            else
                a = 2 * i;
 
            // compare this to children
            if ( lessThan( items[a], items[i] ) )
            {
                obj = items[i];
                items[i] = items[a];
                items[a] = obj;
                i = a;
            }
            else
                break;
        }
    }
 
 
    public void reheapUp()
    {
        for ( int i = numItems - 1; i > 1; i /= 2 )
        {
            Object obj;
 
            // compare this to parent
            if ( lessThan( items[i], items[i / 2] ) )
            {
                obj = items[i / 2];
                items[i / 2] = items[i];
                items[i] = obj;
            }
            else
                break;
        }
    }

    private void growCapacity()
    {
        Object[] tempItems = new Object[2 * items.length - 1];
        System.arraycopy(items, 0, tempItems, 0, items.length);
        items = tempItems;
    }

    /**
    returns the String containing all the elements in level order
    @return the String containing all the elements in level order
     */
    public String toString()
    {
        String str = "";
        for ( int i = 1; i < numItems - 1; i++ )
        {
            str += items[i];
        }
        return str;
    }
}

