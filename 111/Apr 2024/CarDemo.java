/*
04/24/24
Car.java is needed to use the Car class
*/
import java.util.Scanner ;

public class CarDemo {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.print("Enter the make of your car: ") ;
		String m = input.nextLine() ;
		System.out.print("Enter the year model of your car: ") ;
		String y = input.nextLine() ;
		
		Car carOne = new Car(m , y) ; // create a Car object
		
		System.out.printf("You have a %s %s" , carOne.getYearModel() , carOne.getMake()) ;
	}
}
