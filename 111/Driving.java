import java.util.Scanner ; 

public class Driving {
	public static void main (String [] args) {	// import statement(s), class header, and main method header
		double dist , mi , gal , cost ;		// declare variables for the inputs and output
		
		Scanner input = new Scanner(System.in) ;
		System.out.print("Enter the driving distance: ") ;
		dist = input.nextDouble () ;
		System.out.print("Enter miles per gallon: ") ;
		mi = input.nextDouble () ;
		System.out.print("Enter price per gallon: ") ;
		gal = input.nextDouble () ;	 // prompt for inputs
		
		cost = (dist / mi) * gal ;	 // calculate cost of driving
		
		System.out.printf("\nThe cost of driving is $%.2f" , cost) ; 	// display the output (2 decimal places)
	}
}



