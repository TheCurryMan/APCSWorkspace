import java.util.Stack;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
   Implements a BST with TreeNode nodes.

   @author  Jessica Jiang
   @version January 26, 2015

   @author  Period - 4
   @author  Assignment - TODO Assignment Name

   @author  Sources - TODO list collaborators
   
   MyTreeSetIterator:

    declare a Stack of TreeNode
    declare a variable tNode of type TreeNode

    constructor
      initialize stack as empty
      initialize tNode to root

      while tNode is not null
        push a copy of tNode onto the stack
        set tNode to tNode�s left subtree

    hasNext
      false if stack is empty

    next
      if the stack is empty
        throw NoSuchElement Exception
     
      reposition tNode by popping the stack
      Object obj = tNode.getValue()
      move tNode one node to right

      while tNode is not null
        push a copy of tNode onto the stack
        set tNode to tNode�s left subtree

      return obj

    remove
      not supported
 */
public class MyTreeSet<E> implements Iterable<E>
{
    /**
     * declare a Stack of TreeNode
    declare a variable tNode of type TreeNode
     */
    private TreeNode<E> root; // holds the root of this BST

    
    // Constructor: creates an empty BST.
    /**
     * constructor
      initialize stack as empty
      initialize tNode to root
     */
    public MyTreeSet()
    {
        root = null;
    }

    // Returns true if this BST contains value; otherwise returns false.
    public boolean contains( E value )
    {
        return contains( root, value );
    }

    // Adds value to this BST, unless this tree already holds value.
    // Returns true if value has been added; otherwise returns false.
    public boolean add( E value )
    {
        if ( contains( value ) )
            return false;
        root = add( root, value );
        return true;
    }

    // Removes value from this BST. Returns true if value has been
    // found and removed; otherwise returns false.
    public boolean remove( E value )
    {
        if ( !contains( value ) )
            return false;
        root = remove( root, value );
        return true;
    }

    // Returns a string representation of this BST.
    public String toString()
    {
        String str = toString( root );
        if ( str.endsWith( ", " ) )
            str = str.substring( 0, str.length() - 2 );
        return "[" + str + "]";
    }

    // Returns an iterator for this BST.
    public Iterator<E> iterator()
    {
        /**TODO://create an iterator */
        
        return null; // Fix this!!
    }

    //*************** Private helper methods: *********************

    // Returns true if the BST rooted at node contains value;
    // otherwise returns false (recursive version).
    private boolean contains( TreeNode<E> node, E value )
    {
        if ( node == null )
            return false;
        else
        {
            int diff = ( (Comparable<E>)value ).compareTo( node.getValue() );
            if ( diff == 0 )
                return true;
            else if ( diff < 0 )
                return contains( node.getLeft(), value );
            else // if (diff > 0)
                return contains( node.getRight(), value );
        }
    }

/*
    // Iterative version:
    private boolean contains(TreeNode<E> node, E value)
    {
      while (node != null)
      {
        int  diff = ( (Comparable<E>)value).compareTo( node.getValue() );
        if (diff == 0)
          return true;
        else if (diff < 0)
          node = node.getLeft();
        else // if (diff > 0)
          node = node.getRight();
      }
      return false;
    }
*/

    // Adds value to the BST rooted at node. Returns the
    // root of the new tree. 
    // Precondition: the tree rooted at node does not contain value.
    private TreeNode<E> add( TreeNode<E> node, E value )
    {
        if ( node == null )
            node = new TreeNode( value );
        else
        {
            int diff = ( (Comparable<E>)value ).compareTo( node.getValue() );
            if ( diff < 0 )
                node.setLeft( add( node.getLeft(), value ) );
            else // if (diff > 0)
                node.setRight( add( node.getRight(), value ) );
        }
        return node;
    }

