import java.util.*;


/**
 * Java Methods Chapter 12
 * Exercises 1-9, 11-14, 17, 18, 20, 26 & 27
 * 
 * @author TODO Your Name
 * @version TODO Date
 * 
 * @author Period - TODO Your Period
 * @author Assignment - JMCh12Exercises
 * 
 * @author Sources - TODO list collaborators
 */
public class JMCh12Exercises
{
    Scanner scan;

    /**
     * Constructs a Scanner for input from the console.
     */
    public JMCh12Exercises()
    {
        scan = new Scanner( System.in );
    }

    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * 
     * @param str  input for the various methods
     */
    public JMCh12Exercises( String str )
    {
        scan = new Scanner( str );
    }

    // 12-1(a)
    // Write a statement that declares an array of three integers,
    // initialized to 1, 2, and 4.
    public int[] arrayOf3Ints( )
    {
        return null;  // TODO fix this
    }

    // 12-1(b)
    // Write an expression that represents the sum of the three elements
    // of the above array (regardless of their current values)
    public int sumOfArrayOf3Ints()
    {
        return 0;  // TODO fix this!!
    }

    // 12-2a, b, c, d
    // Mark true or false and explain:
    //  (a) The following array has 101 elements:
    //        int[] x = new int[100];     
    //  (b) Java syntax allows programmers to use any expression of the
    //      int data type as an array subscript.        
    //  (c) The program, when running, verifies that all array subscripts
    //      fall into the valid range.          
    //  (d) Any one-dimensional array object has a length method that
    //      returns the size of the array.          
    public boolean[] prob2abcdTrueFalse()
    {
        // return a boolean array with answers corresponding
        // to question (a) - (d)
        return new boolean[]{}; // TODO fix this!!
    }

    // 12-3
    // Write a method that takes an array of integers and swaps the
    // first element with the last one.
    public void swapFirstLast( int[] a )
    {
        // TODO complete method
    }

    
    // 12-4
    // An array of integers scores has at least two elements,
    // and its elements are arranged in ascending order
    // (i.e. scores[i] <= scores[i+1]). Write a condition that tests
    // whether all the elements in scores have the same values.
    // (Hint: you do not need iterations.)
    public boolean allElementsSame( int[] scores )
    {
        return false;  // TODO fix this!!
    }

    // 12-5
    // Write a method getRandomRps that returns a character 'r', 'p',
    // or 's', chosen randomly with odds of 3 : 5 : 6, respectively.
    // (Hint: declare an array of chars and initialize it with values
    // 'r', 'p', and 's', with each value occurring a number of times
    // proportional to its desired odds. Return a randomly chosen
    // element of the array.)
    public char getRandomRps()
    {
        // TODO complete the method
        
        return '\0';  // TODO fix this!!
    }

    private int mysteryCount( int[] v )
    {
        int n = v.length, count = 0;

        for ( int i = 0; i < n; i++ )
        {
            if ( v[i] != 0 )
                break;
            count++;
        }
        return count;
    }


    // 12-6
    // What does the mysteryCount method count?
    public String whatDoesMysteryCountCount()
    {
        int[] v = {0, 0, 0, 1, 1, 2, 0, 0, 3, 4, 0, 0};
        int mCount = mysteryCount( v );
        
        // TODO: replace empty string with answer
        String answer = mCount + ""; 
        
        return answer;
    }

    // 12-7
    // If you take any two positive integers m and n (m > n), then
    // the numbers a, b, and c, where
    //
    //     a =m^2 - n^2 ; b = 2mn; c =m^2 + n^2
    //
    // form a Pythagorean triple:
    //
    //     a^2 + b^2 = c^2
    //
    // You can use algebra to prove that this is always true.
    //
    // Write a method makePythagoreanTriple that takes two integer
    // arguments, m and n, swaps them if necessary to make m > n,
    // calculates the Pythagorean triple using the above expressions,
    // places the resulting values a, b, and c into a new array of
    // three elements, and returns that array. Test your method in
    // a simple program.
    public static int[] makePythagoreanTriple( int m, int n )
    {
        // TODO complete method
        
        return null;  // TODO fix this!!
    }


