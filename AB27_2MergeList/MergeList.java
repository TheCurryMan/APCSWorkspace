import java.util.*;
import java.io.*;

/**
   Implements a recursive mergesort on a LinkedList data type
   
   http://205.173.41.10/ICTLessons/LessonAB27/Lab-AB27-2.html

   @author  Jessica Jiang
   @version December 3rd

   @author Period - 4
   @author Assignment - AB27.1 MergeList

   @author Sources - TODO List Collaborators
 */
public class MergeList
{
    private Scanner inFile;
    private String myFile;

    /**
     * Open a file containing id/inventory pairs of data
     * 
     * @param fileName  File to be opened
     */
    public MergeList( String fileName )
    {
        myFile = fileName;
    }
    
    public static void main( String[] args )
    {
        
        MergeList mList = new MergeList( "file20.txt" );
        LinkedList<Item> list = new LinkedList<Item>();

        System.out.println( "Original list\n" );
        mList.readData( list );
        mList.printList( list );

        System.out.println( "List after MergeSort\n" );
        list = mList.mergeSort( list );
        mList.printList( list );

        System.out.println( "Reversed list\n" );
        list = mList.reverseList( list );
        mList.printList( list );
        
    }

    /**
     * Reads a file containing id/inv data pairs. The first line of the file
     * contains the number of id/inventory integer pairs listed on subsequent
     * lines.
     * 
     * @param list  Reference to LinkedList<Item> to which data will be added
     */
    public void readData( LinkedList<Item> list )
    {
        int id;
        int inv;

        try
        {
            inFile = new Scanner( new File( myFile ) );
            while ( inFile.hasNext() )
            {
                id = inFile.nextInt();
                inv = inFile.nextInt();
                list.addFirst( new Item( id, inv ) );
            }
        }
        catch ( IOException i )
        {
            System.out.println( "Error: " + i.getMessage() );
        }
    }

    /**
     * Prints contents of list
     * 
     * @param list  LinkedList<Item> to be printed
     */
    public void printList( LinkedList<Item> list )
    {
        Iterator<Item> iter = list.iterator();

        System.out.printf( "%5s%16s", "Id", "Inventory\n" );
        while ( iter.hasNext() )
        {
            Item temp = iter.next();
            System.out.printf( "%7d%10d\n", temp.getId(), temp.getInv() );
        }
        System.out.println();
    }

    /**
     * Splits listA into two parts. listA retains the first half of the list,
     * listB contains the last half of the original list.
     * 
     * @param listA  Original list. reduced by half after split.
     * @param listB  Contains last half of the original list
     */
    public void split( LinkedList<Item> listA, LinkedList<Item> listB )
    {
        // Debug message for stub routine - remove when method is complete
        System.out.println( "split" );

        Iterator<Item> iter = listA.listIterator(listA.size() / 2 );
        
        while (iter.hasNext() ) {
            Item word = iter.next();
            iter.remove();
            listB.add(word);
        }
    }

    /**
     * Two linked lists listA and listB are merged into a single linked list
     * mergedList. They are placed in mergedList starting with the smallest item
     * on either list and continue working up to to largest item.
     * 
     * @param listA  LinkedList<Item> in nondecreasing order
     * @param listB  LinkedList<Item> in nondecreasing order
     * @return LinkedList<Item> containing all the values from lists listA
     *         and listB, in nondecreasing order
     */
    public LinkedList<Item> merge(
        LinkedList<Item> listA,
        LinkedList<Item> listB )
    {
        // Debug message for stub routine - remove when method is complete
        System.out.println( "merge" );

        // make sure the target list is empty
        LinkedList<Item> mergedList = new LinkedList<Item>();

        ListIterator<Item> a = listA.listIterator();
        ListIterator<Item> b = listB.listIterator();
        
        while (a.hasNext() && b.hasNext() ) 
        {
            int pos1 = a.nextIndex();
            int pos2 = b.nextIndex();
            
            Item first = listA.get( pos1 );
            Item second = listB.get( pos2 );
            
            if (first.compareTo(second) <= 0)
            {
                mergedList.add( first );
                first = a.next();
            }
            else
            {
                mergedList.add( second );
                second = b.next();
            }
        }
        
        while (a.hasNext() )
        {
            Item word = a.next();
            mergedList.add(word);
        }
        
        while (b.hasNext ())
        {
            Item word = b.next();
            mergedList.add(word);
        }

        return mergedList;
    }

    /**
     * The linked list is returned in sorted order. Sorted order has the smallest
     * item first and the largest item last. The ordering is determined by the
     * order defined in the Comparable class. The method uses the mergesort
     * technique and must be recursive.
     * 
     * @param listA  LinkedList<Item> to be sorted
     * @return LinkedList<Item> in sorted (nondecreasing) order
     */
    public LinkedList<Item> mergeSort( LinkedList<Item> listA )
    {
        LinkedList<Item> listB = new LinkedList<Item>();

        if ( listA == null )
        {
            return null;
        }

        // Don't sort an empty list or a list with one node
        if ( listA.size() <= 1 )
        {
            return listA;
        }

        // Split the list in half. If uneven then make left one larger.
        split( listA, listB );

        return merge( mergeSort( listA ), mergeSort( listB ) );
    }

    /**
     * Reverses the order of a list
     * 
     * @param list  LinkedList<Item> to be reversed
     * @return LinkedList<Item> in reverse order
     */
    public LinkedList<Item> reverseList( LinkedList<Item> list )
    {
        // Debug message for stub routine - remove when method is complete
        System.out.println( "reverseList" );

        LinkedList<Item> reversedList = new LinkedList<Item>();

        while (!list.isEmpty())
        {
            Item last = list.getLast();
            reversedList.add(last);
            list.remove(list.indexOf( last ));
        }

        return reversedList;
    }
}
