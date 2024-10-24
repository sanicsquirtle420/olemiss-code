import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EighteenWheelerTest {
    @Test
    void noParamConst() {
        EighteenWheeler test = new EighteenWheeler() ;
        assertNotNull(test) ;
    }

    @Test
    void ParamConst() {
        EighteenWheeler test = new EighteenWheeler("a" , true) ;
        assertAll("testing parametrized constructor" ,
                ()-> assertEquals("a" , test.getFuelType()) ,
                ()-> assertEquals(true , test.isCooler())
        ) ;
    }

    @Test
    void setFuelType() {
        EighteenWheeler test = new EighteenWheeler() ;
        test.setFuelType("a") ;
        assertEquals("a" , test.getFuelType()) ;
    }

    @Test
    void setCooler() {
        EighteenWheeler test = new EighteenWheeler() ;
        test.setCooler(true) ;
        assertEquals(true , test.isCooler()) ;
    }

    @Test
    void testToString() {
        EighteenWheeler test = new EighteenWheeler("a" , true) ;
        assertEquals("This 18 wheeler uses a and does have a cooler" , test.toString()) ;
    }
}
