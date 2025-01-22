// 01-22-2025
import java.io.FileNotFoundException;
import java.util.Scanner ;
import java.io.File ;

public class PayPalDriver {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("transactions.txt")) ;
        PayPal mobile = new PayPal() ;

        while(scan.hasNextLine()) {
            try {
                double money = scan.nextDouble() ;
                mobile.setAmount(money) ;
                if(mobile.isPay(money)) {
                    System.out.println(mobile);
                }
            } catch(MaximumAmountException e) {
                System.out.println(e.getMessage()) ;
            } catch(NegativeAmountException e) {
                System.out.println(e.getMessage()) ;
            }
        }
    }
}
