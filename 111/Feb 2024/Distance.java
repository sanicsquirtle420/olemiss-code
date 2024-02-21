/* 

Reference:
Math.pow(a, b) ; = a^b
*/

import java.util.Scanner ;

public class Distance {
	public static void main (String [] args) {
	double x1 , x2 , y1 , y2 , dist ; 			                                   // Declare variables
	
	Scanner input = new Scanner(System.in) ; 
	System.out.print("Enter x1: ");
	x1 = input.nextDouble() ; 
	System.out.print("Enter x2: ");
	x2 = input.nextDouble() ;
	System.out.print("Enter y1: ");
	y1 = input.nextDouble() ;
	System.out.print("Enter y2: ");
	y2 = input.nextDouble() ;			                                              // Ask for inputs for variables
	
	dist = Math.sqrt((Math.pow((x2 - x1),2.0) + Math.pow((y2 - y1),2))) ;       // Calculate distance
	
	System.out.printf("The distance between the two points is %.1f" , dist) ;   // Display the result with 1 decimal place
	}
}
