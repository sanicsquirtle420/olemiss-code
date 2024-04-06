/*
04/05/2024
Program Description: This program calculates the amount in a savings account after a certain amount 
of months and interest rate given by the user. 
*/
import java.util.Scanner ; // import statement(s), class header, and main method header

public class AccountLoop {
	public static void main(String [] args) {
		int monthSavings , months ;
		double calcValue = 0.0 , interest ; // declare variables
		
		Scanner input = new Scanner(System.in) ;
		System.out.print("Enter your monthly saving amount: ") ;
		monthSavings = input.nextInt() ; 
		System.out.print("Enter annual interest rate (e.g. enter 5 for 5%): ") ;
		interest = input.nextDouble() ; 
		System.out.print("Enter the number of months you want to save: ") ;
		months = input.nextInt() ; 	// prompt for inputs
		
		interest = ((interest / 100) / 12.0) ;
		
		for (int count = 1 ; count <= months ; count++) { 
			if (count == 1) 
				calcValue = monthSavings * (1 + interest) ;
			else 
				calcValue = (monthSavings + calcValue) * (1 + interest) ;
		} // for loop to calculate account value after that many months
		 
		System.out.printf("The value in your account after %d months is: $%.2f" , months , calcValue) ; // display the output (2 decimal places)
	}
}
