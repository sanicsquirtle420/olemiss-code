// 04/10/24
import java.util.Scanner ;

public class TriMethod {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in) ;
		
		System.out.print("Enter base: ") ;
		double b = input.nextDouble() ;
		System.out.print("Enter height: ") ;
		double h = input.nextDouble() ;
		
		double t = triangle(b , h) ;
		
		System.out.printf("The area for the triangle is %.2f" , t) ;
	}
	
	public static double triangle(double base , double height) {
		return 1/2.0 * base * height ;
	}
}
