// 04/17/2025
import java.util.Base64;

public class Cryptocurrency_11 implements CryptocurrencyADT{
    DoubleList<Coin> blockchain;

    public Cryptocurrency_Lab11() {
        blockchain = new DoubleList<>();
    }
  
  /* getBitcoin() and buy() methods are in Lab 10 file */

    public boolean sell(String key) {
        DoubleNode<Coin> current = blockchain.getFront() ;

        while(current != null) {
            String tmp = current.getElement().getPrivateKey() ;
            if(tmp.equals(key)) {
                blockchain.remove(current.getElement()) ;
                return true ;
            }
            current = current.getNext() ;
        }

        return false;
    }

    public String toString() {
        String output = "";
        DoubleNode<Coin> current = blockchain.getFront() ;
        while(current != null) {
            String tmp = current.getElement().getPrivateKey() ;
            byte[] hash = Base64.getDecoder().decode(tmp) ;
            tmp = new String(hash) ;
            tmp = tmp.substring(tmp.indexOf('.') + 1) ;
            output += tmp + "\n" ;
            current = current.getNext() ;
        }

        return output;
    }
}