    // 12-8
    // Complete the following method:
    //
    // Returns an array filled with values
    // 1, 2, ..., n-1, n, n-1, ..., 2, 1.
    public static int[] createWedge(int n)
    {
        // TODO complete method
        
        return null;  // TODO fix this!!
    }

    // 12-9
    // In SCRABBLE, different letters are assigned different numbers of points:
    //
    //  A - 1   E - 1   I - 1   M - 3   Q - 10  U - 1   X - 8
    //  B - 3   F - 4   J - 8   N - 1   R - 1   V - 4   Y - 4
    //  C - 3   G - 2   K - 5   O - 3   S - 1   W - 4   Z - 10
    //  D - 2   H - 4   L - 1   P - 3   T - 1       
    //
    public static int[] letterScores =
        { 1, 3, 3, 2,
          1, 4, 2, 4,
          1, 8, 5, 1,
          3, 1, 3, 3,
          10, 1, 1, 1,
          1, 4, 4,
          8, 4, 10 };

    public static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    
    // Write a method computeScore(String word) that returns the score
    // for a word without using either if or switch statements.
    // (Hint: find the position of a given letter in the alphabet string
    // by calling indexOf; get the score for that letter from the array
    // of point values, and add to the total.)
    public static int computeScore( String word )
    {
        // TODO complete method
        
        return 0;  // TODO fix this!!
    }
    
    // 12-11a, b, c, d, e
    // Mark true or false and explain:
    //   (a) An ArrayList can contain multiple references to the same object.          
    //   (b) The same object may belong to two different ArrayLists.          
    //   (c) ArrayList's remove method destroys the object after it has
    //       been removed from the list.           
    //   (d) ArrayList's add method makes a copy of the object and adds
    //       it to the list.           
    //   (e) Two variables can refer to the same ArrayList. 
    public boolean[] prob11abcdeTrueFalse()
    {
        // return a boolean array with answers corresponding
        // to question (a) - (e)
        return new boolean[]{};  // TODO fix this
    }

    // 12-12
    // Write a method that takes an ArrayList and returns a new ArrayList
    // in which the elements are stored in reverse order. The original
    // list should remain unchanged.
    public ArrayList<String> reverse( ArrayList<String> list )
    {
        // TODO complete method
        
        return null;  // TODO fix this!!
    }


    // 12-13
    // Write a method that removes the smallest value from an
    // ArrayList<Integer>.
    // (Hint: Integer has a method compareTo(Integer other)
    // that returns the difference of this Integer and other.)
    public void removeMin( ArrayList<Integer> list )
    {
        // TODO complete method
    }

    
    // 12-14
    // Write and test a method.
    //
    //    public void filter(ArrayList<Object> list1, ArrayList<Object> list2)
    //
    // that removes from list1 all objects that are also in list2.
    // Your method should compare the objects using the == operator,
    // not equals.
    // (Hint: the contains and indexOf methods cannot be used.)
    public void filter( ArrayList<Object> list1, ArrayList<Object> list2 )
    {
        // TODO complete method
    }


    // 12-17
    // Find and fix the bug in the following code:
    public static char[] prob17FixBug()
    {
        char[] hello = {' ', 'h', 'e', 'l', 'l', 'o'};
        int i = 0;
        // Shift to the left and append '!':
        while (i < 6)
        {
          hello[i - 1] = hello[i];
          i++;
        }
        hello[5] = '!';
        
        return hello;

    }

    // 12-18
    // Write a method that determines whether a given number is a median
    // for values stored in an array:
    //
    // Returns true if m is a median for values in the array
    // sample, false otherwise. (Here we call m a median if
    // the number of elements that are greater than m is the
    // same as the number of elements that are less than m)
    public boolean isMedian( double[] sample, double m )
    {
        // TODO complete method
        
        return false;  // TODO fix this!!
    }

