import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RidersTest {
    @Test
    void noParamConst() {
        Riders test = new Riders() ;
        assertNotNull(test) ;
    }

    @Test
    void paramConst() {
        Riders test = new Riders("n" , "t" , 1 , 2) ;
        assertAll("Testing parametrized constructor" ,
                ()-> assertEquals("n" , test.getName()) ,
                ()-> assertEquals("t" , test.getTown()) ,
                ()-> assertEquals(1 , test.getId()) ,
                ()-> assertEquals(2 , test.getLapscomp())
        ) ;
    }

    @org.junit.jupiter.api.Test
    void setName() {
        Riders test = new Riders() ;
        test.setName("n") ;
        assertEquals("n" , test.getName()) ;
    }

    @org.junit.jupiter.api.Test
    void setTown() {
        Riders test = new Riders() ;
        test.setTown("t"); ;
        assertEquals("t" , test.getTown()) ;
    }

    @org.junit.jupiter.api.Test
    void setLapscomp() {
        Riders test = new Riders() ;
        test.setLapscomp(1); ;
        assertEquals(1 , test.getLapscomp()) ;
    }

    @org.junit.jupiter.api.Test
    void setId() {
        Riders test = new Riders() ;
        test.setId(1); ;
        assertEquals(1 , test.getId()) ;
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Riders test = new Riders("n" , "t" , 1 , 2) ;
        assertEquals(String.format("Name: %-20s  From: %18s, ID#: %d - Laps Completed: %d",
                test.getName() , test.getTown() , test.getId() , test.getLapscomp()) , test.toString());
    }
}