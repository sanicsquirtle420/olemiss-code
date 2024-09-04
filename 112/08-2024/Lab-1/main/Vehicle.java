/**
08/28/24
An example of a regular object class.
*/
public class Vehicle {
    private String make , model , color;
    private double cost ;

    public Vehicle() {
        color = ""
        make = "" ;
        model = "" ;
        cost = 0.0 ;
    }

    public Vehicle(String col ,String mk , String mo , double c) {
        color = col ;
        make = mk ;
        model = mo ;
        cost = c ;
    }

    public void setColor(String col){
        color = col ;
    }
    public void setMake(String mk) {
        make = mk ;
    }

    public void setModel(String mo) {
        model = mo ;
    }

    public void setCost(double c) {
        cost = c ;
    }

    public String getColor() {
        return color ;
    }
    public String getMake() {
        return make ;
    }

    public String getModel() {
        return model ;
    }
    public double getCost() {
        return cost ;
    }

    public String toString() {
        return String.format("Color: %s, Make: %s, Model: %s, Cost: $%.2f" , color , make , model, cost) ;
    }
}
