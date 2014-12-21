import java.util.*;

public class TestList
{
    /**
       Test the LinkedListWithTail class
       @param args  command-line arguments (not used)
     */
    public static void main( String[] args )
    {
        String[] str = {"apple", "banana", "newt", "aardvark"};

        LinkedListWithTail<String> sList = new LinkedListWithTail<String>();
        LinkedListWithTail<String> otherList = new LinkedListWithTail<String>();

        sList.add("apple");
        System.out.println(sList.peek());
        
        sList.add("banana");
        sList.add("newt");
        sList.add("aardvark");
        
        otherList.add( sList.remove() );
        System.out.println(sList.peek());
        otherList.add( sList.remove() );
        System.out.println(sList.peek());

        sList.append( otherList );
        
        while (!sList.isEmpty())
        {
            System.out.print(sList.remove() + " ");
        }
        System.out.println();
    }
}

/*
apple
banana
newt
newt aardvark apple banana 
 */