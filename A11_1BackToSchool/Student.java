
/**
 *  the student class
 *  
 *
 *  @author  jjiang686
 *  @version Oct 13, 2014
 *  @author  Period: 4
 *  @author  Assignment: A11_1BackToSchool
 *
 *  @author  Sources: TODO
 */
public class Student extends Person
{
    private String myIdNum; // Student Id Number
    private double myGPA;   // grade point average

    /** is the student constructor
     * @param name string name
     * @param age int age
     * @param gender string gender 
     * @param idNum string idnum
     * @param gpa double gpa
     */
    public Student( String name, int age, String gender, String idNum,
                    double gpa )
    {
        // use the super class' constructor
        super( name, age, gender );

        // initialize what's new to Student
        myIdNum = idNum;
        myGPA = gpa;
    }

    /**
     * get id num
     * @return string idnum
     */
    public String getIdNum()
    {
        return myIdNum;
    }

    /**
     * gets gpa
     * @return double gpa
     */
    public double getGPA()
    {
        return myGPA;
    }

    /**
     * sets id number
     * @param idNum string idnum
     */
    public void setIdNum( String idNum )
    {
        myIdNum = idNum;
    }

    /**
     * sets gpa
     * @param gpa double gpa
     */
    public void setGPA( double gpa )
    {
        myGPA = gpa;
    }

    /**
     * Returns a String representation of this class.
     * @return private instance data as a String
     */
    public String toString()
    {
        return super.toString() + ", student id: " +
            myIdNum + ", gpa: " + myGPA;
    }
}
