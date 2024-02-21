/*
01/31/2024
*/
import java.util.Scanner ;                             // In Scanner We Trust

public class ComputeArea {
	public static void main(String [] args) {
		double raidus ;
		double area	;	                                     // Declare variables
		final double PI = 3.1415 ;
		
		Scanner input = new Scanner(System.in) ; 
		System.out.print("Enter the radius: ") ; 
		raidus = input.nextDouble() ;				               // Ask the user for radius
		
  	area = PI * Math.pow(radius, 2) ;                  // Calculate the area
  		
		System.out.println("The area is " + area);         // Display the area
		System.out.printf("The area is %.2f" , area) ;
	}
}
