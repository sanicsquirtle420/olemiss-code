import java.io.FileNotFoundException;

public class LP4Driver {

    public static void main(String[] args) throws FileNotFoundException {

        BikeEvent event = new BikeEvent("Pedal Power");

        event.readData() ;

        event.sortData();

        event.printData();
        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println("Thank you for riding with us, good-bye and have a great day!");
    }
}
