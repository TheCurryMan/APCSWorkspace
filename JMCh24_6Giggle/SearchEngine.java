import java.util.*;

/**
   TODO Write a one-sentence summary of your class here.
   TODO Follow it with additional details about its purpose, what abstraction
   it represents, and how to use it.

   @author  Jessica Jiang
   @version February 24, 2015

   @author Period - 4
   @author Assignment - JM24.6 - Search Engine

   @author Sources - TODO list collaborators
 */
public class SearchEngine
{
    // Instance variable(s)
    private String myURL; // holds the name for the "url" (file name)
    private Map<String, List<String>> myIndex; // holds the word index

    // Constructor(s)
    public SearchEngine( String url ) 
    { 
        myURL = url; 
        myIndex = new HashMap( 20000 ); 
    } 
   
   
    public String getURL() 
    { 
        return myURL; 
    } 
 
    // Methods
   
    public void add( String line ) 
    { 
        Set<String> list = parseWords( line ); 
        for ( String string : list ) 
        { 
            LinkedList<String> temp = new LinkedList<String>(); 
            if ( !myIndex.containsKey( string ) ) 
            { 
                myIndex.put( string, temp ); 
            } 
            myIndex.get( string ).add( line ); 
        } 
    } 
   
   
    public List<String> getHits( String word ) 
    { 
        return myIndex.get( word ); 
    } 
   
   
    private Set<String> parseWords( String line ) 
    { 
        String[] temp = line.split( "\\W+" ); 
        TreeSet<String> words = new TreeSet<String>(); 
        for ( String string : temp ) 
        { 
            if ( !string.isEmpty() ) 
            { 
                string = string.toLowerCase();
                words.add( string );
            } 
        } 
        return words; 
    } 

    //*************************************************************
    // For test purposes only
    // not to be used in solution implementation
    public Map<String, List<String>> getIndex()
    {
        return myIndex;
    }
}
