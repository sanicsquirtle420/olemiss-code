/*
09/04/2024
I have personal beef with the intellij dependencies.
Yes I will accept the fact that they made this work easier,
but that isn't enough to get rid of my hate for how weird
their software is. If this code doesn't work for anyone else
I blame the import statements.
*/
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarlotTest {
    @Test
    void noParam() {
        Carlot test = new Carlot() ;
        assertNotNull(test) ;
    }

    @Test
    void ParamConditions() {
        Carlot test = new Carlot("One") ;
        assertEquals("One" , test.getLotName()) ;
    }

    @Test
    void setLotName() {
        Carlot test = new Carlot() ;
        test.setLotName("Two") ;
        assertEquals("Two" , test.getLotName()) ;
    }

    @Test
    void addVehicle() {
        Carlot test = new Carlot() ;
        test.addCarToArray("A" , "B" , "C" , 1); ;
        assertEquals(1 , test.getLogicalLength()) ;

    }

    @Test
    void calcAverageCost() {
        Carlot test = new Carlot() ;
        test.addCarToArray("a" , "b" , "c" , 20000); ;
        test.addCarToArray("d" , "e" , "f" , 10000); ;
        assertEquals(15000 , test.avgCost()) ;
    }
}
