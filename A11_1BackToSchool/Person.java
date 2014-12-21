
/**
 *  This is the superclass to the student and teacher subclasses. 
 *
 *  @author  jjiang686
 *  @version Oct 13, 2014
 *  @author  Period: 4
 *  @author  Assignment: A11_1BackToSchool
 *
 *  @author  Sources: TODO
 */
public class Person
{
    private String myName;   // name of the person
    private int myAge;       // person's age
    private String myGender; // 'M' for male, 'F' for female

    /**constructor for the person class
     * @param name name
     * @param age age
     * @param gender gender
     */
    public Person( String name, int age, String gender )
    {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    /**
     * Returns the name.
     * @return myName
     */
    public String getName()
    {
        return myName;
    }

    /**
     * Returns the age.
     * @return myAge
     */
    public int getAge()
    {
        return myAge;
    }

    /**
     * Returns the gender.
     * @return myGender
     */
    public String getGender()
    {
        return myGender;
    }

    /**
     * Assigns name to myName
     * @param name of person
     */
    public void setName( String name )
    {
        myName = name;
    }

    /**
     * Assigns age to myAge
     * @param age of person
     */
    public void setAge( int age )
    {
        myAge = age;
    }

    /**
     * TODO Write your method description here.
     * @param gender of person
     */
    public void setGender( String gender )
    {
        myGender = gender;
    }

    /**
     * Returns a String representation of this class.
     * @return private instance data as a String
     */
    public String toString()
    {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}