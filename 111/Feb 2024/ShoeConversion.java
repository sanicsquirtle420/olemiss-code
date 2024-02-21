/*
02/12/2024
*/
import java.util.Scanner ;

public class ShoeConversion {
	public static void main (String [] args) {
		double foot, euro ;
		
		Scanner input = new Scanner (System.in) ;
		System.out.print("Enter your foot size in inches ");
		foot = input.nextDouble() ;
		foot = foot * 2.54 ;
		
		euro = (3/2.0) * (foot + 1.5) ;
		
		System.out.printf("Your European shoe size is %d" , (int)euro) ; 
	}
}
