/**
 *  This is a class that tests the Book class.
 *
 *  @author  Jessica Jiang
 *  @version August 25th, 2014
 *  @author  Period: 4
 *  @author  Assignment: JMCh03Ex11_Book
 *
 *  @author  Sources: TODO list collaborators
 */
public class BookTest
{
    /**
     * The main method in this class checks the Book operations for
     * consistency.
     * @param args is not used.
     */
    public static void main( String[] args )
    {
        Book Andy = new Book (3);
        Andy.getNumPages();
        System.out.println(Andy.getNumPages());
        System.out.println(Andy.getCurrentPage());
        System.out.println(Andy.getNumPages());
        System.out.println(Andy.getCurrentPage());
        System.out.println(Andy.getNumPages());
        System.out.println();

    }
    
    
}
