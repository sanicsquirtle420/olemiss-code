// Apr 09, 2025
public class Cryptocurrency implements CryptocurrencyADT {
    private DoubleList<Coin> blockchain;

    public Cryptocurrency() {
        blockchain = new DoubleList<Coin>() ;
    }

    public DoubleList<Coin> getBitcoins() {
        return blockchain ;
    }

    public void buy(Coin c) {
        blockchain.add(c) ;
        c.hashValue(new DoubleNode<>()) ;
    }
}
