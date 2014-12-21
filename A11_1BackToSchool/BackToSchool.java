/**
 *  TODO Write a one-sentence summary of your class here.
 *  TODO Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author  jjiang686
 *  @version Oct 15, 2014
 *  @author  Period: 4
 *  @author  Assignment: A11_1BackToSchool
 *
 *  @author  Sources: N/A
 */
public class BackToSchool
{
    /**
     * main method for back to school
     * @param args string args
     */
    public static void main( String[] args)
    {
        Person bob = new Person( "Coach Bob", 27, "M" );
        System.out.println( bob );

        Student lynne = new Student( "Lynne Brooke", 16, "F",
            "HS95129", 3.5 );
        System.out.println( lynne );

        Teacher mrJava = new Teacher( "Duke Java", 34, "M",
            "Computer Science", 50000 );
        System.out.println( mrJava );

        CollegeStudent ima = new CollegeStudent( "Ima Frosh", 18, "F",
            "UCB123", 4.0, 1, "English" );
        System.out.println( ima );
    }
}
