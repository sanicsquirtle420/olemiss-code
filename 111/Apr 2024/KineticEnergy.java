// 04/08/24
import java.util.Scanner ;

public class KineticEnergy {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in) ;
		
		System.out.print("Enter mass: ") ;
		double m = input.nextDouble() ;
		System.out.print("Enter velocity: ") ;
		double v = input.nextDouble() ;
		
		double r = kinetic(m , v) ;
		
		System.out.printf("The kinetic energy is %.2f" , r) ;
	}
	
	public static double kinetic(double m , double v) {
		double result ;
		result = 1.0 / 2 * m * Math.pow(v , 2) ;
		return result ;
	}
}
