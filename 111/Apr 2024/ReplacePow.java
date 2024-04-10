/*
04/10/24
This program has a method that works similar to
"Math.pow". 
*/
import java.util.Scanner ;

public class ReplacePow {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.print("Enter the base: ") ;
		int b = input.nextInt() ;
		System.out.print("Enter the exponent: ") ;
		int e = input.nextInt() ;
		
		double r = pow(b , e) ;
		
		System.out.printf("The result is %.3f" , r) ;
	}
	
	public static double pow(int base , int exp) {
		double result = 1.0 ; 
		
		if (exp > 0) {
			for (int i = 0 ; i < exp ; i++) {
				result *= base ;
			}
		}
		
		else if (exp < 0) {
			for (int i = 0 ; i > exp ; i--) {
				result /= base ;
			}
		}
		return result ;
	}
}
