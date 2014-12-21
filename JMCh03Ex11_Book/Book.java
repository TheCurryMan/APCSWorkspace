/**
 * Creates the Book Class and adds pages to the current page.
 *
 * @author Jessica Jiang
 * @version August 25th, 2014
 * @author Period: 4
 * @author Assignment: JMCh03Ex11_Book
 *
 * @author Sources: TODO list collaborators
 */
public class Book
{
    // initializes the integers
    private int currentPage;
    private int numPages;
    
    //creates a public variable that can be accessed from various classes
    public int getNumPages() {
        return numPages;
    }
    
    public int getCurrentPage() {
        return currentPage;
    }
    
    //creates a public variable that 


    // creates a parameter of the class Book of pages to assign to numPages
    public Book( int pages )
    {
        currentPage = 1;
        numPages = pages;
    }

    // creates a method to add a page to the current number of pages only if the
    // current page is smaller than the number of pages present
    public void nextPage()
    {
        if ( currentPage < numPages )
        {
            currentPage++;
        }
    }

}
