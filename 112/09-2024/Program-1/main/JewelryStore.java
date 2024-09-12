// 09/11/2024
public class JewelryStore {
    private String storeName ;
    private Jewelry[] jewelry ;
    private int count ;

    public JewelryStore() {
        storeName = "" ;
        jewelry = new Jewelry[100] ;
        count = 0 ;
    }

    public JewelryStore(String s) {
        storeName = s ;
        jewelry = new Jewelry[100] ;
        count = 0 ;
    }

    public void setStoreName(String s) {
        storeName = s ;
    }

    public String getStoreName() {
        return storeName ;
    }

    public int getLogicalLength() {
        return count ;
    }

    public void addInventory(String t , String d , double c) {
        jewelry[count] = new Jewelry(t , d , c) ;
        count++ ;
    }

    public String getMostExpensive() {
        double expensive = 0.0 , cost;
        String desc = "" , temp ;

        for(int i = 0 ; i < count ; i++) {
            temp = jewelry[i].getDesc() ;
            cost = jewelry[i].getCost() ;

            if(expensive < cost) {
                expensive = cost ;
                desc = temp ;
            }
        }
        return String.format("%s $%.2f" , desc , expensive) ;
    }
    public double calcAverage() {
        double total = 0.0 ;

        for(int i = 0 ; i < count ; i++) {
            total += jewelry[i].getCost() ;
        }
        return total / count ;
    }

    public void printUnder200() {
        double cost;
        for (int i = 0; i < count; i++) {
            cost = jewelry[i].getCost();
            if(cost < 200) {
                System.out.println(jewelry[i].toString()) ;
            }
        }
    }

    public void printInfo() {
        for(int i = 0 ; i < count ; i++) {
            System.out.println("\t" + jewelry[i].toString()) ;
        }
    }
}
