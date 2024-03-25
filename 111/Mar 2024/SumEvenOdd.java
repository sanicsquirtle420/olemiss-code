// 03/25/24
import java.util.Scanner ;

public class SumEvenOdd {
	public static void main(String [] args) {
		int num , sumEven = 0 , sumOdd = 0 ; 
		
		Scanner input = new Scanner(System.in) ;
		System.out.print("Enter a number (Enter -1 to exit): ") ;
		num = input.nextInt() ; 
		
		while (num != -1) {
			if (num % 2 == 0)
				sumEven += num ;
				
			else
				sumOdd += num ;
			
			System.out.print("Enter a number (Enter -1 to exit): ") ;
			num = input.nextInt() ;
		}
		System.out.printf("Sum of Even numbers is %d and sum of odd numbers is %d." , sumEven , sumOdd) ;
	}
}
