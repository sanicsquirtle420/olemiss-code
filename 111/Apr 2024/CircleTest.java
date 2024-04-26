/*
04/26/2024
Program Description: This program is used to test the Circle class. 
*/
import java.util.Scanner ;

public class CircleTest {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.print("Enter the radius of the circle: ") ;
		double r = input.nextDouble() ; 
		
		Circle myCircle = new Circle(r) ;
		
		double a = myCircle.getArea() ; 
		double d = myCircle.getDiameter() ;
		double c = myCircle.getCircumference() ;
		
		System.out.printf("\nThe area of the circle is: %.2f" , a) ;
		System.out.printf("\nThe diameter of the circle is: %.2f" , d) ;
		System.out.printf("\nThe circumference of the circle is: %.2f" , c) ;
	}
}
