/* 10/02/24
I <3 junit testing */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MembersTest {
    @Test
    void noParamConst() {
        Members test = new Members() ;
        assertNotNull(test) ;
    }

    @Test
    void ParamConst() {
        Members test = new Members("Diego" , "12345" , "Soph" , "Flowood, MS") ;
        assertAll("testing parameterized constructor..." ,
                () -> assertEquals("Diego" , test.getName()) ,
                () -> assertEquals("12345" , test.getID()) ,
                () -> assertEquals("Soph" , test.getClassification()) ,
                () -> assertEquals("Flowood, MS" , test.getHometown())
        ) ;
    }

    @org.junit.jupiter.api.Test
    void setName() {
        Members test = new Members() ;
        test.setName("Jake") ;

        assertEquals("Jake" , test.getName()) ;
    }

    @org.junit.jupiter.api.Test
    void setId() {
        Members test = new Members() ;
        test.setId("23456") ;

        assertEquals("23456" , test.getID());
    }

    @org.junit.jupiter.api.Test
    void setClassification() {
        Members test = new Members() ;
        test.setClassification("Soph");

        assertEquals("Soph" , test.getClassification());
    }

    @org.junit.jupiter.api.Test
    void setHometown() {
        Members test = new Members() ;
        test.setHometown("Brandon, MS");

        assertEquals("Brandon, MS" , test.getHometown());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Members test = new Members("Jake" , "23456" , "Soph" , "Brandon, MS") ;

        assertEquals(String.format("%16s, ID Number: %s, is a %9s from %s: ", test.getName(), test.getID(), test.getClassification(), test.getHometown()) , test.toString()) ;
    }
}