    // Removes value from the BST rooted at node.
    // Returns the root of the new tree.
    // Precondition: the tree rooted at node contains value.
    private TreeNode<E> remove( TreeNode<E> node, E value )
    {
        int diff = ( (Comparable<E>)value ).compareTo( node.getValue() );
        if ( diff == 0 ) // base case
            node = removeRoot( node );
        else if ( diff < 0 )
            node.setLeft( remove( node.getLeft(), value ) );
        else // if (diff > 0)
            node.setRight( remove( node.getRight(), value ) );
        return node;
    }

    // Removes the root of the BST rooted at root
    // replacing it with the smallest node from the right subtree.
    // Returns the root of the new tree.
    private TreeNode<E> removeRoot(TreeNode<E> root)
    {
        TreeNode<E> node1 = root.getRight();
        TreeNode<E> node2 = root.getLeft();

          if ( node1 == null )
          {
            return node2;
          }
          else if ( node2 == null )
          {
            return node1;
          }
          else if ( node2.getRight() == null )
          {
              root.setValue( root.getLeft().getValue() );
              root.setLeft( root.getLeft().getLeft() );
            return root;
          }
          else  // left child has right child
          { 
            TreeNode<E> marker = root.getLeft();
            while ( marker.getRight().getRight() != null )
              marker = marker.getRight();
            root.setValue( marker.getRight().getValue() );
            marker.setRight( marker.getRight().getLeft() );
            return root;
          }
        //return node;
    }

    // Utility routine to print the structure of the BST
    public void printSideways()
    {
        if (root == null)
            return;
        printSideways(root, 0);
    }

    // Precondition: original argument != null
    private void printSideways( TreeNode<E> t, int depth )
    {
        if ( t.getRight() != null )
            printSideways( t.getRight(), depth + 1 );

        process( t.getValue(), depth );

        if ( t.getLeft() != null )
            printSideways( t.getLeft(), depth + 1 );
    }

    // Simply display the toString version of my_data
    private void process( E obj, int depth )
    {
        for ( int j = 1; j <= depth; j++ )
            System.out.print( "    " );
        System.out.println( obj.toString() );
    }

    // Returns a string representation of the tree rooted at node.
    private String toString( TreeNode<E> node )
    {
        if ( node == null )
            return "";
        else
            return toString( node.getLeft() ) + node.getValue() + ", "
                + toString( node.getRight() );
    }

    // Implements an Iterator for this tree.
    private class MyTreeSetIterator implements Iterator<E>
    {
        private TreeNode<E> tNode;
        private Stack<TreeNode> stack;

        //Stack<TreeNode> newNode = new Stack<TreeNode>(null);
        public MyTreeSetIterator( TreeNode<E> root )
        {
            tNode = root;
            Stack<TreeNode> 
            
            while (tNode != null)
            {
                
            }
            
        }

        public boolean hasNext()
        {
            if (stack.isEmpty())
            {
                return false;
            }
            return true; // Fix this!!
        }

        public E next()
        {
            if (stack.isEmpty())
            {
                throw new NoSuchElementException();
            }
        }

        public void remove()
        {
            throw new UnsupportedOperationException();
        }
    }

    //************************** main: **************************

    public static void main(String[] args)
    {
        String[] words = {"One", "Two", "Three", "Four", "Five",
            "Six", "Seven", "Eight", "Nine", "Ten"};
        MyTreeSet bst = new MyTreeSet();

        for (String word : words)
        {
            System.out.println("Added: " + word + " " + bst.add(word));
            System.out.println("Contains: " + word + " " + bst.contains(word));
            if(bst.add(word))
                System.out.println("*** Added a duplicate value ***");
            System.out.println(bst);
        }
        bst.printSideways();

        System.out.println("Traversal with an iterator:");
        for (Object obj : bst)
            System.out.print(obj + " ");
        System.out.println();

        for (String word : words)
        {
            System.out.println("Removed: " +  word + " " + bst.remove(word));
            if(bst.remove(word))
                System.out.println("*** Removed a non-existent value ***");
            System.out.println(bst);
            bst.printSideways();
        }
    }
}
