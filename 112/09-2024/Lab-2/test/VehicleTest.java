/*
09/04/2024
This file requires Carlot.java and Vehicle.java to
be in .../Lab-2/main/* 
*/
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    @Test
    void paramConstructors() {
        Vehicle test = new Vehicle("Blue", "Honda" , "Civic" , 12345.99) ;
        assertEquals("Honda" , test.getMake()) ;
        assertEquals("Civic" , test.getModel()) ;
        assertEquals("Blue" , test.getColor()) ;
        assertEquals(12345.99 , test.getCost()) ;
    }

    @Test
    void noPara() {
        Vehicle test = new Vehicle() ;
        assertNotNull(test) ;
    }

    @Test
    void testToString() {
        Vehicle test = new Vehicle("Blue", "Honda" , "Civic" , 12345.99) ;
        assertEquals("Color: Blue, Make: Honda, Model: Civic, Cost: $12345.99" , test.toString()) ;
    }
}
