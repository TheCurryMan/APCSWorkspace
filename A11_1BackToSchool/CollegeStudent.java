/**
 * This class extends student and makes a collegestudent
 *
 * @author jjiang686
 * @version Oct 14, 2014
 * @author Period: 4
 * @author Assignment: A11_1BackToSchool
 *
 * @author Sources: TODO
 */
public class CollegeStudent extends Student
{
    // TODO instance variables
    private String myMajor = "";

    private int myYear = 0;


    // TODO constructor
    /** serves as the constructor to the collegestudent class
     * @param myName string name
     * @param myAge integer age
     * @param myGender gender string
     * @param myIDNum double gpa
     * @param myGPA int year
     * @param year integer year
     * @param major string major
     */
    public CollegeStudent(
        String myName,
        int myAge,
        String myGender,
        String myIDNum,
        double myGPA,
        int year,
        String major )
    {
        super( myName, myAge, myGender, myIDNum, myGPA );
        this.myMajor = major;
        this.myYear = year;
    }
    
    /**
     * gets major
     * @return string of collegestudent
     */
    public String getMajor()
    {
        return myMajor;
    }
    
    /**
     * sets major
     * @param major of student
     */
    public void setMajor(String major)
    {
        this.myMajor = major;
    }
    
    /**
     * gets year
     * @return int year
     */
    public int getYear()
    {
        return myYear;
    }
    
    /**
     * sets year
     * @param year of student
     */
    public void setYear(int year )
    {
        this.myYear = year;
    }


    /**
     * Returns a String representation of this class.
     * 
     * @return private instance data as a String
     */
    public String toString()
    {
        return super.toString() + ", year: " + myYear + ", major: " + myMajor;
    }
}
