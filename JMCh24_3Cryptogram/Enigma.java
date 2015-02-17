import java.util.Arrays;

/**
   TODO Write a one-sentence summary of your class here.
   TODO Follow it with additional details about its purpose, what abstraction
   it represents, and how to use it.

   @author  Jessica Jiang
   @version February 10th, 2015

   @author Period - 4
   @author Assignment - JM 24.3 Lab: Cryptogram Solver

   @author Sources - TODO list collaborators
 */
public class Enigma
{
    private char[] lookupTable;
    //private static final String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public Enigma(int numLetters)
    {
        lookupTable = new char[numLetters];
            
    }

    public void setSubstitution(int index, char ch)
    {
        lookupTable[index] = ch;
    }

    public String decode(String text)
    {
        StringBuffer buffer = new StringBuffer( text.length() );
        char character;
        int i = 0;
 
        for ( int index = 0; index < text.length(); index++ )
        {
            character = text.charAt( index );
 
            if ( Character.isLowerCase( character ) )
            {
                i = Character.getNumericValue( text.charAt( index ) )
                    - Character.getNumericValue( 'a' );
                buffer.append( ( "" + lookupTable[i] ).toLowerCase() );
            }
            else if ( Character.isUpperCase( character ) )
            {
                i = Character.getNumericValue( text.charAt( index ) )
                    - Character.getNumericValue( 'A' );
                buffer.append( ( "" + lookupTable[i] ).toUpperCase() );
            }
            else
            {
                buffer.append( character );
            }
 
        }
        return buffer.toString();
    }

    public String getHints(String text, String lettersByFrequency)
    {
        String hints = "";
        
        int[] counts = countLetters( text );
        int rank;
 
        for ( int k = 0; k < counts.length; k++ )
        {
            rank = 0;
 
            for ( int i = 0; i < counts.length; i++ )
            {
                if ( counts[i] < counts[k] || counts[i] == counts[k] && i < k )
                {
                    rank++;
                }
            }
            hints += lettersByFrequency.charAt( rank );
        }
        return hints;
    }

    private int[] countLetters(String text)
    {
        int[] counts = new int[lookupTable.length];
        
        for ( char c : text.toCharArray() )
        {
            if ( c >= 'A' && c <= 'Z' )
            {
                counts[c - 'A']++;
 
            }
            else if ( c >= 'a' && c <= 'z' )
            {
                counts[c - 'a']++;
            }
        }
 
        return counts;
    }

    //*************************************************************
    // For test purposes only
    // not to be used in solution implementation

    protected char[] getLookupTable()
    {
        return lookupTable;
    }

    protected int[] getCountLetters(String text)
    {
        return countLetters(text);
    }

}