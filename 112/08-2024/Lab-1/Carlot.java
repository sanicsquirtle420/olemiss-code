/*
08/28/2024
An example of an intermediate object class.
*/
public class Carlot {
    private String lotName ;
    private Vehicle[] lot ;
    private int counter ;

    public Carlot() {
        lotName = "" ;
        lot = new Vehicle[100] ;
        counter = 0 ;
    }
    public Carlot(String name) {
        lotName = name ;
        lot = new Vehicle[100] ;
        counter = 0 ;
    }

    public void setLotName(String name) {
        lotName = name ;
    }

    public String getLotName() {
        return lotName ;
    }
    public void addCarToArray(String color , String make, String model, double cost){
        lot[counter] = new Vehicle(color , make , model , cost) ;
        counter++ ;
    }
    public double avgCost() {
        double total = 0 ;
        for(int i = 0; i < counter; i++) {
            total += lot[i].getCost() ;
        }
        return total / counter ;
    }

    public int getLogicalLength() {
        return counter ; // ADDED: 09/04/2024
    }

    public void printLotInfo() {
        System.out.println("These cars are in lot " + lotName + ":\n") ;
        for(int j = 0 ; j < counter ; j++) {
            System.out.println("\t" + lot[j].toString() + "\n") ;
        }
        System.out.printf("\tThe average cost of the vehicles is $%.2f" , avgCost()) ;
    }
}
