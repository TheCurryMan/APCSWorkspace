// Implements the list of messages for teletext

import java.awt.Graphics;


public class TeletextList
{
    private ListNode2<String> heading, topNode;


    /**
     * Creates a circular list of headlines. First creates a circular list with
     * one node, "Today's headlines:". Saves a reference to that node in
     * heading. Adds a node holding an empty string before heading and another
     * node holding an empty string after heading. Appends all the strings from
     * headlines to the list, after the blank line that follows heading,
     * preserving their order. Sets topNode equal to heading.
     * 
     * @param headlines
     *            Strings to add to circular list
     */
    public TeletextList( String[] headlines )
    {
        heading = new ListNode2<String>( "Today's headlines:", null, null );
        heading.setPrevious( new ListNode2<String>( "", null, heading ) );
        heading.setNext( new ListNode2<String>( "", heading, null ) );
        ListNode2<String> tempNode = heading.getNext();

        for ( String msg : headlines)
        {
            tempNode.setNext( new ListNode2<String>( msg, tempNode, null ) );
            tempNode = tempNode.getNext();
        }
        tempNode.setNext( heading.getPrevious() );
        heading.getPrevious().setPrevious( tempNode );

        topNode = heading;
    }


    /**
     * Inserts a node with msg into the headlines list after the blank /line
     * that follows heading.
     * 
     * @param msg
     *            String to add to headlines list
     */
    public void insert( String msg )
    {
        ListNode2<String> tempNode = heading.getNext();
        topNode = tempNode;
        ListNode2<String> newNode = tempNode.getNext();
        ListNode2<String> replace = new ListNode2<String>( msg,
            tempNode,
            newNode );
        tempNode.setNext( replace );
        tempNode = tempNode.getNext().getNext();
        tempNode.setPrevious( replace );

    }


    /**
     * Deletes the node that follows topNode from the headlines list, unless
     * that node happens to be heading or the node before or after heading that
     * holds a blank line.
     */
    public void delete()
    {
        ListNode2<String> tempNode = topNode.getNext();

        if ( tempNode.equals( heading )
            || tempNode.equals( heading.getPrevious() )
            || tempNode.equals( heading.getNext() ) )
        {
            return;
        }

        ListNode2<String> newNode = tempNode.getNext();
        topNode = heading.getNext().getNext();

        heading.getNext().setNext( newNode );
        topNode.setPrevious( newNode );
    }


    /**
     * Scrolls up the headlines list, advancing topNode to the next node.
     */
    public void scrollUp()
    {
        this.topNode = topNode.getNext();
    }


    /*
     * Adds a new node with msg to the headlines list before a given node.
     * Returns a referenece to the added node.
     */
    private ListNode2<String> addBefore( ListNode2<String> node, String msg )
    {
        ListNode2<String> newNode = new ListNode2<String>( msg,
            node.getPrevious(),
            node );
        node.getPrevious().setNext( newNode );
        node.setPrevious( newNode );
        return newNode;
    }


    /**
     * Adds a new node with msg to the headlines list after a given node.
     * Returns a referenece to the added node.
     */
    private ListNode2<String> addAfter( ListNode2<String> node, String msg )
    {
        ListNode2<String> newNode = new ListNode2<String>( msg,
            node.getPrevious(),
            node );
        node.getNext().setNext( newNode );
        node.setNext( newNode );
        return newNode;
    }


    /*
     * Removes a given node from the list.
     */
    private void remove( ListNode2<String> node )
    {
        ListNode2<String> tempNode = heading;
        while ( !tempNode.equals ( node ))
        {
            tempNode = tempNode.getNext();
        }
        ListNode2<String> newNode = tempNode.getNext().getNext();
        tempNode.getPrevious().setNext( newNode );
        newNode.setPrevious( tempNode.getPrevious() );
    }


    /*
     * Draws nLines headlines in g, starting with topNode at x, y and
     * incrementing y by lineHeight after each headline.
     */
    public void draw( Graphics g, int x, int y, int lineHeight, int nLines )
    {
        ListNode2<String> node = topNode;
        for ( int k = 1; k <= nLines; k++ )
        {
            g.drawString( node.getValue(), x, y );
            y += lineHeight;
            node = node.getNext();
        }
    }


    /**
     * Returns a string representation of this TeletextList.
     * 
     * @return a string representation of this TeletextList.
     */
    public String toString()
    {
        String str = getClass().getName() + "[";
        String separator = "";

        for ( ListNode2<String> node = heading; node.getNext() != heading; node = node.getNext() )
        {
            str += ( separator + node.getValue() );
            separator = ", ";
        }

        return str + "]";
    }
}
