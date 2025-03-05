// Author: Java Foundations
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

public class LinkedUnorderedList<T> extends LinkedList<T> 
implements UnorderedListADT<T>
{
	public LinkedUnorderedList() {
	  super();
	}

	public LinearNode<T> getListHead() {
		return head;
	}

	public void addToFront(T element) {
        LinearNode<T> newNode  = new LinearNode<T>(element);
        
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
		    }
      
        count++;
		    modCount++;
	}

	public void addToRear(T element) {
        LinearNode<T> newNode  = new LinearNode<T>(element);
		
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
		    }
				
        count++;
		    modCount++;
	}

	public void addAfter(T element, T target) {
    if (isEmpty())
			throw new ElementNotFoundException("LinkedUnorderedList");
		
		boolean found = false;
		LinearNode<T> current = head;
		LinearNode<T> newNode = new LinearNode<T>(element);
		
        while (current != null && !found) {
            if (target.equals(current.getElement())) {
                found = true;
            } else {
                current = current.getNext();	
            }
		
		if (!found)
			throw new ElementNotFoundException("LinkedUnorderedList");
		
		newNode.setNext(current.getNext());
		current.setNext(newNode);
		
    count++;
		modCount++;
	}
	
	public String toString() {
		String output = "";
		LinearNode<T> current = head;
		while (current != null) {
			output += current.getElement();
			current = current.getNext();
		}
		return output;
	}
}
