/**
 * TODO Write a one-sentence summary of your class here. TODO Follow it with
 * additional details about its purpose, what abstraction it represents, and how
 * to use it.
 *
 * @author jjiang686
 * @version Oct 13, 2014
 * @author Period: 4
 * @author Assignment: A11_1BackToSchool
 *
 * @author Sources: TODO
 */
public class Teacher extends Person
{
    private String mySubject = "";
    private double mySalary = 0;


    /** this is the constructor for teacher 
     * @param myName string myname
     * @param myAge int my age 
     * @param myGender string mygender 
     * @param subject string subject
     * @param salary double salary
     */
    public Teacher(
        String myName,
        int myAge,
        String myGender,
        String subject,
        double salary )
    {
        super(myName, myAge, myGender);
        this.mySubject = subject;
        this.mySalary = salary;
    }
    
    
    
    /**
     * gets subject
     * @return string subject
     */
    public String getSubject()
    {
        return mySubject;
  
    }
    
    /**
     * sets subject
     * @param subject string
     */
    public void setSubject(String subject)
    {
        this.mySubject = subject;
    }
    
    /**
     * gets salary
     * @return double salary
     */
    public double getSalary()
    {
        return mySalary;
        
    }
    
    /**
     * sets salary
     * @param salary double
     */
    public void setSalary( double salary)
    {
        this.mySalary = salary;
    }
    // TODO methods

    /**
     * Returns a String representation of this class.
     * 
     * @return private instance data as a String
     */
    public String toString()
    {
        return super.toString() + ", subject: " + mySubject + ", salary: "
            + mySalary;
    }
}
