// Author: Java Foundations
public class LinkedQueue<T> implements QueueADT<T> {
    private int count;
    private LinearNode<T> head, tail;

    public LinkedQueue() {
        count = 0;
        head = tail = null;
    }

    public void enqueue(T element) {
        LinearNode<T> node = new LinearNode<T>(element);
        if (isEmpty())
            head = node;
        else
            tail.setNext(node);

        tail = node;
        count++;
    }

    public T dequeue() throws EmptyCollectionException {
        if (isEmpty())
            throw new EmptyCollectionException("queue");

        T result = head.getElement();
        head = head.getNext();
        count--;

        if (isEmpty())
            tail = null;

        return result;
    }
   
    public T first() throws EmptyCollectionException {
        if (isEmpty())
        		throw new EmptyCollectionException("Queue is empty");
        return head.getElement();
    }

    public boolean isEmpty() {
        return count==0;
    }
    public int size() {
        return count;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        LinearNode<T> current = head;
        while (current != null) {
        		s.append(current.getElement());
        		s.append("\n");
        		current = current.getNext();
        }
        return s.toString();
    }
    
    @Override
	public boolean equals(LinkedQueue<T> list) {
		// Lab exercise 1.  Fill in this method.
		return true;
	}

	public LinkedQueue<T> reverse() {
		// Lab exercise 2.  Fill in this method.
		return null;
	}
}
