import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PolicyOwnerTest {
    @Test
    void noParamConst() {
        PolicyOwner test = new PolicyOwner() ;
        assertNotNull(test) ;
    }

    @Test
    void ParamConst() {
        PolicyOwner test = new PolicyOwner("a" , "b" , "c" , "d") ;
        assertAll("testing the parameterized constructor" ,
                () -> assertEquals("a" , test.getName()) ,
                () -> assertEquals("b" , test.getAddress()) ,
                () -> assertEquals("c" , test.getCity()) ,
                () -> assertEquals("d" , test.getState())
        ) ;
    }

    @Test
    void setName() {
        PolicyOwner test = new PolicyOwner() ;
        test.setName("test") ;
        assertEquals("test" , test.getName()) ;
    }

    @Test
    void setAddress() {
        PolicyOwner test = new PolicyOwner() ;
        test.setAddress("test") ;
        assertEquals("test" , test.getAddress()) ;
    }

    @Test
    void setCity() {
        PolicyOwner test = new PolicyOwner() ;
        test.setCity("test") ;
        assertEquals("test" , test.getCity()) ;
    }

    @Test
    void setState() {
        PolicyOwner test = new PolicyOwner() ;
        test.setState("test") ;
        assertEquals("test" , test.getState()) ;
    }

    @Test
    void testToString() {
        PolicyOwner test = new PolicyOwner("a" , "b" , "c" , "d") ;
        assertEquals(String.format("Name: a\nAddress: b\nCity / State: c, d") , test.toString()) ;
    }
}
