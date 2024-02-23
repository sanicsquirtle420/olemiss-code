/*
02/23/2024
Program Description: This program asks the user for number of packages to determine the type of discount they get.
*/
import java.util.Scanner ; // import statement

public class SoftwareSales { 	// class header
	public static void main(String [] args) {	// main method header
		double pkgs , before , after , discount ; 	// declare variables
		
		Scanner input = new Scanner(System.in) ; 	
		System.out.print("Enter the number of packages purchased: ") ; 	
		pkgs = input.nextDouble() ; 
		
		Scanner input2 = new Scanner(System.in) ; 	 	// instantiate a Scanner object
		System.out.print("Payment before discount: $") ; 	// prompt for input
		before = input2.nextDouble() ; 
		
		
		if (pkgs <= 9) {
			after = before ;
			discount = 0.00 ; 
			System.out.printf("Payment after discount :$%.2f" , after) ; 
			System.out.printf("\nDiscount: $%.2f" , discount) ; 
		}
		
		else if (pkgs <= 19) {
			after = before * 0.20 ;
			discount =  after ; 
			after = before - after ;
			System.out.printf("Payment after discount :$%.2f" , after) ; 
			System.out.printf("\nDiscount: $%.2f" , discount) ; 
		}
		
		else if (pkgs <= 49) {
			after = before * 0.30 ;
			discount =  after ; 
			after = before - after ;
			System.out.printf("Payment after discount :$%.2f" , after) ; 
			System.out.printf("\nDiscount: $%.2f" , discount) ;
		}
		
		else if (pkgs <= 99) {
			after = before * 0.40 ;
			discount =  after ; 
			after = before - after ;
			System.out.printf("Payment after discount :$%.2f" , after) ; 
			System.out.printf("\nDiscount: $%.2f" , discount) ;
		}
		
		else if (pkgs >= 100) {
			after = before * 0.50 ;
			discount =  after ; 
			after = before - after ;
			System.out.printf("Payment after discount :$%.2f" , after) ; 
			System.out.printf("\nDiscount: $%.2f" , discount) ; // display the output (2 decimal places)
		}
	}
}
