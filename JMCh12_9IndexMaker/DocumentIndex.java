import java.util.ArrayList;

public class DocumentIndex extends ArrayList<IndexEntry>
{
    //  Creates an empty DocumentIndex with the default
    // initial capacity.
    public DocumentIndex()
    {
       super();
    }

    //  Creates an empty DocumentIndex with a given
    //  initial capacity.
    public DocumentIndex(int initialCapacity)
    {
        super( initialCapacity );
    }

    //  If word is not yet in this DocumentIndex,
    //  creates a new IndexEntry for word, and inserts
    //  it into this list in alphabetical order;
    //  adds num to this word's IndexEntry by calling
    //  its add(num) method.
    //  call foundOrInserted
    public void addWord(String word, int num)
    {
        get( foundOrInserted( word ) ).add( num );
    }

    //  For each word in str, calls addWord(word, num).
    //  use a for each loop, skip empty strings and do not call addWord for them
    public void addAllWords(String str, int num)
    {
        String[] words = str.split(  "\\W+" );
        for( String word : words )
        {
            if( word.length() > 0 )
            {
                addWord( word, num );
            }
        }
    }

    // Tries to find an EndexEntry with a given word in this
    // DocumentIndex.  If not found, inserts a new EndexEntry for
    // word at the appropriate place (in lexicographical order).
    // Returns the index of the found or inserted IndexEntry
    private int foundOrInserted(String word)
    {
        int num;
        int num1;
        for ( num = 0; num < size(); num++ )
        {
            num1 = get( num ).getWord().compareToIgnoreCase( word );
            if( num1 == 0 )
            {
                return num;
            }
            else if ( num1 > 0 )
            {
                break;
            }
        }
        add( num, new IndexEntry( word ) );
        return num;
    }
}
