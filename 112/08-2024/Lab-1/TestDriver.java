/*
08/28/24
This program is used to make sure that CarLot.java and Vehicle.java
work together. 
*/
public class TestDriver {
    public static void main(String[] args) {
        CarLot test = new CarLot() ;

        test.addCarToArray("Blue" , "Honda" , "Civic" , 23999.99) ;
        test.addCarToArray("Maroon", "Jeep"  ,"Cherroke", 9999.98) ;
        test.addCarToArray("Red", "Hyundai" , "Sonata" , 19999.99) ;

        test.printLotInfo();
    }
}
