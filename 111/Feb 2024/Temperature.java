/*
02/12/2024
Notes:
'(int)fah' is needed to force fah to convert to an integer.
*/
import java.util.Scanner ;

public class Temperature {
	public static void main (String [] args) {
		double cel , fah ;
		
		Scanner input = new Scanner(System.in) ; 
		System.out.print("Enter the celsius degree: ") ;
		cel = input.nextDouble() ; 
		
		fah = ( (9/5.0) * cel + 32) ;
		
		System.out.printf("The fahrenheit degree is %d" , (int)fah) ;
	}
}
