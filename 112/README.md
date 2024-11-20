# Computer Science II (Java II)
Taken: Fall 2024

## Learned
- IntelliJ IDE / JUnit Testing
- Intermediate Classes
- String Manipulation `StringBuilder`
- `ArrayLists` vs Arrays , 2D Arrays
- Sorting (Bubble, Selction, Insertion)
- Searches (Binary)
- Inheritance (Abstract Classes & Interfaces), Polymorphism
- Abstract and Interface classes
- Recursion
- File I/O (reading, writing, and appending to a file)
- Generics

## Final Program
### Sample Output: Lab9Driver.java
```
Node element: 5  Next: null
Node element: Binsa  Next: null
Node element: 4.37  Next: null

Node element: 6  Next: null
Node element: Amir  Next: null
Node element: 36.72  Next: null

Node element: 15  Next: Node element: Stef  Next: null
Node element: Stef  Next: null
```
Lab 9 was to provide familarization with generics. <br>
Source Code: [Lab9Driver.java](https://github.com/sanicsquirtle420/olemiss-code/blob/main/112/11-2024/Lab-9/main/Lab9Driver.java)

### Node.java
```
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
```
Source Code: [Node.java](https://github.com/sanicsquirtle420/olemiss-code/blob/main/112/11-2024/Lab-9/main/Node.java) <br> 
JUnit testing was done for `Node.java` and it can be found at [NodeTest.java](https://github.com/sanicsquirtle420/olemiss-code/blob/main/112/11-2024/Lab-9/test/NodeTest.java)
