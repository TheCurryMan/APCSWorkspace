import java.util.*;

public class TestList
{
    /**
        Demonstrates use of the SinglyLinkedList class
        @param args  command-line arguments (not used)
     */
    public static void main( String[] args )
    {
        String[] str = {"apple", "banana", "newt", "aardvark"};

        SinglyLinkedList<String> slist = new SinglyLinkedList<String>(str);

        for(String s : slist)
        {
            System.out.print(s + " ");
        }

        //    Iterator<String> iter = slist.iterator();
        //    
        //    while(iter.hasNext())
        //    {
        //      System.out.print(iter.next() + " ");
        //    }
        System.out.println();

        slist.add("gnu");
        System.out.println(slist);

        if (slist.contains("newt"))
        {
            System.out.println("list contains " + slist.get(slist.indexOf("newt")));
        }

        slist.remove("newt");
        System.out.println("indexof(\"newt\") returns " + slist.indexOf("newt"));

        System.out.println("slist.get(0) = " + slist.get(0));

        slist.set(1, "giraffe");
        System.out.println(slist);
        System.out.println("slist.get(1) = " + slist.get(1));

        slist.add(3, "zebra");
        System.out.println(slist);

        slist.remove(2);
        System.out.println(slist);

        System.out.println("slist.get(1) = " + slist.get(1));

        slist.set(1, "elephant");
        System.out.print("List after slist.set(1, \"elephant\"): ");
        System.out.println(slist);

        slist.add(1, "bear");
        System.out.print("List after slist.add(1, \"bear\"): ");
        System.out.println(slist);

        slist.remove("zebra");
        System.out.print("List after slist.remove(1, \"zebra\"): ");
        System.out.println(slist);
    }
}
/*
apple banana newt aardvark 
[apple, banana, newt, aardvark, gnu]
list contains newt
indexof("newt") returns -1
slist.get(0) = apple
[apple, giraffe, aardvark, gnu]
slist.get(1) = giraffe
[apple, giraffe, aardvark, zebra, gnu]
[apple, giraffe, zebra, gnu]
slist.get(1) = giraffe
List after slist.set(1, "elephant"): [apple, elephant, zebra, gnu]
List after slist.add(1, "bear"): [apple, bear, elephant, zebra, gnu]
List after slist.remove(1, "zebra"): [apple, bear, elephant, gnu]
 */