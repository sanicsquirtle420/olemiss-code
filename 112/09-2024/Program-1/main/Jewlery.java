// 09/11/24
public class Jewelry {
    private String type , desc ;
    private double cost ;

    public Jewelry() {
        type = "" ;
        desc = "" ;
        cost = 0.0 ;
    }

    public Jewelry(String t , String d , double c) {
        type = t ;
        desc = d ;
        cost = c ;
    }

    public void setType(String t) {
        type = t ;
    }

    public void setDesc(String d) {
        desc = d ;
    }

    public void setCost(double c) {
        cost = c ;
    }

    public String getType() {
        return type ;
    }

    public String getDesc() {
        return desc ;
    }

    public double getCost() {
        return cost ;
    }

    public String toString() {
        return String.format("%s\n\t%s\n\t$%.2f\n" , type , desc , cost) ;
    }
}
