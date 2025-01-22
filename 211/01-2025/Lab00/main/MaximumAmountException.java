// 01-22-2025

public class MaximumAmountException extends Exception {
    public MaximumAmountException(double amount) {
        super(amount + " is over the maximum amount!\nYou can not make payments over $3000.") ;
    }
}
