import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SedanTest {
    @Test
    void noParamConst() {
        Sedan test = new Sedan() ;
        assertNotNull(test) ;
    }

    @Test
    void ParamConst() {
        Sedan test = new Sedan("a" , "b" , false) ;
        assertAll("testing parameterized constructor" ,
                ()-> assertEquals("a" , test.getColor()) ,
                ()-> assertEquals("b" , test.getWheelMaterial()) ,
                ()-> assertEquals(false , test.isHeatedSeats())
        ) ;
    }

    @Test
    void setColor() {
        Sedan test = new Sedan() ;
        test.setColor("a") ;
        assertEquals("a" , test.getColor()) ;
    }

    @Test
    void setWheelMaterial() {
        Sedan test = new Sedan() ;
        test.setWheelMaterial("b") ;
        assertEquals("b" , test.getWheelMaterial()) ;
    }

    @Test
    void setHeatedSeats() {
        Sedan test = new Sedan() ;
        test.setHeatedSeats(false) ;
        assertEquals(false , test.isHeatedSeats()) ;
    }

    @Test
    void testToString() {
        Sedan test = new Sedan("a" , "b" , false) ;
        assertEquals("This sedan is a, has a b wheel, and it does not have heated seats" , test.toString()) ;
    }
}