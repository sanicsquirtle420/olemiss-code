// 01-22-2025

public class PayPal {
    private double amount ;

    /** Constructors */
    public PayPal() {
        amount = 0 ;
    }

    public PayPal(double amount) throws NegativeAmountException, MaximumAmountException {
        if(amount < 0) {
            this.amount = 0 ;
            throw new NegativeAmountException(amount) ;
        }
        if(amount > 3000) {
            this.amount = 3000 ;
            throw new MaximumAmountException(amount) ;
        }

        this.amount = amount ;
    }

    /** Methods */
    public void setAmount(double amount) throws NegativeAmountException, MaximumAmountException {
        if(amount < 0) {
            this.amount = 0 ;
            throw new NegativeAmountException(amount) ;
        }
        if(amount > 3000) {
            this.amount = 3000 ;
            throw new MaximumAmountException(amount) ;
        }

        this.amount = amount ;
    }

    public double getAmount() {
        return amount ;
    }

    public boolean isPay(double amount) {
        if(amount < 0) {
            return false ;
        }
        if(amount > 3000) {
            return false ;
        }

        return true ;
    }

    @Override
    public String toString() {
        return String.format("A payment of %.2f was made." , this.getAmount()) ;
    }
}
