/* 
02/07/2024
Notes:
printf = print with a format
'%.2f' is used to ensure there is only 2 decimal places after the double
*/

import java.util.Scanner ; 

public class Average {
	public static void main (String [] args) {
		int num1 , num2;
		double average ;                                          // Declare Variables
		
		Scanner input = new Scanner(System.in) ;
		System.out.print("Enter 1st integer: ") ;
		num1 = input.nextInt();
		System.out.print("Enter 2nd integer: ") ;
		num2 = input.nextInt();						                        // Ask for integers
		
		average = ((num1 + num2) / 2.0);				                  // Calculate average
		
		System.out.printf("The average is %.2f" , average);       // Displays Output 
	}
}