    // 12-20
    // Fill in the blanks in the following method that returns the
    // average of the two largest elements of an array:
    //
    // Finds the two largest elements in scores
    // and returns their average.
    // Precondition: the size of the array is >= 2.
    public static double averageTopTwo( int[] scores )
    {
        int i, size = scores.length;
        int iMax1 = 0; // index of the largest element
        int iMax2 = 1; // index of the second largest element
        // If scores[iMax2] is bigger than scores[iMax1] --
        //   swap iMax1 and iMax2
        if ( scores[iMax2] > scores[iMax1] )
        {
            i = iMax1;
            //___________________________;
            //___________________________;
        }
        for ( i = 2; i < size; i++ )
        {
            if ( scores[i] > scores[iMax1] )
            {
                //___________________________
                //___________________________
            }
            else if ( false /*_______________________*/ ) 
            {
                //____________________;
            }
        }
        return 0; //_________________________________
    }


    // 12-26
    // A two-dimensional array matrix represents a square matrix with
    // the number of rows and the number of columns both equal to n.
    // Write a condition to test that an element matrix[i][j] lies on
    // one of the diagonals of the matrix.
    public boolean liesOnDiagonal( int[][] matrix, int i, int j )
    {
        int n = matrix.length;

        return false;  // TODO fix this!!

    }
    
    // 12-27
    // Write a method that returns the value of the largest positive
    // element in a 2-D array, or 0 if all its elements are negative:
    //
    // Returns the value of the largest positive element in
    // the matrix m, or 0, if all its elements are negative.
    public static double positiveMax( double[][] m )
    {
        double mMax = 0;
        
        // TODO complete method
        
        return mMax;
    }

