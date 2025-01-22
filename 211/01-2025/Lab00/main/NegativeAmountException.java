// 01-22-2025

public class NegativeAmountException extends Exception {
    public NegativeAmountException(double amount) {
        super(amount + " is a negative amount!\nYou can not make this payment.") ;
    }
}
