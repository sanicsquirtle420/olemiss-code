import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {
    @Test
    void noParamConst() {
        Node<Integer> test = new Node<>() ;
        assertNotNull(test) ;
    }

    @Test
    void paramConst() {
        Node<Integer> test = new Node<>(428) ;
        assertAll("Testing parametrized constructor" ,
                ()-> assertEquals(428 , test.getElement()) ,
                ()-> assertEquals(null , test.getNext())
        ) ;
    }

    @org.junit.jupiter.api.Test
    void setElement() {
        Node<Integer> test = new Node<>() ;
        test.setElement(428) ;
        assertEquals(428 , test.getElement()) ;
    }

    @Test
    void setNext() {
        Node<Integer> test = new Node<>(4) ;
        test.setNext(new Node<>(5)) ;
        assertEquals(String.format("Node element: 4\tNext: Node element: 5\tNext: null") , test.toString()) ;
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Node<Integer> test = new Node<>(428) ;
        assertEquals("Node element: 428\tNext: null" , test.toString()) ;
    }
}