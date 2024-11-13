package edu.olemiss.week12;

public class Generic<T> {
    private T element ;
    private Generic<T> next ;
    private Generic<T> pervious ;

    public Generic() {
        element = null ;
        next = null ;
    }

    public Generic(T element) {
        this.element = element ;
        next = null ;
    }

    public void setElement(T element) {
        this.element = element ;
    }

    public T getElement() {
        return element ;
    }

    public void setNext(Generic<T> n) {
        next = n ;
    }

    public Generic<T> getNext() {
        return next ;
    }

    @Override
    public String toString() {
        return String.format("Generic Element %s --> the Next Element: %s" , element , next) ;
    }
}
