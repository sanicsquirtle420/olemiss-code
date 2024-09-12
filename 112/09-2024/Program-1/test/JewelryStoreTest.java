// 09/11/24
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JewelryStoreTest {
    @Test
    void noParam() {
        JewelryStore test = new JewelryStore() ;
        assertNotNull(test) ;
    }

    @Test
    void ParamConst() {
        JewelryStore test = new JewelryStore("Test") ;
        assertEquals("Test" , test.getStoreName()) ;
    }

    @Test
    void getStoreName() {
        JewelryStore test = new JewelryStore("test") ;
        assertEquals("test" , test.getStoreName()) ;
    }

    @Test
    void addInventory() {
        JewelryStore test = new JewelryStore() ;
        test.addInventory("a" , "b" , 123.45) ;
        assertEquals(1 , test.getLogicalLength()) ;
    }

    @Test
    void getMostExpensive() {
        JewelryStore test = new JewelryStore() ;
        test.addInventory("a" , "b" , 999.99) ;
        test.addInventory("c" , "d" , 123.45);

        assertEquals("b $999.99" , test.getMostExpensive()) ;
    }

    @Test
    void calcAverage() {
        JewelryStore test = new JewelryStore() ;
        test.addInventory("" , "" , 123.45);
        test.addInventory("" , "" , 234.56);
        test.addInventory("" , "" , 345.67);

        assertEquals((123.45+234.56+345.67)/3 , test.calcAverage()) ;
    }
}
