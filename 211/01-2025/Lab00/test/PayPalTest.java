// 01-22-2025
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PayPalTest {
    /** Constructors */
    @Test
    public void noArgConst() {
        PayPal test = new PayPal() ;
        assertNotNull(test) ;
    }

    @Test
    public void overloadConst1() throws NegativeAmountException, MaximumAmountException {
        // Valid value
        PayPal test = new PayPal(428.44) ;
        assertTrue(test.isPay(test.getAmount())) ;
    }

    @Test
    public void overloadConst2() {
        // Negative value
        assertThrows(NegativeAmountException.class, ()-> {
            PayPal test = new PayPal(-4.44) ;
        }) ;
    }

    @Test
    public void overloadConst3() {
        // Value over 3000
        assertThrows(MaximumAmountException.class, ()-> {
            PayPal test = new PayPal(3001.23) ;
        }) ;
    }

    /** Methods */
    @Test
    public void setPayPal1() throws NegativeAmountException, MaximumAmountException {
        // Valid value
        PayPal test = new PayPal() ;
        test.setAmount(4.28) ;

        assertTrue(test.isPay(test.getAmount())) ;
    }

    @Test
    public void setPayPal2() {
        // Negative value
        assertThrows(NegativeAmountException.class, ()-> {
            PayPal test = new PayPal() ;
            test.setAmount(-4.44) ;
        }) ;
    }

    @Test
    public void setPayPal3() {
        // Value over 3000
        assertThrows(MaximumAmountException.class, ()-> {
            PayPal test = new PayPal() ;
            test.setAmount(3001.23) ;
        }) ;
    }
}
