public class Program3Driver {
    public static void main(String[] args) {
        Vehicle[] veh = new Vehicle[4] ;

        veh[0] = new Vehicle(false , 4 , 4) ;
        veh[1] = new Truck(false , 4 , 5 , 15 , 20) ;
        veh[2] = new EighteenWheeler(false , 18 , 2 , 50 , 20 , "diesel" , true) ;
        veh[3] = new Sedan(false , 4 , 6 , "blue" , "leather" , true) ;

        for(int i = 0 ; i < veh.length ; i++) {
            veh[i].printData() ;
            System.out.println() ;
        }
    }
}
