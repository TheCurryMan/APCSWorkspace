// Represents a node of a doubly-linked list.
public class ListNode2<E>
{
    private E value;
    private ListNode2<E> previous;
    private ListNode2<E> next;

    // Constructor:
    public ListNode2( E initValue, ListNode2<E> initPrevious,
                      ListNode2<E> initNext )
    {
        value = initValue;
        previous = initPrevious;
        next = initNext;
    }

    public E getValue()
    {
        return value;
    }

    public ListNode2<E> getPrevious()
    {
        return previous;
    }

    public ListNode2<E> getNext()
    {
        return next;
    }

    public void setValue( E theNewValue )
    {
        value = theNewValue;
    }

    public void setPrevious( ListNode2<E> theNewPrev )
    {
        previous = theNewPrev;
    }

    public void setNext( ListNode2<E> theNewNext )
    {
        next = theNewNext;
    }
}
