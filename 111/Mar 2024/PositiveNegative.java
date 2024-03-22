/*
03/22/24
Program Description: This program calculates the average of integers while also keeping 
track of how many integers are positive or negative.
*/
import java.util.Scanner ; // import statement(s), class header, and main method header

public class PositiveNegative {
	public static void main(String [] args) {
		int count = 0 , num = 0 , posNum = 0 , negNum = 0 , total = 0 ; 
		double average ; 	// declare variable
		
		Scanner input = new Scanner(System.in) ;	// prompt for input
		System.out.print("Enter a positive or negative integer (Type 0 to exit): ") ;
		num = input.nextInt() ;
			
		while (num != 0) { 
			if (num > 0) { 
				total += num ;
				posNum++ ;
				count++ ;
			}
			
			else if (num < 0) {
				total += num ; 
				negNum++ ;
				count++ ;
			}
			
			System.out.print("Enter a positive or negative integer (Type 0 to exit): ") ;
			num = input.nextInt() ;
		} 
		average = total / (double)count ;	// process
		
		System.out.printf("\nNumber of positive integers entered: %d" , posNum) ;
		System.out.printf("\nNumber of negative integers entered: %d\n" , negNum) ;
		System.out.printf("\nThe total is %d and the average is %.2f" , total , average) ; // display the output
	}
}
