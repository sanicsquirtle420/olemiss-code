/*
02/12/2024
*/
import java.util.Scanner ; 

public class Acceleration {
	public static void main (String [] args) {
		double v0, v1 , t , acc ;
		
		Scanner input = new Scanner(System.in) ; 
		System.out.print("Enter starting velocity: ") ;
		v0 = input.nextDouble() ; 
		System.out.print("Enter ending velocity: ") ;
		v1 = input.nextDouble() ;
		System.out.print("Enter the time: ") ;
		t = input.nextDouble() ;
		
		acc = (v1 - v0) / t ;
		
		System.out.printf("The acceleration is %.2f" , acc) ;
		
	}
}
