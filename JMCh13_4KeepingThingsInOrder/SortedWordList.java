/**
 * Implements a sorted list of words
 * 
 * @author Jessica Jiang
 * @version November 21st
 * @author Period - TODO Your Period
 * @author Assignment - Java Methods 13.4 Lab: Keeping Things in Order
 * @author Sources - TODO list collaborators
 */
public class SortedWordList extends java.util.ArrayList<String>
{
    public SortedWordList()
    {
        super();
    }


    public SortedWordList( int capacity )
    {
        super( capacity );
    }


    public int indexOf( String word )
    {
        int small = 0;
        int most = size() - 1;
        int mid;
        while ( small <= most )
        {
            mid = ( small + most ) / 2;
            int x = word.compareToIgnoreCase( get( mid ) );
            if ( x > 0 )
            {
                small = mid + 1;
            }
            else if ( x < 0 )
            {
                most = mid - 1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }


    public boolean contains( String word )
    {
        return indexOf( word ) >= 0;
    }


    public String set(int i, String word) 
    {
        String a;
        if (i == 0 && word.compareTo(this.get(i + 1)) < 0) 
        {
            a = super.set(i, word);
        } 
        else if (word.compareTo(this.get(i - 1)) > 0
                && word.compareTo(this.get(i + 1)) < 0) 
        {
            a = super.set(i, word);
        } 
        else
        {
            throw new IllegalArgumentException("word =" + word + " i =" + i);
        }
        return a;
    }


    public void add( int i, String word )
    {
        if ( ( i > 0 && word.compareToIgnoreCase( get( i - 1 ) ) <= 0 )
            || ( i < size() - 1 && word.
                            compareToIgnoreCase( get( i ) ) >= 0 ) )
            throw new IllegalArgumentException( "word = " + word + "\ni = "
                + i );

        super.add( i, word );
    }


    public boolean add( String word )
    {
        int small = 0;
        int most = size();
        int middle;

        while ( small < most )
        {
            middle = ( small + most ) / 2;
            int x = word.compareToIgnoreCase( get( middle ) );

            if ( x > 0 )
            {
                small = middle + 1;
            }
            else if ( x < 0 )
            {
                most = middle;
            }
            else
            {
                return false;
            }
        }
        super.add( most, word );

        return true;
    }
    
    public void merge(SortedWordList a) 
    {
        for (String x : a) 
        {
            add(x);
        }
    }

/**
    public void merge( SortedWordList extra )
    {
        int a = size() - 1;
        int b = extra.size() - 1;

        int num = a;
        int secondnum = b;
        int count = 0;

        while ( secondnum > 0 )
        {

*/

}
