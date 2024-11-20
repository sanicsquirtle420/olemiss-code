public class Node<T> {
    private T element ;
    private Node<T> next ;

    public Node() {
        element = null ;
        next = null ;
    }

    public Node(T elem) {
        element = elem ;
        next = null ;
    }

    public void setElement(T elem) {
        element = elem ;
    }

    public void setNext(Node<T> n) {
        next = n ;
    }

    public T getElement() {
        return element ;
    }

    public Node<T> getNext() {
        return next ;
    }

    @Override
    public String toString() {
        return String.format("Node element: %s\tNext: %s" , element , next) ;
    }
}
