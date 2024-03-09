/*
03/08/2024
Program Description: This program asks users for a medium and will calculate how long it 
will take to travel that distance.
*/
import java.util.Scanner ; // import statement(s), class header, and main method header

public class SoundSpeed {
	public static void main (String [] args) {
		double time , distance ; 
		int medium ; // declare variables for the inputs and output
		
		Scanner input = new Scanner(System.in) ; // prompt for inputs
		System.out.print("Enter the medium (1 for air, 2 for water, and 3 for steel: ") ; 
		medium = input.nextInt() ; 
		
		if (medium <= 0 || medium >= 4)  // process
			System.out.println("Invalid input, enter only 1 - 3 !") ;
		
		else if (medium >= 1 || medium <= 3) {
			switch(medium) {
			case 1:
				Scanner input2 = new Scanner(System.in) ; 
				System.out.print("Enter the distance in ft: ") ;
				distance = input2.nextDouble() ;
				time = distance / 1100.0 ;
				System.out.printf("Time needed is %.2f seconds." , time) ;
				break ;
			case 2:
				Scanner input3 = new Scanner(System.in) ; 
				System.out.print("Enter the distance in ft: ") ;
				distance = input3.nextDouble() ;
				time = distance / 4900.0 ;
				System.out.printf("Time needed is %.2f seconds." , time) ;
				break ;
			case 3:
				Scanner input4 = new Scanner(System.in) ; 
				System.out.print("Enter the distance in ft: ") ;
				distance = input4.nextDouble() ;
				time = distance / 16400.0 ;
				System.out.printf("Time needed is %.2f seconds." , time) ; // display the output (2 decimal places)
				break ;
			}
		}
	}
}
