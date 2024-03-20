/*
03/20/24
Solves for the average of the inputs given and
having '-1' as a sentinel value to end the loop
*/
import java.util.Scanner ; 

public class AverageSenVal {
	public static void main(String [] args) {
		int num ; 
		int total = 0 , count = 0 ; // accumulators
		double average ; 
		
		Scanner input = new Scanner(System.in) ;
		System.out.print("Enter a number (Type '-1' to exit) ") ; 
		num = input.nextInt() ; 
		
		while (num != -1) {
			total += num ; // adds inputs together
			count++ ;  // increases the count by 1
			System.out.print("Enter a number (Type '-1' to exit) ") ; 
			num = input.nextInt() ;
		}
		
		average = total / (double)count ;
		System.out.printf("The average is %.2f" , average) ; 
	}
}
