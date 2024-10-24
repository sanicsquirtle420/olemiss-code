import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TruckTest {
    @Test
    void noParamConst() {
        Truck test = new Truck() ;
        assertNotNull(test) ;
    }

    @Test
    void ParamConst() {
        Truck test = new Truck(45 , 20) ;
        assertAll("testing parameterized constructor" ,
                () -> assertEquals(45 , test.getLength()) ,
                () -> assertEquals(20 , test.getWidth()) ,
                ()-> assertEquals(45*20 , test.getArea())
        ) ;
    }

    @Test
    void setLength() {
        Truck test = new Truck() ;
        test.setLength(45) ;
        assertEquals(45 , test.getLength()) ;
    }

    @Test
    void setWidth() {
        Truck test = new Truck() ;
        test.setWidth(20) ;
        assertEquals(20 , test.getWidth()) ;
    }

    @Test
    void setArea() {
        Truck test = new Truck() ;
        test.setArea(45 , 20) ;
        assertEquals(45*20 , test.getArea()) ;
    }

    @Test
    void testToString() {
        Truck test = new Truck(12 , 34) ;
        assertEquals(String.format("This truck's cargo space has a length of 12, width of 34 with an area of 408") , test.toString());
    }
}