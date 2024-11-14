import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CycleClubTest {
    @Test
    void noParamConst() {
        CycleClub test = new CycleClub() ;
        assertNotNull(test) ;
    }

    @Test
    void paramConst() {
        CycleClub test = new CycleClub("n" , "t") ;
        assertAll("Testing parametrized constructor" ,
                ()-> assertEquals("n" , test.getTeamName()) ,
                ()-> assertEquals("t" , test.getTeamAbv())
                );
    }

    @Test
    void setTeamName() {
        CycleClub test = new CycleClub() ;
        test.setTeamName("a") ;
        assertEquals("a" , test.getTeamName()) ;
    }

    @Test
    void setTeamAbv() {
        CycleClub test = new CycleClub() ;
        test.setTeamAbv("a") ;
        assertEquals("a" , test.getTeamAbv()) ;
    }

    @Test
    void addRiders() {
        CycleClub test = new CycleClub() ;
        test.addRiders("test" , "" , 0 , 0) ;
        assertNotNull(test.getRider()[0]) ;
    }

    @Test
    void sortRiders() {
        CycleClub test = new CycleClub() ;
        test.addRiders("b" , "b" , 2 , 20) ;
        test.addRiders("a" , "a" , 1 , 10 ) ;
        test.addRiders("c" , "c" , 3 , 15) ;

        test.sortRiders() ;
        assertAll("testing quick sort" ,
                ()-> assertEquals(20 , test.getRider()[0].getLapscomp()) ,
                ()-> assertEquals(3 , test.getRider()[1].getId()) ,
                ()-> assertEquals("a" , test.getRider()[2].getName())
                ) ;
    }

    @Test
    void calcTotalLaps() {
        CycleClub test = new CycleClub() ;
        test.addRiders("test" , "" , 0 , 4) ;
        test.addRiders("test" , "" , 0 , 2) ;
        test.addRiders("test" , "" , 0 , 8) ;

        assertEquals(14 , test.calcTotalLaps()) ;
    }
}