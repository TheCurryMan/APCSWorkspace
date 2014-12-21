// Implements an iterator for a SinglyLinkedList.
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SinglyLinkedListIterator<E> implements Iterator<E>
{
    private ListNode<E> nextNode;

    // Constructor
    public SinglyLinkedListIterator( ListNode<E> head )
    {
        nextNode = head;
    }

    public boolean hasNext()
    {
        return nextNode != null;
    }

    public E next()
    {
        if ( nextNode == null )
            throw new NoSuchElementException();

        E value = nextNode.getValue();
        nextNode = nextNode.getNext();
        return value;
    }

    // Not implemented.
    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
