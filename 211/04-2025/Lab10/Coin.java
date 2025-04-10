// Apr 09, 2025
import java.util.Base64;
public class Coin {
    private double value;
    private String password;
    private String privateKey;
    private String publicKey;
    private Coin address;

    public Coin(double value, String password) {
        setValue(value) ;
        this.password = password ;
        address = this ;
    }

    public void setValue(double value) throws InvalidCryptocurrencyException{
        if(value < 0) {
            throw new InvalidCryptocurrencyException("Value can not be negative") ;
        }
        this.value = value ;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public Coin getAddress() {
        return this.address;
    }

    public void hashValue(DoubleNode<Coin> hashNode) {
        String tmp = hashNode + "." + password ;
        byte[] hash = Base64.getEncoder().encode(tmp.getBytes()) ;
        privateKey = new String(hash) ;
        publicKey = privateKey.substring(privateKey.length() -5, privateKey.length()) ;

    }

    public String toString() {
        return "[Value: " + value + "  Private Key: " + privateKey + "  Public Key: " + publicKey + "]";
    }

}
