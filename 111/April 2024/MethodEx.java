/*
04/03/24
Learned about 'methods' and how to call a method to reduce
the amount of repetition in the code.
*/
import java.util.Scanner ;

public class MethodEx {
	public static void main(String [] args) {
		int minNum , maxNum , s ;
		
		Scanner input = new Scanner (System.in) ;
		System.out.print("Enter the minimum integer: ") ;
		minNum = input.nextInt() ;
		System.out.print("Enter the maximum integer: ") ;
		maxNum = input.nextInt() ;
		
		s = sum(minNum , maxNum) ; // call the sum method
		
		System.out.printf("The sum is %d." , s) ;
	}
	
	public static int sum(int i1 , int i2) {	// sum method
		int s = 0 ;
		for (int i = i1 ; i <= i2 ; i++) {
			s += i ; 
		}
		return s ;
	}
}
