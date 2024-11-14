import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeEventTest {
    @Test
    void noParamConst() {
        BikeEvent test = new BikeEvent() ;
        assertNotNull(test) ;
    }

    @Test
    void paramConst() {
        BikeEvent test = new BikeEvent("e") ;
        assertAll("Testing parameterized constructor" ,
                ()-> assertEquals("e" , test.getEventName())
        ) ;
    }

    @Test
    void setEventName() {
        BikeEvent test = new BikeEvent() ;
        test.setEventName("e") ;
        assertEquals("e" , test.getEventName()) ;
    }
}
