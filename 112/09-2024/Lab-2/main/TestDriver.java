/*
UPDATED: 09/04/2024
This program is used to make sure that CarLot.java and Vehicle.java
work together. Both of those .java files should be in the
.../src/main/java folder for this to program to run properly.
*/
public class TestDriver {
    public static void main(String[] args) {
        Carlot test = new Carlot() ;

        test.addCarToArray("Blue" , "Honda" , "Civic" , 12345.99) ;
        test.addCarToArray("Maroon", "Jeep"  ,"Cherroke", 23456.98) ;
        test.addCarToArray("Red", "Hyundai" , "Sonata" , 34567.97) ;

        test.printLotInfo() ;
    }
}
