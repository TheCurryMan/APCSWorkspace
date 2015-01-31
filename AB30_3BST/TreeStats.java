import java.io.*;
import java.util.Scanner;

/**
 * Binary tree lab
 *
 * @author G. Peck
 * @created July 18, 2002
 *
 */
public class TreeStats
{
    private Scanner console;

    public TreeStats()
    {
        console = new Scanner( System.in );
    }

    public void readData( String fileName, MyTreeSet<String> temp )
    {
        Scanner inFile;
        String str;

        try
        {
            inFile = new Scanner( new File( fileName ) );

            while ( inFile.hasNext() )
            {
                str = inFile.nextLine();
                // System.out.print("|"+str+"|");
                temp.add( str );
            }
        }
        catch ( IOException i )
        {
            System.out.println( "Error: " + i.getMessage() );
        }
    }

    private <E> void arrayToTree( MyTreeSet<E> bst, E[] ar )
    {
        for ( E element : ar )
        {
            bst.add( element );
        }
    }

    public void mainMenu()
    {
        int choice;

        Integer[] nums = { 4, 2, 1, 3, 7, 6, 8 };
        MyTreeSet<String> bst = new MyTreeSet<String>();
        MyTreeSet<Integer> intTree = null;

        do
        {
            System.out.println( "\nBinary tree menu\n" );
            System.out.println( "(1) Read from disk" );
            System.out.println( "(2) Print tree preorder" );
            System.out.println( "(3) Print tree inorder" );
            System.out.println( "(4) Print tree postorder" );
            System.out.println( "(5) Count nodes in the tree" );
            System.out.println( "(6) Count the leaves in the tree" );
            System.out.println( "(7) Height of tree" );
            System.out.println( "(8) Width of tree" );
            System.out.println( "(9) Clear tree" );
            System.out.println();
            System.out.println( "(10) Interchange tree" );
            System.out.println( "(11) printLevel" );
            System.out.println( "(12) isAncestor" );
            System.out.println();
            System.out.println( "(21) nodeCounts" );
            System.out.println( "(22) accumulate" );
            System.out.println( "(23) trim" );
            System.out.println( "(24) minMaxAverage" );
            System.out.println();
            System.out.println( "(-1) Quit\n" );
            System.out.print( "Choice ---> " );
            choice = console.nextInt();
            console.nextLine(); // clear out line feed character

            System.out.println();
            switch ( choice )
            {
                case 1:
                    String fileName = "fileA.txt";
                    String str;
                    System.out.print( "Filename to read: " );
                    str = console.nextLine();
                    if ( str.length() > 0 )
                    {
                        fileName = str;
                    }
                    readData( fileName, bst );
                    System.out.println( bst.toString() );
                    bst.printSideways();
                    break;
                case 2:
                    System.out.println();
                    System.out.println( "The tree printed preorder\n" );
                    bst.printPreorder();
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    System.out.println( "The tree printed inorder\n" );
                    bst.printInorder();
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    System.out.println( "The tree printed postorder\n" );
                    bst.printPostorder();
                    System.out.println();
                    break;
                case 5:
                    System.out.println();
                    System.out.print( "Number of nodes in tree = " );
                    System.out.println( bst.countNodes() + "\n" );
                    break;
                case 6:
                    System.out.println();
                    System.out.print( "Number of leaves in tree = " );
                    System.out.println( bst.countLeaves() + "\n" );
                    break;
                case 7:
                    System.out.println();
                    System.out.print( "Height of tree = " );
                    System.out.println( bst.height() + "\n" );
                    break;
                case 8:
                    System.out.println();
                    System.out.print( "Width of tree = " );
                    System.out.println( bst.width() + "\n" );
                    break;
                case 9:
                    System.out.println( "clearTree:\n" );
                    System.out.println( "tree before" );
                    System.out.println( bst.toString() );
                    System.out.println();
                    bst.clearTree();
                    System.out.println( "tree after" );
                    System.out.println( bst.toString() );
                    break;
                case 10:
                    System.out.println( "interchange: " );
                    bst.printSideways();
                    System.out.println();
                    bst.interchange();
                    bst.printSideways();
                    break;
                case 11:
                    System.out.print( "Print which level: " );
                    int level = console.nextInt();
                    console.nextLine(); // clear out line feed character
                    bst.printLevel( level );
                    System.out.println();
                    break;
                case 12:
                    System.out.println( "isAncestor: " );
                    System.out.print( "Enter the ancestor: " );
                    String ancestor = console.nextLine();
                    System.out.print( "Enter the descendant: " );
                    String descendant = console.nextLine();
                    if ( bst.isAncestor( ancestor, descendant ) )
                        System.out.println( ancestor + " is an ancestor of "
                            + descendant );
                    else
                        System.out.println( ancestor
                            + " is not an ancestor of " + descendant );
                    System.out.println();
                    break;
                case 21:
                    System.out.println( "nodeCounts: " );
                    int[] nCounts = bst.nodeCounts();
                    System.out.print( nCounts[0] + " " + nCounts[1] + "\n" );
                    System.out.println();
                    break;
                case 22:
                    System.out.println( "accumulate: " );
                    intTree = new MyTreeSet<Integer>();
                    arrayToTree( intTree, nums );
                    intTree.printSideways();
                    System.out.println();
                    intTree.accumulate();
                    intTree.printSideways();
                    break;
                case 23:
                    System.out.println( "trim: " );
                    intTree = new MyTreeSet<Integer>();
                    arrayToTree( intTree, nums );
                    intTree.printSideways();
                    System.out.println();
                    intTree.trim();
                    intTree.printSideways();
                    break;
                case 24:
                    System.out.println( "minMaxAverage: " );
                    intTree = new MyTreeSet<Integer>();
                    arrayToTree( intTree, nums );
                    intTree.printSideways();
                    System.out.println();
                    double minMaxAvg = intTree.minMaxAverage();
                    System.out.println( "minMaxAvg = " + minMaxAvg );
                    break;
                default:
                    if ( choice >= 0 )
                        System.out.println( "Not a valid choice!\n" );
                    break;
            }
        } while ( choice >= 0 );
    }

    public static void main( String[] args )
    {
        new TreeStats().mainMenu();
    }

}