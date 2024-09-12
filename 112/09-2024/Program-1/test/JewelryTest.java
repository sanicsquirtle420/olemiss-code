// 09/11/24
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JewelryTest {

    @Test
    void noParam() {
        Jewelry test = new Jewelry() ;
        assertNotNull(test) ;
    }

    @Test
    void ParamConst() {
        Jewelry test = new Jewelry("a" , "b" , 123.45) ;
        assertEquals("a" , test.getType()) ;
        assertEquals("b" , test.getDesc()) ;
        assertEquals(123.45 , test.getCost()) ;
    }

    @Test
    void setType() {
        Jewelry test = new Jewelry() ;
        test.setType("Engagement Ring") ;
        assertEquals("Engagement Ring" , test.getType()) ;
    }

    @Test
    void setDesc() {
        Jewelry test = new Jewelry() ;
        test.setDesc("14k diamond white gold") ;
        assertEquals("14k diamond white gold" , test.getDesc()) ;
    }

    @Test
    void setCost() {
        Jewelry test = new Jewelry() ;
        test.setCost(499.99) ;
        assertEquals(499.99 , test.getCost()) ;
    }

    @Test
    void testToString() {
        Jewelry test = new Jewelry("abc" , "def" , 123.45) ;
        assertEquals("abc\n\tdef\n\t$123.45\n" , test.toString()) ;
    }
}
