/**
   Student.java

   Stores the following information about students
      grade
      name (first and last)
      Lynbrook id

 */
public class Student implements Comparable
{
    private String lynbrookId;
    private String firstName;
    private String lastName;
    private int grade;

    public Student( String id, String fName, String lName, int g )
    {
        lynbrookId = id;
        firstName = fName;
        lastName = lName;
        grade = g;
    }

    public Student()
    {
        this( "", "", "", 0 );
    }

    /**
     * TODO Write your method description here.
     * 
     * @param obj
     * @return
     */
    public int compareTo( Object obj )
    {
        Student test = (Student)obj;
        if ( grade - test.grade == 0 )
        {
            return lynbrookId.compareTo( test.lynbrookId );
        }
        return grade - test.grade;
    }

    public Object clone()
    {
        return new Student( lynbrookId, firstName, lastName, grade );
    }

    public String toString()
    {
        return lynbrookId + " " + firstName + " " + lastName + " " + grade;
    }
}