    // 12-29
    // Let us say that a matrix (a 2-D array of numbers) m1 "covers"
    // a matrix m2 (with the same dimensions) if m1[i][j] > m2[i][j]
    // for at least half of all the elements in m1. Write the following method:
    //
    // Returns true if m1 "covers" m2, false otherwise.
    // Precondition: m1 and m2 have the same dimensions.
    public static boolean covers( double[][] m1, double[][] m2 )
    {
        // TODO complete method
        
        return false;   // TODO fix this!!
    }

 
    /**
     * Testing method: instantiates a Ch18Ex1to5 object and then invokes
     * each method.
     * 
     * @param args command line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        JMCh12Exercises exercise = new JMCh12Exercises();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "   (1) 12-1(a) arrayOf3Ints()" );
            System.out.println( "   (2) 12-1(b) sumOfArrayOf3Ints()" );
            System.out.println( "   (3) 12-2abcd prob2abcdTrueFalse()" );
            System.out.println( "   (4) 12-3 swapFirstLast( int[] a )" );
            System.out.println( "   (5) 12-4 allElementsSame( int[] scores )" );
            System.out.println( "   (6) 12-5 getRandomRps()" );
            System.out.println( "   (7) 12-6 whatDoesMysteryCountCount()" );
            System.out.println( "   (8) 12-7 makePythagoreanTriple( int m, int n )" );
            System.out.println( "   (9) 12-8 createWedge(int n)" );
            System.out.println( "   (A) 12-9 computeScore( String word )" );
            System.out.println( "   (B) 12-11abcde prob11abcdeTrueFalse()" );
            System.out.println( "   (C) 12-12 reverse( ArrayList<String> list )" ); 
            System.out.println( "   (D) 12-13 removeMin( ArrayList<Integer> list )" ); 
            System.out.println( "   (E) 12-14 filter(ArrayList<Object> list1, ArrayList<Object> list2)" ); 
            System.out.println( "   (F) 12-17 prob17FixBug()" ); 
            System.out.println( "   (G) 12-18 isMedian( double[] sample, double m )" ); 
            System.out.println( "   (H) 12-20 averageTopTwo( int[] scores )" ); 
            System.out.println( "   (I) 12-26 liesOnDiagonal( int[][] matrix, int i, int j )" ); 
            System.out.println( "   (J) 12-27 positiveMax( double[][] m )" ); 
            System.out.println( "   (K) 12-29 covers( double[][] m1, double[][] m2 )" ); 
            System.out.println( "   (Q) Quit" );
            System.out.println();
            System.out.print( "Enter a choice:  " );
            String response = kbd.nextLine();

            if ( response.length() > 0 )
            {
                System.out.println();

                switch ( response.charAt( 0 ) )
                {
                    case '1':
                        System.out.println("arrayOf3Ints() = " +
                            Arrays.toString(exercise.arrayOf3Ints()));
                        break;
                    case '2':
                        System.out.println("sumOfArrayOf3Ints() = " +
                            exercise.sumOfArrayOf3Ints());
                        break;
                    case '3':
                        boolean[] prob2abcdAns = exercise.prob2abcdTrueFalse();
                        System.out.println("prob2abcdTrueFalse() --> " + 
                            Arrays.toString(prob2abcdAns));
                        break;
                    case '4':
                        int[] arr = {1, 3, 2, 4};
                        System.out.println("int[] arr (before) --> " + 
                            Arrays.toString(arr));
                        exercise.swapFirstLast(arr);
                        System.out.println("int[] arr (after)  --> " +
                            Arrays.toString(arr));
                        break;
                    case '5':
                        int[] scores = {99, 99, 99, 98};
                        System.out.println("scores --> " +
                            Arrays.toString(scores));
                        System.out.println("allElementsSame( scores ) = " +
                            exercise.allElementsSame( scores ));
                        scores[scores.length - 1] = 99;
                        System.out.println("scores --> " +
                            Arrays.toString(scores));
                        System.out.println("allElementsSame( scores ) = " +
                            exercise.allElementsSame( scores ));
                        break;
                    case '6':
                        final int ITER = 1000;
                        final double TOTAL_RPS = 14.0;
                        String rps = "rps";
                        int[] odds = new int[3];
                        int badRps = 0;

                        for (int i = 0; i < ITER; i++)
                        {
                            char ch = exercise.getRandomRps();
                            int rpsChar = rps.indexOf( ch );
                            if (rpsChar >= 0)
                            {
                                odds[rpsChar]++;
                            }
                            else
                            {
                                badRps++;
                            }
                        }
                        System.out.println("odds = " + 
                            Math.round(odds[0]*TOTAL_RPS/ITER) + ":" + 
                            Math.round(odds[1]*TOTAL_RPS/ITER) + ":" +
                            Math.round(odds[2]*TOTAL_RPS/ITER));
                        System.out.println("badRps = " + badRps);
                        break;
                    case '7':
                        System.out.println("whatDoesMysteryCountCount() = " +
                            exercise.whatDoesMysteryCountCount());
                        break;
                    case '8':
                        int m = 1;
                        int n = 2;
                        System.out.println("makePythagoreanTriple(" + m + ", " + n + ") --> " +
                            Arrays.toString(exercise.makePythagoreanTriple( m, n )));
                        break;
                    case '9':
                        int maxWedgeVal = 5;
                        System.out.println("createWedge(" + maxWedgeVal + ") --> " +
                            Arrays.toString(exercise.createWedge( maxWedgeVal )));
                        break;
                    case 'A':
                    case 'a':
                        String word = "QUIXOTIC";
                        System.out.println("computeScore(" + word + ") = " +
                            exercise.computeScore( word ));
                        break;
                    case 'B':
                    case 'b':
                        boolean[] prob11abcdeAns = exercise.prob11abcdeTrueFalse();
                        System.out.println("prob11abcdeTrueFalse() --> " + 
                            Arrays.toString(prob11abcdeAns));
                        break;
                    case 'C':
                    case 'c':
                        ArrayList<String> list = new ArrayList<String>();
                        list.add( "first" );
                        list.add( "second" );
                        list.add( "third" );
                        System.out.println("list = " + list);
                        System.out.println("reverse( list ) = " +
                            exercise.reverse( list ));
                        break;
                    case 'D':
                    case 'd':
                        ArrayList<Integer> intList = new ArrayList<Integer>();
                        intList.add( 34 );
                        intList.add( 99 );
                        intList.add( 2 );
                        System.out.println("intList = " + intList);
                        exercise.removeMin( intList );
                        System.out.println("after removeMin( intList ) --> " +
                            intList );
                        break;
                    case 'E':
                    case 'e':
                        ArrayList<Object> list1 = new ArrayList<Object>();
                        list1.add( 34 );
                        list1.add( "third" );
                        list1.add( 99 );
                        list1.add( 2 );
                        ArrayList<Object> list2 = new ArrayList<Object>();
                        list2.add( "first" );
                        list2.add( 99 );
                        list2.add( "third" );
                        System.out.println("list1 = " + list1);
                        System.out.println("list2 = " + list2);
                        exercise.filter(list1, list2);
                        System.out.println("after filter(list1, list2) --> " +
                                        list1 );
                        break;
                    case 'F':
                    case 'f':
                        System.out.println("prob17FixBug() = " +
                            Arrays.toString(exercise.prob17FixBug()));
                        break;
                    case 'G':
                    case 'g':
                        double[] sample = {1.2, 3.4, 4.5, 5.6, 7.8, 9.10, 11.12};
                        double median = 5.6;
                        System.out.println("isMedian(" + Arrays.toString(sample) + ", " +
                            median + ") = " + exercise.isMedian( sample, median ));
                        System.out.println("isMedian(" + Arrays.toString(sample) + ", " +
                            (median-1) + ") = " + exercise.isMedian( sample, median-1 ));
                        break;
                    case 'H':
                    case 'h':
                        int[] scores2 = {34, 89, 56, 80, 99, 78, 64};
                        System.out.println("averageTopTwo(" + Arrays.toString(scores2) +
                            ") = " + exercise.averageTopTwo( scores2 ));
                        break;
                    case 'I':
                    case 'i':
                        int[][] matrix = new int[4][4];
                        int i = 1;
                        int j = 2;
                        System.out.println("liesOnDiagonal(" + i + ", " + j +") = " + 
                            exercise.liesOnDiagonal( matrix, i, j ));
                        i = 0;
                        j = 1;
                        System.out.println("liesOnDiagonal(" + i + ", " + j +") = " + 
                            exercise.liesOnDiagonal( matrix, i, j ));
                        break;
                    case 'J':
                    case 'j':
                        double[][] mat = {
                            {-1.0, -2.2, -3.3},
                            {-4.4, -5.5, -6.6}, 
                            {-7.7, -8.8, -9.9}
                        };

                        System.out.println("positiveMax(\n  " +
                            Arrays.toString(mat[0]) + "\n  " +
                            Arrays.toString(mat[1]) + "\n  " +
                            Arrays.toString(mat[2]) + " ) = " + 
                            exercise.positiveMax( mat));
                        
                        mat[2][1] = 13;
                        System.out.println("positiveMax(\n  " +
                            Arrays.toString(mat[0]) + "\n  " +
                            Arrays.toString(mat[1]) + "\n  " +
                            Arrays.toString(mat[2]) + " ) = " + 
                            exercise.positiveMax( mat));
                        break;
                    case 'K':
                    case 'k':
                        double[][] m1 = {
                            {1.0, 2.2, 3.3},
                            {-4.4, 5.5, -6.6}, 
                            {-7.7, -8.8, 9.9}
                        };
                        
                        double[][] m2 = {
                            {-1.0, -2.2, -3.3},
                            {-4.4, -5.5, -6.6}, 
                            {-7.7, -8.8, -9.9}
                        };

                        System.out.println("covers( m1, m2 ) = " + 
                            exercise.covers( m1, m2));
                        m1[0][0] = -10;
                        System.out.println("covers( m1, m2 ) = " + 
                            exercise.covers( m1, m2));
                        break;
                    default:
                        if ( response.toLowerCase().charAt( 0 ) == 'q' )
                        {
                            done = true;
                        }
                        else
                        {
                            System.out.print( "Invalid Choice" );
                        }
                        break;
                }
            }
        } while ( !done );
        System.out.println( "Goodbye!" );
    }
}
